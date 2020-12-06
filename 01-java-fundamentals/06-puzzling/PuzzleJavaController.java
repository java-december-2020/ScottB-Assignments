import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJavaController {
    public static void main(String[] args) {
        PuzzleJava launch = new PuzzleJava();

        int[] nums = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(launch.sumArray(nums));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        System.out.println(launch.shuffleNames(names));

        launch.shuffleLetters();
        
        System.out.println(launch.randomTenNums());

        System.out.println(launch.returnSorted(launch.randomTenNums()));
    }

}