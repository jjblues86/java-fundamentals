/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Library {
    public static void main(String[] args) {
        System.out.println("lab");
    }

    //Create a function to roll dice
    public static int[] roll(int n){
        int[] rolled = new int[n];
        for(int i = 0; i < n; i ++){
            rolled[i] = (int) (Math.random() * 6) + 1;
        }
        return rolled;
    }

    //Create a function to check for duplicates
    public static boolean containsDuplicates(int[] array){
        int i, j;
        for(i = 0; i < array.length; i++){
            for(j = 1; j < array.length; j++){
                if (array[i] == array[j] && i != j)
                    return true;
            }
        }
        return false;
    }

    //Create a function to calculate the average
    public static double calculateAverage(int[] array){

        double sum = 0;
        int i;
        for(i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        double outcome = sum / array.length;
        return outcome;
    }

    //Create a function to calculate the lowest average of arrays of arrays
    public static String averageArrayValue(int[][] lowestArrayValue){
        ArrayList<Integer> averages = new ArrayList<>();
        int lowestAverage = Integer.MAX_VALUE;
        int lowestAverageIndex = 0;
        int arraysAverage = 0;
        int i,j;
        for(i = 0; i < lowestArrayValue.length; i++){
            int result = 0;
            for(j = 0; j < lowestArrayValue[i].length; j++){
                result += lowestArrayValue[i][j];
                arraysAverage = result/7;
            }
            averages.add(arraysAverage);
        }

        for(j = 0; j < averages.size(); j++){
            if(averages.get(j) < lowestAverage){
                lowestAverage = averages.get(j);
                lowestAverageIndex = j;
            }
        }
        return Arrays.toString(lowestArrayValue[lowestAverageIndex]);

    }
}
