import java.util.Scanner;

public class IT24102244Lab4Q2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter exam marks (out of 100): ");
        double exam_marks = input.nextDouble();

        double lab_marks = 0;
        double exam_percentage = 0;
        double lab_percentage =0;
        double total_marks = 0;
        double avg = 0;
        double final_marks = 0;


      // check the exam marks
        if(exam_marks >= 0 && exam_marks <= 100){
            System.out.print("Please Enter Lab submission marks (out of 100): ");
            lab_marks = input.nextDouble();

         // check the lab submission marks
            if(lab_marks >= 0 && lab_marks <= 100){
                System.out.print("Please enter the percentage given for the exam: ");
                exam_percentage = input.nextDouble();

              // check the exam percentage
                if(exam_percentage >= 0 && exam_percentage <= 100){
                    System.out.print("Please enter the percentage given for the lab submission: ");
                    lab_percentage = input.nextDouble();

                    double tempTot = exam_percentage + lab_percentage;
                    if((lab_percentage >= 0 && lab_percentage <= 100) && (tempTot <= 100 && tempTot >= 0)){
                        double tempTot2 = tempTot;

                        total_marks = exam_marks + lab_marks;
                        avg = total_marks / 2;
                        final_marks = (avg * tempTot2)/100;

                        System.out.println("\nFinal Exam Mark is : "+final_marks);
                    }
                    else {
                        System.out.println("The percentage must add up to 100. Terminating program.");
                    }
                }
                else{
                    System.out.println("Invalid input for lab percentage. Terminating program.");
                }
            }
            else{
                System.out.println("Invalid input for exam percentage. Terminating program.");
            }
        }
        else{
            System.out.println("Invalid input for exam marks. Terminating program.");
        }
        System.out.println();
    }
}