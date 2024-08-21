import java.util.Scanner;

public class IT24100593Lab4Q2
{

 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        while (examMarks < 0 || examMarks > 100) 
        {
         System.out.println("Invalid input for exam marks.Terminating program.");
            System.out.print("Please enter exam marks (out of 100): ");
            examMarks = input.nextDouble();
        }

        // Input lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();
        while (labMarks < 0 || labMarks > 100)
        {
            System.out.println("Invalid input for lab submission marks.Terminating program.");
            System.out.print("Please enter lab submission marks (out of 100): ");
            labMarks = input.nextDouble();
        }

        // Input percentage for exam
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();

        // Input percentage for lab submission
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();

        // Validate that the percentages add up to 100
        while (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages for exam marks and lab submission marks.Terminating program.");
            System.out.print("Please enter the percentage of final mark taken from the exam: ");
            examPercentage = input.nextDouble();
            System.out.print("Please enter the percentage of final mark taken from the lab submission: ");
            labPercentage = input.nextDouble();
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Output final mark
        System.out.printf("Final Exam Mark is: %.2f%n", finalMark);
        
       
    }
}
