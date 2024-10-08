import java.util.Scanner;

public class _14_Input {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Enter Your Age:");

            String age = inp.nextLine();
            System.out.println("Your Age is :"+age);
        }

    }
}
