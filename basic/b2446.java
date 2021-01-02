import java.util.Scanner;

public class b2446 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i = 0; i < N ; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2*N-1) - (i*2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < N-1 ; i++) {
			for(int j = 2; j < N-i; j++) {
				System.out.print(" ");
			}
			for(int j =0; j < 3+2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}