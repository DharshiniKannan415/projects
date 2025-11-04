import java.util.Scanner;
   public class calc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter a operator : ");
        char operator = sc.next().charAt(0);
       switch(operator){
        case '+' :
            int add = num1+num2;
            System.out.println("Addition of given numbers: " + add);
            break;
        case '-':
            int sub = num1-num2;
            System.out.println("Subtraction of given numbers : " + sub);
            break;
        case '*':
            int mul = num1*num2;
            System.out.println("Multiplication of given numbers : " + mul);
            break;
        case '/':
            int div = num1/num2;
            System.out.println("Division of given numbers : " + div);
       } 
    }
   }
