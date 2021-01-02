import java.util.Scanner;

public class b10992{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		
		for (int i=1;i<N;i++)  
			System.out.print(" ");
			System.out.println("*");
		
		for (int i=2;i<N;i++) { 
			for (int j=N-i;j>0;j--) 
				System.out.print(" ");
				System.out.print("*");
				
			for (int j=1;j<=2*(i-1)-1;j++) 
				System.out.print(" ");
				System.out.println("*");
		}
		
		if (N!=1) {
			for (int i=1;i<=2*N-1;i++)
				System.out.print("*");
				System.out.println();
		}
	}
}