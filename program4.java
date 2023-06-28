import java.util.*;

public class NumberCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int number : numbers) {
                if (number % i == 0) {
                    count++;
                }
            }
            countMap.put(i, count);
        }
        
        System.out.println(countMap);
    }
}
