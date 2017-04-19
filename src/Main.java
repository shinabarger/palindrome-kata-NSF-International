public class Main {

    public static void main(String[] args) {
        // write your code here

    }
    public static Boolean palindrome(String exampleWord) {
        char beginningOfWord;
        char endOfWord;
        int lengthOfWord = exampleWord.length();


        if(exampleWord.charAt(0) == exampleWord.charAt(lengthOfWord-1)) {
            return true;
        }
        else return false;
    }

}
