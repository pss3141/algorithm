import java.util.Scanner;
 
public class b9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i= 0 ; i<n ; i++ ){
            
            String str = sc.next();
            String[] arr =str.split("");
            int cnt = 0;
            
            for (int j=0 ; j < arr.length ; j ++ ){
                if(arr[j].equals("(")){
                    cnt++;
                } else if (arr[j].equals(")")){
                    cnt--;
                }
                if(cnt < 0){
                    System.out.println("NO");
                    break;
                }
            }
            if(cnt >0)
            	System.out.println("NO");
            if(cnt == 0)
            	System.out.println("YES");
        }
    }
}