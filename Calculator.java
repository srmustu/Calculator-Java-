import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int process;
        double number1,number2,result;
        String message1,message2,message3,message4,message5,message6,message7,message8;

        message1 = "Welcome to calculator :)";
        message2 = "Please enter number 1 : ";
        message3 = "Select the action you want the perform";
        message4 = "[(1) Collection] \n[(2) Extraction] \n[(3) Impact] \n[(4) Divide]";
        message5 = "Your choice : ";
        message6 = "Please enter number 2 : ";
        message7 = "Result : ";
        message8 = "Invalid transaction, please select a valid transaction ";

        System.out.print(message1 + "\n" + message2);
        number1 = input.nextDouble();

        System.out.print(message3 + "\n" + message4 + "\n" + message5);
        process = input.nextInt();

        System.out.print(message6 );
        number2 = input.nextDouble();

        switch (process){
            case (1):
                result = number1 + number2;
                System.out.print(message7 + result);
                break;
            case (2):
                result = number1 - number2;
                System.out.print(message7 + result);
                break;
            case (3):
                result = number1 * number2;
                System.out.print(message7 + result);
                break;
            case (4):
                result = number1 / number2;
                System.out.print(message7 + result);
                break;
            default:
                System.out.println(message8);
        }

    }
}
