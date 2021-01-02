import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11721{
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String arr = br.readLine();
        int str = arr.length();
        
        for(int i=0; i<str/10; i++) {
            System.out.println(arr.substring(i*10, (i+1)*10)); 
        }
        System.out.println(arr.substring((str/10)*10)); 
    }
}
