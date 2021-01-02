import java.util.Scanner;
 
public class b1699 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] seq = new int[N+1];		
		seq[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			seq[i] = i;
			for(int j = 1; j*j<= i; j++) 
				seq[i] = Math.min(seq[i], seq[i-j*j]+1);
					
		}
		sc.close();				
		System.out.println(seq[N]);		
	} 
}