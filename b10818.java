import java.util.Arrays;
import java.util.Scanner;

public class b10818 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int arr[] = new int[C];
		for(int i=0; i<C; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		sc.close();
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[C-1]);
		
	}

}
