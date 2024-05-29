import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        
        //int x = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements:");
        for(int i = 0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the searching element:");
        int x = sc.nextInt();
        for(int i = 0;i<size;i++){
            if(array[i] == x){
                System.out.println("X found at index : "+ i);
            }
        }
        // System.out.println("Not found");


    sc.close();
    }
}
