public class Main {

    public static Boolean palindrome(String exampleWord) {

        int lengthOfWord = exampleWord.length();
        exampleWord = exampleWord.toLowerCase();

        for (int i = 0; i <= lengthOfWord; i++) {

            if (exampleWord.charAt(i) != exampleWord.charAt(lengthOfWord - 1)) {
                return false;

            } else lengthOfWord -= 1;

        }
        return true;
    }

}
