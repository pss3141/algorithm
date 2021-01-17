import java.util.Scanner;
import java.util.Stack;

public class b10799 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        Stack<String> stack = new Stack<>();
	        int count = 0;
	        
	        for(int i=0; i<s.length(); i++) {
	            if(s.charAt(i) == '(')
	                stack.push("(");
	            else {
	                if(s.charAt(i-1) == '(') {
	                    stack.pop();
	                    count+=stack.size();
	                }
	                else {
	                    stack.pop();
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);
	    }
}
