package weekfour;

import javax.print.DocFlavor.STRING;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="harman";
       System.out.println(name);
       int numChar =name.length();
       System.out.println("number of characters  "+numChar);
       
       char charAtps=name.charAt(4);
       System.out.println("ps of character 4  "+charAtps);
       
       
       String sub =name.substring(0, 2);
       System.out.println("sub string  "+sub);
       
       String a ="gundeep";
       String b ="gunde";
       
       if(a.equals(b)){
    	   System.out.println("a &b are same ");  
       }
       else{
    	   System.out.println("a &b are not same ");  
       }
       
       
       
       
       
	}

}
