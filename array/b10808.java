import java.util.Scanner;
 
public class b10808 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] d = new int[26];
        sc.close();
        
        for(int i =0 ; i<str.length(); i++) {
            int a = str.charAt(i)-97;
            d[a]++;
        }        
        for(int i =0 ; i<26; i++) {
            System.out.print(d[i]+" ");    
        }                        
    } 
}