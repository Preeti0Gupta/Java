import java.util.Scanner;

public class Question5 {
    public static int vote(int age) {
       String result = (age > 18) ? "You are eligible to vote." : "You are not eligible to vote.";
       System.out.println(result);
       return 1;
    }
    public static void main(String[] args) {
        System.out.print("Enter the age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        vote(age);
        sc.close();
    }
}
