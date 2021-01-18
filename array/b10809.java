import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10809 {
       public static void main(String[] args) throws IOException {
    	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	   StringTokenizer st= new StringTokenizer(br.readLine());
           String str = st.nextToken(); 
    	               
    	   for (char c = 'a' ; c <= 'z' ; c++)
    		   System.out.print(str.indexOf(c) + " ");
       	}
}