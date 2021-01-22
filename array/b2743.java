import java.util.Scanner;

public class b2743 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int count = 0;
            
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if ('A' <= c && c <= 'Z') {
                	count += 1;
                } else if ('a' <= c && c <= 'z') {
                	count += 1;
                } 
            }
            System.out.println(count);
        }
    }
}
    