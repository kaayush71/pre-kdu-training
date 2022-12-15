import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First String :- ");
        String one = in.nextLine();
        System.out.print("Enter Second String :- ");
        String two = in.nextLine();
        System.out.println("Length of First String is "+one.length());
        System.out.println("Length of Second String is "+two.length());
        if(one.length() == two.length())
            System.out.println("The length of the two strings is same");
        else
            System.out.println("The length of the two strings is not same");
        if(one.equals(two))
            System.out.println("Both Strings are Equal");
        else
            System.out.println("Both Strings are not Equal");
    }
}
