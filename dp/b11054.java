import java.util.Scanner;
 
public class b11054 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] seq = new int[N+1];
		int[] dp = new int[N+1];
		int[] dpr = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			seq[i] = sc.nextInt();
		}	
		for(int i = 1; i <= N; i++) {
			dp[i] = 1;			
			for(int j = 1; j < i; j++) {				
				if(seq[j] < seq[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;	
				}
			}
		}
		for(int i = N; i > 0; i--) {
			dpr[i] = 1;			
			for(int j = N; j > i; j--) {				
				if(seq[j] < seq[i] && dpr[i] < dpr[j] + 1) {
					dpr[i] = dpr[j] + 1;	
				}
			}
		}
		sc.close();		
		int max = 0;
		for(int i=1; i<=N ; i++){
                max= Math.max(max, dp[i]+dpr[i]);
		}
		System.out.println(max-1);	
	} 
}