import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        HashSet<String> strSet = new HashSet<>();
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < 10; ++i) {
            String str = in.nextLine();
            strList.add(str);
            strSet.add(str);
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0)+1);
        }

        System.out.println("List Contains: ");
        for (String str : strList) {
            System.out.println(str);
        }

        System.out.println("Set Contains: ");
        for (String str : strSet) {
            System.out.println(str);
        }

        System.out.println("Frequency of the words:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }
    }
}