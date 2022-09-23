import java.util.Arrays;
import java.util.Scanner;
//https://www.wikihow.tech/Get-Input-from-a-User-in-Java
//https://www.educative.io/answers/how-to-generate-random-numbers-in-java
//Hehe I steal :P

public class HelloWorld {

    private static int randNumberInt(int min, int max) {
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        return randomInt;
    }
    private static int[] randomArray(int maxAmount) {
        int[] array = new int[-1];
        for(int i = 0; i < maxAmount; i++){
            int rand = randNumberInt(0, maxAmount);
            boolean allowed = true;
            for(i = 0; i < array.length; i++){
                if(array[i] == rand){
                    break;
                }
                else if(i == array.length - 1){
                    //push
                }
            }
        }
        //remove first unit
        return array;
    }
    private static int[] randomSort(int[] array){

        int pastTerm = -1;
        for(;;) {
            int[] everyNumber;
            for (int i = 0; i < array.length; i++) {
                if (pastTerm != array[i] - 1) {
                    break;
                } else if (i == array.length - 1) {
                    return array;
                }
            }
        }
    }
}
