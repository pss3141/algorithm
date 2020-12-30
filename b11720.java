import java.util.Scanner;

public class b11720 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int sum = 0;

		String arr = sc.next();
		for(int i=0; i<C; i++) {
			
			sum += arr.charAt(i)-'0';
		}
		System.out.println(sum);
		sc.close();
	}
}
