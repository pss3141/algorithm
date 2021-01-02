import java.util.Scanner;

public class b2193 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [][] dp = new long[n+1][2];
        sc.close();
       
        dp[1][0] = 0;
        dp[1][1] = 1;
        
        for(int i=2; i<=n; i++){
        	for(int j=0; j<2; j++){
        		if(j==0) {
        			dp[i][j] = dp[i-1][0] + dp[i-1][1];
        		}
        		else {
        			dp[i][j] = dp[i-1][0];
        		}
        	
        	
        	}
        	}        	
        long answer = 0;
        for(int i=0; i<2; i++)
            answer += dp[n][i];
        
        System.out.println(answer);
    }
	}
