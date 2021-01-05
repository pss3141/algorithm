import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class b11651{
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(arr, new Comparator<int[]>() {
	           public int compare(int[] x, int[] y) {
	                if (x[1] == y[1]) {
	                    return Integer.compare(x[0], y[0]);
	                }
	                return Integer.compare(x[1], y[1]);
	            }	 
	        });
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}