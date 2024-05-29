import java.util.Scanner;

public class String_s {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tokyo");
        System.out.println(sb);

        //Character at index 0
        System.out.println(sb.charAt(0));

        //set char at index  it is used in to replace any char with index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert at index
        sb.insert(0,'S');
        System.out.println(sb);

        //dellete with index
        sb.delete(0,1);
        System.out.println(sb);

        //append  means at last add the string
        sb.append(" Proffesor");
        System.out.println(sb);
        System.out.println(sb.length());




    }
    
}
