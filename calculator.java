import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();
        
        switch(operator){
            case '+': System.out.println("Sum = "+(a+b));
                    break;

            case '-': System.out.println("Minus ="+(a-b));
                    break;

            case '*': System.out.println("Multi ="+(a*b));
                    break;

            case '/': System.out.println("Div ="+(a/b));
                    break;
            
            default:System.out.println("Invalid choice");
            sc.close();
        }

    }
}
