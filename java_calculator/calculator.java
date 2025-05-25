import java.util.Scanner;
import java.util.InputMismatchException;

public class calculator {
        int num1,num2,ans;
        double pi = 3.14;
        
        
       private static Scanner sc=new Scanner(System.in);

        void options(){
            System.out.println("WELCOME USER!! ");
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
            System.out.println("Enter num1: ");
            num1=sc.nextInt();

            System.out.println("Enter num2: ");
            num2=sc.nextInt();

            ans = num1 + num2;
            System.out.println("The sum of "+num1+" and "+num2+" is: "+ans+"");

        }

        void subtraction(){
            System.out.println("Enter num1: ");
            num1=sc.nextInt();

            System.out.println("Enter num2: ");
            num2=sc.nextInt();

            ans = num1 -  num2;
            System.out.println("The difference of "+num1+" and "+num2+" is: "+ans+"");

        }

        void division(){
            System.out.println("Enter num1: ");
            num1=sc.nextInt();

            System.out.println("Enter num2: ");
            num2=sc.nextInt();

            float ans = num1 /  num2;
            System.out.println("The division of "+num1+" and "+num2+" is: "+ans+"");

        }

        void multiplication(){
            System.out.println("Enter num1: ");
            num1=sc.nextInt();

            System.out.println("Enter num2: ");
            num2=sc.nextInt();

            ans = num1 *  num2;
            System.out.println("The multiplication of "+num1+" and "+num2+" is: "+ans+"");

        }

        void modulus(){
            System.out.println("Enter num1: ");
            num1=sc.nextInt();

            System.out.println("Enter num2: ");
            num2=sc.nextInt();

            ans = num1 %  num2;
            System.out.println("The modulus of "+num1+" and "+num2+" is: "+ans+"");

        }

        void area_of_rectangle(){
            System.out.println("Enter num1: ");
            num1=sc.nextInt();

            System.out.println("Enter num2: ");
            num2=sc.nextInt();

            ans = num1 *  num2;
            System.out.println("The area rectangle is: "+ans+"");

        }

        void area_of_circle(){
            System.out.println("Enter num1: ");
            num1=sc.nextInt();

            System.out.println("Enter num2: ");
            num2=sc.nextInt();

            double ans = 2*pi*num1;
            System.out.println("The Area is: "+ans+"");

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
                case 7:
                    myobj.area_of_circle();
                    break;
                 case 8:
                    System.out.println("Exiting calculator. Great Calculations!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }   
            }
            while (choice != 8);{
                sc.close();
            }
        }
       
		}
	



//Qn: write a java program with the help of methods to display the structure below by giving a user an option to choose which operation to carry out