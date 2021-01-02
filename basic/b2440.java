import java.util.Scanner;

public class b2440 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		sc.close();
		for(int i=0; i<C; i++) {
			for(int j=C; j>i; j--) {
			System.out.print("*");
			}
		System.out.println();
		}		
	}
}
