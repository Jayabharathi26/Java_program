import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Calculate character frequencies
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Create a PriorityQueue to sort entries in descending order based on frequency and character values
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey().compareTo(a.getKey()); // Sort alphabetically if frequencies are the same
            } else {
                return b.getValue().compareTo(a.getValue()); // Sort by frequency
            }
        });
        
        // Add entries to the PriorityQueue
        pq.addAll(frequencyMap.entrySet());
        
        // Print characters and frequencies
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        scanner.close();
    }
}
