import java.util.Scanner;

public class b9095 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int [] dp = new int [11];
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for(int i=0; i<T; i++) {
        	int n = sc.nextInt();
        	for(int j=4; j<=n; j++) {
        		dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
        		}
        	System.out.println(dp[n]);
        	}
        sc.close();
        return; 
        }
	}
