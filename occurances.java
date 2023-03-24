package assignment1;

public class occurances1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "SHuBHaNGi";
	        int[] count = new int[128];
	        for(int i=0;i<str.length();i++)
	        {
	            count[str.charAt(i)]++;
	        
	        }
	        for(int i=0;i<128;i++)
	        {
	            if(count[i]!=0)
	            {
	                System.out.println((char)i +" "+" is repeated="+count[i]+"times");
	            }
	        }
	    }
	        
	}
	

