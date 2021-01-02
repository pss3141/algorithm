import java.util.Scanner;

public class b2741 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int arr[] = new int[C];
		for(int i=C-1; i>=0; i--) {
			
			arr[i] = C-i;
			
		}
		sc.close();
		for(int i=C-1; i>=0; i--) {
		System.out.println(arr[i]);
		}
	}

}
