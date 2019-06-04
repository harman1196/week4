package weekfour;

import javax.print.DocFlavor.STRING;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	public static void calcTax(double price){	   
    	final double TAXRATE =13/100;	   
    	double result = price*TAXRATE;
    	System.out.println("tax is :" +result);
	}

}
