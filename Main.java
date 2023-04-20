import java.util.*;
public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("press 1  To  + ");
            System.out.println("press 2  To  - ");
            System.out.println("press 3  To  * ");
            System.out.println("press 4  To   / ");
            System.out.println("Enter your  option---------");
            Scanner sc = new Scanner(System.in);
            int option;
            option = sc.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Enter your First_number");
                    Scanner sc1 = new Scanner(System.in);
                    int First_number = sc1.nextInt();
                    System.out.println("Enter your second_Number");
                    Scanner sc2 = new Scanner(System.in);
                    int Second_number = sc1.nextInt();
                    int result = First_number + Second_number;
                    System.out.println("Sum of Two Number is  " + result);
                    break;
                case 2:
                    System.out.println("Enter your First_number");
                    Scanner sc3 = new Scanner(System.in);
                    int First_number1 = sc3.nextInt();
                    System.out.println("Enter your second_Number");
                    Scanner sc4 = new Scanner(System.in);
                    int Second_number2 = sc4.nextInt();
                    int result2 = First_number1 - Second_number2;
                    System.out.println("Sub of Two Number is  " + result2);
                    break;
                case 3:
                    System.out.println("Enter your First_number");
                    Scanner sc5 = new Scanner(System.in);
                    int First_number3 = sc5.nextInt();
                    System.out.println("Enter your second_Number");
                    Scanner sc6 = new Scanner(System.in);
                    int Second_number3 = sc6.nextInt();
                    int result3 = First_number3 * Second_number3;
                    System.out.println("Mult of Two Number is  " + result3);
                    break;
                case 4:
                    System.out.println("Enter your First_number");
                    Scanner sc7 = new Scanner(System.in);
                    double First_number4 = sc7.nextDouble();
                    System.out.println("Enter your second_Number");
                    Scanner sc8 = new Scanner(System.in);
                    double Second_number4 = sc8.nextDouble();
                    double result4 = First_number4 / Second_number4;
                    System.out.println("div of Two Number is  " + result4);
                    break;
                default: {
                    System.out.println("Wrong input");
                }


            }


        }
    }}
