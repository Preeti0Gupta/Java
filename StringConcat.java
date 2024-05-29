public class StringConcat {
    public static void main(String[] args) {
        //Concatenation
        String firstName = "Tokyo ";
        String lastName = "Professor";
        String fullName = firstName  + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        //charAt() har ek character ko visit ke liye
        for(int i =0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

    }
}
