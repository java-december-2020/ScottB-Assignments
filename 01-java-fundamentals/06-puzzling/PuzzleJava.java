import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {
    public ArrayList<Integer> sumArray(int[] myArray) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int arraySum = 0;

        for (int i = 0; i < myArray.length; i++) {
            arraySum = arraySum + myArray[i];
            if (myArray[i] > 10) {
                newArray.add(myArray[i]);
            }
        }
        System.out.println("Array Sum is : " + arraySum);
        return(newArray);
    }

    public ArrayList<String> shuffleNames(ArrayList<String> myArray) {
        ArrayList<String> newArray = new ArrayList<String>();

        Collections.shuffle(myArray);
        for (int i=0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
            if (myArray.get(i).length() > 5) {
                newArray.add(myArray.get(i));
            }
        }

        return(newArray);
    }

    public void shuffleLetters() {
         //create an array of letters in the alphabet
         ArrayList<String> letters = new ArrayList<String>();
         for(int i = 0; i < 26; i++){
             letters.add(Character.toString((char)(65 + i)));
         }

         Collections.shuffle(letters);
         System.out.println(letters);
         System.out.println(letters.get(0));
         System.out.println(letters.get(25));
         if (letters.get(0).equals("A") || letters.get(0).equals("E") || letters.get(0).equals("I") || letters.get(0).equals("O") || letters.get(0).equals("U")) {
             System.out.println(letters.get(0) + " is a vowel");
         }
         
    }

    public ArrayList<Integer> randomTenNums() {
        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        Random randomNum = new Random();

        for (int i=0; i<10; i++){
            randomNums.add(randomNum.nextInt(100-55)+55);
        }
        return(randomNums);
    }

    public ArrayList<Integer> returnSorted(ArrayList<Integer> myArray) {
        Collections.sort(myArray);
        return(myArray);
    }
}