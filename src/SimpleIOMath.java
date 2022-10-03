import java.util.Scanner;
/**
 * Simple I/O Math and Returns
 * @version 09.27.2022
 * @author Ryfi
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;
    /**
     * Asking user for personal information
     */
    public void promptUsers() {
        System.out.print("""
                * Sit yourself down, take a seat *
                * All you gotta do is repeat after me *
                """);
        Scanner in = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
    }
    /**
     * Giving out personal information of the user
     */
    public void printInfo() {
        System.out.print("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree\n" +
                "Your name is: " + name +
                "\nYour age is: " + age +
                "\nAt your next birthday, you will turn " + (age + 1) +
                "\nThe first prime factor of " + age + " is: " + firstPrime(age) +
                "\nYour favorite number is: " + favNumber +
                "\nYour favorite number squared is: " + (favNumber * favNumber) +
                "\n* end of program *");
    }
    private boolean isPrime(int num){
        for(int i = 2; i < (int)(Math.sqrt(num)+1); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    private int firstPrime(int num){
        for(int i = 2; i <= Math.sqrt(num)+1; i++) {
            if (isPrime(i)) {
                if (num % i == 0) {
                    return i;
                }
            }
        }
        return num;
    }
    /**
     * Main method for class SimpleIOMath
     * @param args command line arguments, if needed.
     */
    public static void main(String[] args){
        SimpleIOMath hehe = new SimpleIOMath();
        hehe.promptUsers();
        hehe.printInfo();
    }
}
