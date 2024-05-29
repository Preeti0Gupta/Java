import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("Now you are Adult");
        }
        else{
            System.out.println("No you are not Adult");
        }
        sc.close();
    }
}
