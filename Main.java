import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner csv = new Scanner(new File("src/records.csv"));
        csv.useDelimiter(",");
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        while (csv.hasNextLine()) {
            String[] strs = csv.nextLine().split(",");

            for (String str: strs) {
                frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
            }
        }

        ArrayList<String> arr = new ArrayList(frequencyMap.keySet());
        Collections.sort(arr, (w1, w2) -> {
            return frequencyMap.get(w1) != frequencyMap.get(w2) ?
                    frequencyMap.get(w2) - frequencyMap.get(w1) : w1.compareTo(w2);
        });

        for(int i=0;i<3;i++) {
            System.out.println(arr.get(i));
        }
    }
}