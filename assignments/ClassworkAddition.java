import java.util.Scanner;

public class ClassworkAddition {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int result;

        System.out.println("Input first value: ");

        Scanner takeInput = new Scanner(System.in);
        firstNumber = takeInput.nextInt();
        System.out.println("Input second value: ");
        secondNumber = takeInput.nextInt();
        result = secondNumber + firstNumber;
        System.out.println("Your addition result is: " + result);
        result = secondNumber - firstNumber;
        System.out.println("Your subtraction result is: "+ result);
        result = secondNumber * firstNumber;
        System.out.println("Your multiplication result is: "+result);
        result = secondNumber / firstNumber;
        System.out.println("Your division result is: " + result);
       
        takeInput.close();

    }
}
