import java.util.Scanner;

/**
 * Simple I/O using Scanner
 * @version 09.23.2022
 * @author Ryfi
 */

public class HolyGrail {
    /**
     * Method "main" is a chatbot
     * @param args command line arguments, if needed.
     */
    public static void main(String[] args){
        //declaring variables
        String name, quest, color;
        Scanner in = new Scanner(System.in);

        //Chatbot time
        System.out.println("* A chat with the bridge keeper * \nWho would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        //Getting user input
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: What is your quest? ");
        quest = in.nextLine();
        System.out.print("Question 3: What is your favorite color? ");
        color = in.nextLine();
        //Responding to user input and saying it back
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"\nYour name is: " + name + "\nYour quest is: " + quest + "\nYour favorite color is: " + color + "\n* end of program *");
    }
}
