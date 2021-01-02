import java.util.Scanner;

public class b2739 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int arr[] = new int[10];
		for(int i=1; i<10; i++) {
			
			arr[i] = C*i;
			
		}
		sc.close();
		for(int i=1; i<10; i++) {
		System.out.println(C + " * " + i + " = " + arr[i]);
		}
	}

}
