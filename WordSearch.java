public class WordSearch {
 
    boolean visited[][];

    static boolean exist(char[][] board, String word) {

        int rows = board.length;
        int columns = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (word.charAt(0) == board[i][j] && searchWord(i, j, 0, word, board)) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean searchWord(int i, int j, int index, String word, char[][] board) {

        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j > board[0].length) {
            return false;
        } 
        
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = searchWord(i + 1, j, index + 1, word, board) 
            || searchWord(i - 1, j, index + 1, word, board)
            || searchWord(i, j + 1, index + 1, word, board)
            || searchWord(i, j - 1, index + 1, word, board);

        board[i][j] = temp;

        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
