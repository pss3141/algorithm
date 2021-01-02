import java.util.Scanner;

public class b10953 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		
		for(int i=0; i<C; i++) {
			String arr[] = sc.next().split(",");
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		}
		sc.close();
	}
}
