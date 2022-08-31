import java.util.Scanner;
//https://www.wikihow.tech/Get-Input-from-a-User-in-Java (<hehe i steal)

public class HelloWorld {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("\nWhat is your name? ");
        String name = userInputScanner.nextLine();

        System.out.println(name);
    }
}
