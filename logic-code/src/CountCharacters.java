import java.util.Map;
import java.util.TreeMap;

public class CountCharacters {
    public static void main(String[] args) {
        countLetters("Hello World");
        countLetters("Bismillah");
        countLetters("MasyaAllah");
    }

    private static void countLetters(String input){
        Map<Character, Integer> letterCount = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') { // Abaikan spasi
                letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.print("[");
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue());
            System.out.print(", ");
        }
        System.out.println("]");
    }
}
