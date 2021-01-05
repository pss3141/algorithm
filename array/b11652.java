import java.util.Arrays;
import java.util.Scanner;

public class b11652{
       public static void main(String[] args){
              
    	   Scanner sc = new Scanner(System.in);
    	   
    	   int N = sc.nextInt();
    	   long [] dp = new long [N];
  	   
    	   for(int i=0; i<N; i++) {
    		   dp[i] = sc.nextLong();
    	   }
    	   sc.close();
    	   
   		   Arrays.sort(dp);
   		   
   		   int cnt=1,Max=1;
   		   long arr = dp[0];
   		   
   		   for(int i=1; i<N; i++) {
   			   if(dp[i] == dp[i-1]) 
   				   cnt += 1;
   			   else
   				   cnt = 1;
   			   
   			   if(Max < cnt) {
   				   Max =cnt;
   			   	   arr = dp[i];
   			   }   			   
   		   }
   		   System.out.println(arr);
 }
}
