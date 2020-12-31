import java.util.Scanner;

public class b2522 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		sc.close();
		for(int i=0; i<C; i++) {
			for(int j=1; j<C-i; j++) {
			System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}		
		for(int i=0; i<C-1; i++) {
			for(int j=0; j<=i; j++) {
			System.out.print(" ");
			}
			for(int k=1; k<C-i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}		
	}
}
