import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String Declaration
        // String name = "Tokyo";
        // String fullName = "Tokyo Profesor";
        // String sentence = "My name is Tokyo Profesor";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is:"+name);

        sc.close();
    }

}
