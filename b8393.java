import java.util.Scanner;

public class b8393 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int sum = 0;

		for(int i=0; i<C; i++) {
			
			sum += C-i;
			
		}
		sc.close();
	
		System.out.println(sum);
	
	}

}
