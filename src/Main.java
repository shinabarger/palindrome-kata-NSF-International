public class Main {

    public static void main(String[] args) {
        // write your code here

    }
    public static Boolean palindrome(String exampleWord) {

        char beginningOfWord;
        char endOfWord;
        int lengthOfWord = exampleWord.length();
        exampleWord = exampleWord.toLowerCase();

        for(int i = 0; i <= lengthOfWord; i++) {

            if (exampleWord.charAt(i) != exampleWord.charAt(lengthOfWord - 1)) {
                return false;

            } else lengthOfWord -= 1;

        }
        return  true;
    }

}
