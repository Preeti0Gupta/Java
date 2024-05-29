import java.util.Scanner;

public class Question4 {
    public static float PerimeterCircle(int r) {
        double pie = 3.14;
        System.out.println("Circumference of a circle is : "+(2 * r *pie));
        return 1;

    }
    public static void main(String[] args) {
        System.out.print("Enter the value of r:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        PerimeterCircle(r);
        sc.close();
    }
}
