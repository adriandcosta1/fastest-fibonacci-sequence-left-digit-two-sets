import java.math.*;
import java.util.*;
public class Fibo{
 private static Map<Integer, BigInteger> memo = new HashMap<>();

public static BigInteger fibonacci3(int n) {
    if (n == 0 || n == 1) {
        return BigInteger.ONE;
    }
    if (memo.containsKey(n)) {
        return memo.get(n);
    }
    BigInteger v = fibonacci3(n - 2).add(fibonacci3(n - 1));
    memo.put(n, v);
    return v;
}


 public static void main(String args[]) {
int anInt;

BigInteger temp;

BigInteger t;
       

int[] left1 = new int[]{1,4,8, 9};
int[] left2 = new int[]{2,3,5,6,7};

//long i;
int j = 2000;
long count1 = 0;
long count2 = 0;
for(int r=0; r < j;++r){
	t = fibonacci3(r);
    temp = t;
    while(temp.compareTo(BigInteger.valueOf(10))>0){
    	temp=temp.divide(BigInteger.valueOf(10));}
    	anInt = temp.intValue();
    	if(Arrays.binarySearch(left1, anInt)>=0) ++count1;
    	if(Arrays.binarySearch(left2, anInt) >= 0) ++count2;
   }

System.out.println("The probability of set1 is : " + count1 + "/" + j);
System.out.println("The probability of set2 is : " + count2 + "/" + j);


}
    } 