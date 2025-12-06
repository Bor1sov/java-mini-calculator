package borisov.test.first;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanOp = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter operation: ");
        String operation = scanOp.nextLine();
        if("-".equals(operation)){
            System.out.println(firstNumber - secondNumber);
        }
        else if("+".equals(operation)){
            System.out.println(firstNumber + secondNumber);
        }
        else if("*".equals(operation)){
            System.out.println(firstNumber * secondNumber);
        }
        else if("/".equals(operation)){
            System.out.println(firstNumber / secondNumber);
        }
        else{
            System.out.println(operation);
        }
    }
}