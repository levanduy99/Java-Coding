import java.util.HashSet;

public class ValidSudoku {

    //solution 1
    public static boolean isValidSudoku(char[][] board) {

        int size = board.length;

        HashSet<Character> setSubBox1 = new HashSet<>();
        HashSet<Character> setSubBox2 = new HashSet<>();
        HashSet<Character> setSubBox3 = new HashSet<>();

        for (int c = 0; c < size; c++) {
            HashSet<Character> setRow = new HashSet<>();
            HashSet<Character> setCol = new HashSet<>();
            if (c % 3 == 0) {
                setSubBox1 = new HashSet<>();
                setSubBox2 = new HashSet<>();
                setSubBox3 = new HashSet<>();
            }
            for (int r = 0; r < size; r ++) {
                //check row
                char tempCharRow = board[c][r];
                if (tempCharRow != '.') {

                    if (setRow.contains(tempCharRow)) {
                        return false;
                    } else {
                        setRow.add(tempCharRow);
                    }  
                    
                    //check subbox
                    if (r < 3) {
                        if (setSubBox1.contains(tempCharRow)) {
                            return false;
                        } else {
                            setSubBox1.add(tempCharRow);
                        }  
                    } else if (r < 6) {
                        if (setSubBox2.contains(tempCharRow)) {
                            return false;
                        } else {
                            setSubBox2.add(tempCharRow);
                        }  
                    } else {
                        if (setSubBox3.contains(tempCharRow)) {
                            return false;
                        } else {
                            setSubBox3.add(tempCharRow);
                        }  
                    }
                }

                //check row
                char tempCharCol = board[r][c];
                if (tempCharCol != '.') {
                    if (setCol.contains(tempCharCol)) {
                        return false;
                    } else {
                        setCol.add(tempCharCol);
                    }
                }
            }
        }

        return true;
    }

    //solution 2
    public static boolean isSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                
                if (board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !columns.add(board[j][i])) {
                    return false;
                }

                int rowIndex = 3 * (i/3);
                int colIndex = 3 * (i%3);
                if (board[rowIndex + j/3][colIndex + j%3] != '.' && !cube.add(board[rowIndex + j/3][colIndex + j%3])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'3','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isSudoku(board));
    }
}
