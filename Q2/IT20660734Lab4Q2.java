import java.util.Scanner;

public class IT20660734Lab4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMark;

        System.out.print("Please enter exam marks (out of 100): ");
        examMarks = input.nextDouble();

        System.out.print("Please enter lab submission marks (out of 100): ");
        labMarks = input.nextDouble();

        // Range validation
        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {

            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

        // Percentage validation
        if ((examPercentage + labPercentage) != 100) {

            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        // Final mark calculation
        finalMark = (examMarks * examPercentage / 100) +
                    (labMarks * labPercentage / 100);

        System.out.println("\nFinal Exam Mark is : " + finalMark);

    }
}