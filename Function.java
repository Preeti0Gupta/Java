import java.util.*;
public class Function {
    public static void PrintMyName(String name) {  //function
        System.out.println(name);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        PrintMyName(name);  // call kiya function ko
        sc.close();
    }
}
