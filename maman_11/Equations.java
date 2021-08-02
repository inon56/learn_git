/* Equations: this program solves a 2 variables linear equation 
  Author: Inon Levi 
   Date 16/02/19
 */
import java.util.Scanner;

public class Equations {
	public static void main(String[]args) {
		int a11, a12, a21, a22, b1, b2; // declaration of the variables
		final int MAX=1000;//possible to add or subtraction zero/s to control
		Scanner scan = new Scanner(System.in);
		System.out.println("this program solves a system of 2 linear equations\n Enter the coefficients a11 a12 a21 a22 b1 b2");
		 //receiving the variables from the user 
		 a11 = scan.nextInt();
		 a12 = scan.nextInt();
		 a21 = scan.nextInt();
		 a22 = scan.nextInt();
		 b1 = scan.nextInt();
		 b2 = scan.nextInt();
		 scan.close();
		 System.out.println("Eq1: "+a11+"*x1+"+a12+"x2 = "+b1);
		 System.out.println("Eq2: "+a21+"*x1+"+a22+"x2 = "+b2);
		   
		 double result1 = a11*a22 - a12*a21;
		 boolean found = false;
		//equations conditions section
		 if(result1 != 0) 
		 {
			 double solution1,solution1Round,solution2 ,solution2Round;
			 solution1 = (double)(b1*a22-b2*a12)/(a11*a22-a12*a21);
			 solution1Round = Math.round(solution1 * MAX)/(MAX * 1.0);//round solution1 to 3 numbers after decimal point
			 solution2 = (double)(b2*a11-b1*a21)/(a11*a22-a12*a21);
			 solution2Round = Math.round(solution2 * MAX)/(MAX * 1.0);//round solution2 to 3 numbers after decimal point
			 System.out.println("Single solution: ("+solution1Round+","+solution2Round+")");
			 found = true;//changing the value of the boolean in order to skip the others if's
		 }
		 if (!found) 
		 {
			 double result2, result3;
			 result2 = b2*a11 - b1*a21;
			 result3 = b1*a22 - b2*a12;
			 boolean cond1 = !(a11 == 0 && a12 == 0 && b1 != 0) &&     
			                 !(a21 == 0 && a22 == 0 && b2 != 0);
			 boolean cond2 = result2 == 0 && result3 == 0;
			 if (cond1 && cond2) 
			 {	 
				 System.out.println("Many solutions");
				 found = true;
			 }
		 }
		 if (!found)
		     {
			     System.out.println("no solution");
		     }
	}
}
