public class BoggleBoard {

    public static void main(String[] args) {
        recursiveWordSearch("hellomynameis");
    }

    /*private char[][] dice = {
        {'R', 'I', 'F', 'O', 'B', 'X'}, // 0
        {'I', 'F', 'E', 'H', 'E', 'Y'}, // 1
        {'D', 'E', 'N', 'O', 'W', 'S'}, // 2
        {'U', 'T', 'O', 'K', 'N', 'D'}, // 3
    };

    private String[][] board = {
        {"W", "A"},
        {"D", "E"},
    };

    public BoggleBoard() {

    }*/

    //write a method that looks at both ends of a word, word search for a long line
    //given a 16 letter string write a method called recursiveWordSearch that passes to find word method
    public static String recursiveWordSearch(String theWord) {
        while(theWord.length() > 2) {
            //findWord(theWord);
            return recursiveWordSearch(theWord.substring(0, theWord.length() - 1));
        }
    }

    public void findWord(String theWord) {

    }
}