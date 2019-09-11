import java.util.Scanner;

 

/**
 * @author Andish
 *
 */
public class Jaa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello Big Data Students");
     
        java.util.Scanner myKeyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = myKeyboard.next();
        
        System.out.println("Welcome "+ name);
        
        System.out.println("Please enter your age: ");
        int age = myKeyboard.nextInt();
        System.out.println(age);
        
        System.out.println("Therefore my name is " + name + " and my age is " + age);
        
        myKeyboard.close();
        
        
	}

}
