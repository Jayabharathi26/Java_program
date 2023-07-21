import java.util.*;

 class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int wordCount = 0;
        int vowelCount = 0;
        for (String word : sentence.split(" ")) {
            wordCount++;
            int count = 0;
            for (char c : word.toCharArray()) {
                if (isVowel(c)) {
                    count++;
                    vowelCount++;
                }
            }
            System.out.printf("Word %d has %d vowels.%n", wordCount, count);
        }
        System.out.printf("Total number of vowels in the sentence: %d%n", vowelCount);
    }

    public static boolean isVowel(char c) {
        String vowels = "AEIOUaeiou";
        return vowels.indexOf(c) != -1;
    }
}