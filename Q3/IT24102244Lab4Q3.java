import java.util.Scanner;

class IT24102244Lab4Q3{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //String message = "Test";
        System.out.print("Enter a number: ");
        int num = input.nextInt();


        System.out.print(num > 0 ? "The number is: Positive": num < 0? "The number is: Negative": "The number is: Zero");

    }
}