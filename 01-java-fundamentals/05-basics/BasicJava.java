import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

    // print all numbers from 1 to 255
    public void print1To255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    // print odd numbers from 1 to 255
    public void printOddTo255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // print the sum of numbers from 1 to 255
    public void printSum() {
        int totalSum = 0;

        for (int i = 1; i <= 255; i++) {
            totalSum = totalSum + i;
            System.out.println("New Number: " + i + " Sum: " + totalSum);
        }
    }

    // iterate an array
    public void walkArray() {
        int[] myArray = { 1, 3, 5, 7, 9, 13 };

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    //find the maximum in an array
    public void findMax() {
        int[] myArray = { 3, -2, -7, 4, 12 };
        int arrayMax = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > arrayMax) {
                arrayMax = myArray[i];
            }
        }
        System.out.println(arrayMax);
    }

    //get the average of an array
    public void getAverage() {
        int[] myArray = { 1, 2, 3, -6, 50};
        int arrayAvg = 0;

        for (int i = 0; i < myArray.length; i++) {
            arrayAvg = myArray[i] + arrayAvg;
        }
        System.out.println(arrayAvg/myArray.length);
    }

    //create an array of odd numbers from 1 to 255
    public void arrayOddNums() {
        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 1; i <= 255; i++) {
            if (i % 2 != 0) {
                y.add(i);
            }
        }
        System.out.println(y);
    }

    //determine number of array items greater than a given number Y
    public void greaterThanY() {
        int y = 5;
        int x = 0;
        int[] myArray = { 1, 3, 5, 7, 9, 13, 15, -8};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > y) {
                x++;
            }
        }
        System.out.println(x);
    }

    //sqare individual items in an array
    public void squareValues() {
        int[] myArray = {1,5,10,-2};

        for (int i=0; i<myArray.length; i++) {
            myArray[i] = myArray[i] * myArray[i];
        }
        System.out.println(Arrays.toString(myArray));
    }

    //change negative values in an array to zero
    public void eliminateNegs() {
        int[] myArray = {1,5,10,-2};

        for (int i=0; i<myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }

    //calculate the [MAX, MIN, AVG] of a given array
    public void maxMinAvg(){
        double[] myArray = {1,5,10,-2};
        double[] maxMinAvgArray = {0,0,0};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxMinAvgArray[0]) {
                maxMinAvgArray[0] = myArray[i];
            }
            if (myArray[i] < maxMinAvgArray[1]) {
                maxMinAvgArray[1] = myArray[i];
            }
            maxMinAvgArray[2] = maxMinAvgArray[2] + myArray[i];
        }
        maxMinAvgArray[2] = maxMinAvgArray[2]/myArray.length;
        System.out.println(Arrays.toString(maxMinAvgArray));
    }

    //shift values of array to index minus 1, leave last item as zero
    public void shiftValues() {
        int[] myArray = {1,5,10,7,-2};

        for (int i = 0; i < myArray.length; i++) {
            if (i < myArray.length - 1){
                myArray[i] = myArray[i+1];
            } else {
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
