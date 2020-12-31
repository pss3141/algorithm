import java.util.Scanner;

public class b2439 {
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
	}
}
