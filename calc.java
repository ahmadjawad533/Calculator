import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=========== Simple Calculator ===========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Cube Root");
            System.out.println("9. Exit");
            System.out.print("Enter your choice 1‑9: ");

            int choice = sc.nextInt();

            if (choice == 9) {
                System.out.println("Calculator Closed!");
                break;
            }

            if (choice < 1 || choice > 8) {
                System.out.println("Invalid choice, please try again.");
                continue;
            }

            double firstNumber;
            double secondNumber = 0;


            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                firstNumber = sc.nextDouble();
                System.out.print("Enter second number: ");
                secondNumber = sc.nextDouble();
            } else {
                System.out.print("Enter a number: ");
                firstNumber = sc.nextDouble();
            }


            switch (choice) {
                case 1:
                    System.out.println("Answer: " + (firstNumber + secondNumber));
                    break;

                case 2:
                    System.out.println("Answer: " + (firstNumber - secondNumber));
                    break;

                case 3:
                    System.out.println("Answer: " + (firstNumber * secondNumber));
                    break;

                case 4:
                    if (secondNumber != 0) {
                        System.out.println("Answer: " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    System.out.println("Answer: " + (firstNumber * firstNumber));
                    break;

                case 6:
                    System.out.println("Answer: " + (firstNumber * firstNumber * firstNumber));
                    break;

                case 7:
                    if (firstNumber >= 0) {
                        System.out.println("Answer: " + Math.sqrt(firstNumber));
                    } else {
                        System.out.println("Cannot calculate the square root of a negative number!");
                    }
                    break;

                case 8:
                    System.out.println("Answer: " + Math.cbrt(firstNumber));
                    break;
            }
        }

        sc.close();
    }
}
