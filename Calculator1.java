import java.util.Scanner;

public class Calculator1 {

        public static double add(double a,double b)
        {
            return a+b;
        }
         public static double sub(double a,double b)
        {
            return a-b;
        }
         public static double mul(double a,double b)
        {
            return a*b;
        }
         public static double div(double a,double b)
        {
            if(b==0)
            {
                System.out.println("ERROR: Can not divide by zero..!");
                return 0;
            }
            return a/b;
        }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        boolean ch = true;

        while(ch)
        {
            System.out.println("\n Choose Operation\n");
            System.out.println("1. Addition \n");
            System.out.println("2. Subtraction\n");
            System.out.println("3. Multipliation \n");
            System.out.println("4. Division \n");
            System.out.println("5. Exit \n");
            System.out.println("Enter Your Choice :\n");
             int choice = sc.nextInt();
            if(choice == 5)
            {
                ch=false;
                System.out.println("\n Exiting Calculator..\n");
                break;
            }
        
        System.out.println("Enter First Number :\n");
        double num1=sc.nextDouble();
        System.out.println("Enter Second Number :\n");
        double num2=sc.nextDouble();
        double result=0.0;
        switch(choice)
        {
            case 1:
            result= add(num1,num2);
            break;
             case 2:
            result= sub(num1,num2);
            break;
             case 3:
            result= mul(num1,num2);
            break;
             case 4:
            result= div(num1,num2);
            break;
            default :
            if(choice < 1 || choice > 5 ){
            System.out.println("\nInvalid Choice..\n");
            break;
            }
        }
        System.out.println("\n Result is :"+result);

    }
    sc.close();
}
}

