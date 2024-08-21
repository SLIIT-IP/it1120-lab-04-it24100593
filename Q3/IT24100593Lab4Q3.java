import java.util.Scanner;
public class IT24100593Lab4Q3
{
 public static void main(String[]args)
 {
  //Create an object called input to scanner class
  Scanner input=new Scanner(System.in);

  //Input a number
  System.out.print("Enter a number:");
  double number=input.nextDouble();

  //Determine if the number is positive , negative, or zero using the ternary   operator
  String result=(number>0)?"The number is: Positive":
                (number<0)?"The number is: Negative":
                          "The number is :Zero";

  //Print the result
  System.out.println(result);
 }
} 


 
  