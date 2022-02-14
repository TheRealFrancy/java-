public class fibonacci{

	public static void main(String[] args) {
	int a =0;
	int b=1;
	int i;
	int c;
	System.out.println(a+""+b);
	
	for(i=0;i<10;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
		
		
	}//end loop
	
	
	}//end main

}//end class
