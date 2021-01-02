import java.util.Scanner;

public class b2742 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int arr[] = new int[C];
		for(int i=0; i<C; i++) {
			
			arr[i] = C-i;
			
		}
		sc.close();
		for(int i=0; i<C; i++) {
		System.out.println(arr[i]);
		}
	}

}
