package leetCodeEx;

public class SumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		SumTwo obj = new SumTwo();
//		
//		int count = obj.countDig(324654);
//		
//		System.out.println(count);
//		if ((count%2) == 1) {
//			System.out.println("Palindrome");
//		}
//		else {
//			return;
//		}
		int x = 124585431;
		
	       if(x<0 || x!=0 && x%10 ==0 ) {
	    	   System.out.println("not palindrome");
	    	   return;
	    	   }
	        int check=0;
	        while(x>check){
	        	System.out.println("\nInside While x: " + x + " check: " + check );
	        	
	            check = check*10 + x%10;
	            System.out.println("check value: " + check);
	            x/=10;
	            System.out.println("x value after: " + x);
	        }
	        System.out.println("----------------");
	        System.out.println(x + " == " + check + " || " + x + " == " + check + "/10");
	        boolean y = x==check || x==check/10;
	        System.out.println(y);
	}
//	public int countDig(int n)  
//	{  
//	// converting the number n to a string  
//	String str = Integer.toString(n);  
//	// computing the size of the string  
//	int size = str.length();  
//	return size;  
//	}  
	

}


