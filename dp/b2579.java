import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2579 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int[] seq = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			seq[i] = Integer.parseInt(br.readLine());

		}
		dp[1] = seq[1];
		
		if(N>=2) {
		dp[2] = seq[1] + seq[2];
		}
		
		for(int i = 3; i <= N; i++) {			
			dp[i] = Math.max(seq[i-1]+dp[i-3]+seq[i], dp[i-2]+seq[i]);
		}	
		
		System.out.println(dp[N]);
				
	} 
}