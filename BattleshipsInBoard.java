public class BattleshipsInBoard {
    
    static int countBattleships(char[][] board) {

        int result = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (i > 0 && board[i - 1][j] == 'X') {
                    continue;
                }
                if (j > 0 && board[i][j - 1] == 'X') {
                    continue;
                }
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X','.','.','X'},
            {'.','.','.','X'},
            {'.','.','.','X'}
        };
        System.out.println(countBattleships(board));
    }
}
