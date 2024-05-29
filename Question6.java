import java.util.Scanner;

public class Question6 {
    public static float PositiveNegitive(float num) {
        if(num > 0){
            System.out.println("Positive Number");
        }
        else if(num < 0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Number is Zero");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number which you want to check");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        PositiveNegitive(num);
        sc.close();

        
    }
}
