import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class b10825{
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		String [][] arr = new String[N][4];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.next();
			arr[i][1] = in.next();
			arr[i][2] = in.next();
			arr[i][3] = in.next();
		}
		in.close();
		
		Arrays.sort(arr, new Comparator<String[]>() {
	           public int compare(String[] x, String[] y) {
	               if(Integer.parseInt(x[1]) != Integer.parseInt(y[1]))
	            	   return Integer.compare(Integer.parseInt(y[1]), Integer.parseInt(x[1]));
	               else {
	            	   if(Integer.parseInt(x[2]) != Integer.parseInt(y[2]))
	            		   return Integer.compare(Integer.parseInt(x[2]), Integer.parseInt(y[2]));
	            	   else {
	            		   if(Integer.parseInt(x[3]) != Integer.parseInt(y[3]))
	            			   return Integer.compare(Integer.parseInt(y[3]), Integer.parseInt(x[3]));
	            		   else {
	            			   return x[0].compareTo(y[0]);
	            		   }
	            	   }
	               }	       
	           } 
	        });
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0]);
		}
	}
}