import java.util.Scanner;
 
public class b11722 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] seq = new int[N];
		int[] dp = new int[N];
		
		for(int i = 0; i < N; i++) {
			seq[i] = sc.nextInt();
		}	
		for(int i = 0; i < N; i++) {
			dp[i] = 1;			
			for(int j = 0; j < i; j++) {				
				if(seq[j] > seq[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;	
				}
			}
		}
		sc.close();		
		int max = 0;
		for(int i=0; i<N ; i++){
            if(dp[i]>max)
                max=dp[i];
		}
		System.out.println(max);
	
	} 
}