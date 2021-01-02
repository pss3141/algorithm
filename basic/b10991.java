import java.util.Scanner;

public class b10991 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		sc.close();
		for(int i = 1; i<=C; i++) {
			for(int j=i; j<=C-1; j++) {
				System.out.print(" ");
			}
				for(int m=1; m<=2*i-1; m++) {
					  if (m % 2 == 1)
		                    System.out.print("*");
		              else
		                    System.out.print(" ");
				}
				System.out.println();		
			}
			
		}		
}
