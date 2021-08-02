/*Circle:this program calculates the radius, area, perimeter of an Excircle and Incircle
  Author: Inon Levi
  Date 16/03/19
 */
import java.util.Scanner;
public class Circle {
	   public static void main (String [] args) {
		   Scanner scan = new Scanner (System.in);
		   System.out.println("program witch calculates the areas and the perimeters of the excircle and the incircle of a rectangle: ");
		   System.out.println("please insert the two coordinates of the left upper point: ");
		   //receiving the left upper point coordinates from the user
		   int leftUpX = scan.nextInt();
		   int leftUpY = scan.nextInt();
		   
		   System.out.println("please insert the two coordinates of the right down point: ");
		   //receiving the right down point coordinates from the user 
		   int rightDownX = scan.nextInt();
		   int rightDownY = scan.nextInt();
		   scan.close();
		   
		   int leftDownX = leftUpX;
		   int leftDownY = rightDownY;
		   
		   int rightUpX = rightDownX;
		   int rightUpY = leftUpY;                                        
		   System.out.println("the coordinates is (x,y) like this: \n the coordinates of the left up point is: \n"+ leftUpX + ","+leftUpY+" \n");
		   System.out.println("the coordinates of the left down point is: \n"+ leftDownX + ","+leftDownY+" \n");
		   System.out.println("the coordinates of the right down point is: \n"+ rightDownX + ","+rightDownY+" \n");
		   System.out.println("the coordinates of the right up point is: \n"+ rightUpX + ","+rightUpY+" \n");
		   
		   double exRadius , exArea, exPerimeter;//the values of the Excircle
		   
		   int X1 = leftUpX; //the higher value x
		   int Y1 = leftUpY; //the higher value y
		   int X2 = rightDownX; //the lower value x
		   int Y2 = rightDownY; //the lower value y
		   double distance = Math.sqrt(Math.pow((X1-X2), 2) + Math.pow((Y1-Y2), 2));
		   exRadius = distance / 2;
		   exArea = Math.PI * (Math.pow(exRadius, 2));
		   exPerimeter = 2 * Math.PI * exRadius;
		   
		   double inRadius, inArea, inPerimeter;//the values of the Incircle
		   inRadius = Math.abs(Y2-Y1) / 2;
		   inArea = Math.PI * (Math.pow(inRadius, 2));
		   inPerimeter = 2 * Math.PI * inRadius;
		   System.out.println("Excircle: radius = "+ exRadius+" area = "+exArea+" perimeter= "+exPerimeter);
		   System.out.println("Incircle: radius = "+inRadius+" area = "+inArea+" perimeter = "+inPerimeter);
		   
	   }

}
