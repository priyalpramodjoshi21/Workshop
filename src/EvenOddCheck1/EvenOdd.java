package EvenOddCheck1;

public class EvenOdd {
	
	public static void main (String[] args) {
	
    int num = 786543;
    int even_count=0;
    int odd_count=0;
    
    while(num>0) {
    
    
    	 int rem=num%10;
    	if(rem%2==0) {
    		even_count++;
    	}
    		else
    		{
    		odd_count++;
   
    } 
    
    num=num/10; 
	}

System.out.println("Number even:"+even_count);
System.out.println("Number odd:"+odd_count);
}
}