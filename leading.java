package assignment1;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			       String str = "  I Love India   ";
			       String result = removeLeadingTrailingSpaces(str);
			       System.out.println(result); 
			   }
			   
			   public static String removeLeadingTrailingSpaces(String str) {
			       int start = 0;
			       int end = str.length() - 1;
			       
			       
			       while (start < str.length() && str.charAt(start) == ' ') {
			           start++;
			       }
			       
			      
			       while (end >= 0 && str.charAt(end) == ' ') {
			           end--;
			       }
			       
			       
			       String result = "";
			       for (int i = start; i <= end; i++) {
			           result += str.charAt(i);
			       }
			       return result;
			   }
		}


