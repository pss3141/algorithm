import java.util.Scanner;

public class b11021 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int arr[] = new int[C];
		for(int i=0; i<C; i++) {
			
			int A = sc.nextInt();				
			int B = sc.nextInt();		
			arr[i] = A + B;
			
		}
		sc.close();
		for(int i=0; i<C; i++) {
		System.out.println("Case #"+(i+1)+":"+" "+arr[i]);
		}
	}

}
