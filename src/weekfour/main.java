package weekfour;

import javax.print.DocFlavor.STRING;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcdistance(9.8,10);
    	
	}
	
	
	public static void calcdistance(double g,int t){	   
    		   
    	double distance = 0.5*g*t;
    	System.out.println("distance is :" +distance);
    	}

}
