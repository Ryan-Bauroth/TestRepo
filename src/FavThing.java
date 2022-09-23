import java.util.Scanner;

    public class FavThing {
        //https://www.wikihow.tech/Get-Input-from-a-User-in-Java
        //https://www.educative.io/answers/how-to-generate-random-numbers-in-java
        //Hehe I steal :P (I was playing around and made something very similar to this before this class)

        /**
         * This asks for your favorite movie then rates it.
         * @author Ryan Bauroth
         * @version 09.13.2022
         * @param args
         */

        public static void main(String[] args) {
            String[] adjArray = {"Silly", "Weird", "Annoying", "Harrowing", "Nice", "Kind", "Horrible","Awesome","Cray Cray","Wacky","Tired","Spacey"};
            String[] verbArray = {"hate", "love", "ignore", "despise", "like", "dislike","smile at", "frown at"};
            Scanner in = new Scanner(System.in);
            System.out.print("\nWhat is your favorite movie? ");
            String movie = in.nextLine();

            System.out.println("I " + verbArray[randNumberInt(0,verbArray.length - 1)] + " "+ movie + ". That movie is " + adjArray[randNumberInt(0,adjArray.length - 1)] + ".");
            System.out.println();
        }
        private static int randNumberInt(int min, int max) {
            int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
            return randomInt;
        }
    }

