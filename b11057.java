import java.util.Scanner;

public class b11057 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [][] dp = new long[n+1][10];
        sc.close();
        for(int i=0; i<10; i++)
            dp[1][i] = 1;
        
        for(int i=2; i<=n; i++){
        	for(int j=0; j<10; j++){
        	for(int k=0; k<=j; k++){
        	dp[i][j] += dp[i-1][k];
        	dp[i][j] %= 10007;
        	}
        	}
        	}        	
        long answer = 0;
        for(int i=0; i<10; i++)
            answer += dp[n][i];
        
        System.out.println(answer%10007);
    }
	}
