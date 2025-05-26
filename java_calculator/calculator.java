import java.util.Scanner;
import java.util.InputMismatchException;

public class calculator {
        double num1,num2,ans;
       private static Scanner sc=new Scanner(System.in);

        void options(){
            System.out.println("-----------------WELCOME USER!!-------------- ");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Please choose an option (1-8)");
            System.out.println("1 . Addition");
            System.out.println("2 . Subtraction");
            System.out.println("3 . Division");
            System.out.println("4 . Multiplication");
            System.out.println("5 . Modulus");
            System.out.println("6 . Area of a rectangle");
            System.out.println("7 . Area of a circle");
            System.out.println("8 . Exit");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.print("Enter your choice: ");

        }

        void addition(){
            System.out.print("Enter num1: ");
            num1 = getDouble();

            System.out.print("Enter num2: ");
            num2= getDouble();

            ans = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + ans);
        }

        void subtraction(){
            System.out.print("Enter num1: ");
            num1=getDouble();

            System.out.print("Enter num2: ");
            num2=getDouble();

            ans = num1 -  num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + ans);
        }

        void division(){
            System.out.print("Enter num1: ");
            num1=getDouble();

            System.out.print("Enter num2: ");
            num2=getDouble();

            if (num2==0) {
                System.out.println("ERROR!  numbers cannot be divisible by zero");
            }
            else{
            ans = num1 /  num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + ans);
                }

        }

        void multiplication(){
            System.out.print("Enter num1: ");
            num1=getDouble();

            System.out.print("Enter num2: ");
            num2=getDouble();

            ans = num1 *  num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + ans);
        }

        void modulus(){
            System.out.print("Enter num1: ");
            num1=getDouble();

            System.out.print("Enter num2: ");
            num2=getDouble();

            if (num2==0) {
                System.out.println("ERROR!  modulus by zero is not accepted");
            }
            else{
            ans = num1 %  num2;
            System.out.println("Result: " + num1 + " % " + num2 + " = " + ans);
                }

        }

        void area_of_rectangle(){
            System.out.print("Enter the length : ");
            double length=getDouble();

            System.out.print("Enter the width : ");
            double width=getDouble();

            if (length < 0 || width < 0) {
                System.out.println("ERROR! Area cannot be a negative "); 
            }
            else{
            double ans = length *  width;
            System.out.println("The area rectangle is: "+ans+"");
            }
        }

        void area_of_circle(){
            System.out.print("Enter radius of the circle : ");
            double radius = getDouble();

           if (radius<0) {
            System.out.print("Error: Radius cannot be negative.");
           }
           else{
            double area = Math.PI * radius * radius;
            System.out.println("Area of circle: " + area);
           }
        }

        public static int getoption() {
        int choice = -1; 
        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            sc.next();
        }
        return choice;
    }

        private static double getDouble() {
        while (true) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number: ");
                sc.next(); 
            }
        }
    }

    public static void main(String args[]){
        int choice;
        calculator myobj=new calculator();

        do {
            myobj.options();
            choice=getoption();

            switch (choice) {
                case 1:
                     myobj.addition();
                    
                    break;
                case 2:
                     myobj.subtraction();
                     break;
                case 3:
                    myobj.division();
                    break;
                case 4:
                    myobj.multiplication();
                    break;
                case 5:
                    myobj.modulus();
                    break;
                case 6:
                    myobj.area_of_rectangle();
                    break;
                case 7:
                    myobj.area_of_circle();
                    break;
                 case 8:
                    System.out.println("Exiting calculator. Great Calculations!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }   
            System.out.println("\n*********************************************\n");
            }
            while (choice != 8);{
                sc.close();
            }
        }
		}
	



//Qn: write a java program with the help of methods to display the structure below by giving a user an option to choose which operation to carry out