public class PangramCheck {
    public static void main(String[] args) {
        String userInput = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(userInput);

        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        String lowercaseSentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (lowercaseSentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
