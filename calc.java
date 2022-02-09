package modulo1;
import javax.swing.JOptionPane;

public class number {

	public static void main(String[] args) {
		
		String first , second;
		String sign;
		int result;
		
		 first=JOptionPane.showInputDialog("insert number");
		 sign= JOptionPane.showInputDialog(" insert sign");
		 second=JOptionPane.showInputDialog("insert number");
		 try {
		 int valfirstnumber =  Integer.parseInt(first);
		 int valsecondnumber = Integer.parseInt(second);
		 
		
		
		 if(sign.equals("+")) {
			 result=  valfirstnumber + valsecondnumber;
			 JOptionPane.showMessageDialog(null,result," il risultato e:" , JOptionPane.PLAIN_MESSAGE );
			 
		 }else if(sign.equals("-")){
			 result= valfirstnumber - valsecondnumber;
			 JOptionPane.showMessageDialog(null,result," il risultato e:" , JOptionPane.PLAIN_MESSAGE );
			
			 
			 
			 
		 }else if(sign.equals("/")) {
			 result= valfirstnumber / valsecondnumber;
			 JOptionPane.showMessageDialog(null,result," il risultato e:" , JOptionPane.PLAIN_MESSAGE );
			 
			 
			 
		 }else if(sign.equals("*")) {
			 result= valfirstnumber * valsecondnumber;
			 JOptionPane.showMessageDialog(null,result," il risultato e:" , JOptionPane.PLAIN_MESSAGE );
			 
			 
			 
		 }// end condition
		 
		 }catch(NumberFormatException e){
			 JOptionPane.showMessageDialog(null, "hai inserito una stringa in un campo numerico","errore...", JOptionPane.ERROR_MESSAGE);

          }// end try catch block
		
		
		System.exit(0);
	
	
	
	}//end  main

}//end class
