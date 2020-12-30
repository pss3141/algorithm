import java.util.Scanner;
 
public class b1924 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();
         
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayoftheweek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
         
        int totalDays = day;
        for (int i = 0; i < month - 1; ++i) {
            totalDays += days[i];
        }        
        System.out.println(dayoftheweek[totalDays % 7]);
    }
}