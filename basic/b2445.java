import java.util.Scanner;

public class b2445 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		sc.close();
		for(int i=1; i<=C; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			for(int k=1; k<=C*2-i*2; k++) {
				System.out.print(" ");
				}
			for(int m=1; m<=i; m++) {
				System.out.print("*");
				}
		System.out.println();
		}	
		for(int i=1; i<C; i++) {
			for(int j=1; j<=C-i; j++) {
			System.out.print("*");
			}
			for(int k=1; k<=i*2; k++) {
				System.out.print(" ");
				}
			for(int m=1; m<=C-i; m++) {
				System.out.print("*");
				}
		System.out.println();
		}
	}
}
