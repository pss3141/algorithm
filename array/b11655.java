import java.util.*;

public class b11655 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        for(int i=0; i<line.length(); i++) {
        	int[] testchar = new int[line.length()];
        	testchar[i] = (int)line.charAt(i);
        	if(64 < testchar[i] && testchar[i] < 91) {
        		testchar[i] += 13;
        		if(testchar[i] > 90) {
        			testchar[i] -= 26;
        		}
        	} else if(96 < testchar[i] && testchar[i] < 123) {
        		testchar[i] += 13;
        		if(testchar[i] > 122) {
        			testchar[i] -= 26;
        		}
        	} else if(testchar[i] == ' '){
        		testchar[i] = ' ';
        	}        	
        	System.out.print((char)testchar[i]);
        }        
        sc.close();
	}	
}