public class PatternCount {
    public static void main(String[] args) {
        System.out.println(patternCount("palindrom", "ind"));
        System.out.println(patternCount("abakadabra", "ab"));
        System.out.println(patternCount("hello", ""));
        System.out.println(patternCount("ababab", "aba"));
        System.out.println(patternCount("aaaaaa", "aa"));
        System.out.println(patternCount("hell", "hello"));
    }

    private static int patternCount(String inputCharacter, String findCharacter) {
        if (findCharacter.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i <= inputCharacter.length() - findCharacter.length(); i++) {
            boolean match = true;

            for (int j = 0; j < findCharacter.length(); j++) {
                if (inputCharacter.charAt(i + j) != findCharacter.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        return count;
    }
}
