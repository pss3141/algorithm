import java.util.Scanner;
 
public class b1912 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] seq = new int[N];
		int[] dp = new int[N];
		
		for(int i = 0; i < N; i++) {
			seq[i] = sc.nextInt();
			
		
		}
		dp[0] = seq[0];
		int max = seq[0];
		for(int i = 1; i < N; i++) {			
			dp[i] = Math.max(seq[i], seq[i]+dp[i-1]);
			max = Math.max(max, dp[i]);
		}
		sc.close();		
		
		System.out.println(max);
		
		
	} 
}