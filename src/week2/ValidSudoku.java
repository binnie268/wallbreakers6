package week2;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] charArray =
                {
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};


        System.out.println(isValidSudoku(charArray));


    }


    public static boolean isValidSudoku(char[][] board) {

        Map<Character,Integer> sudokuMapCount = new HashMap<>();

        if (checkRows(board, sudokuMapCount) && checkColumns(board, sudokuMapCount) && checkSquares(board, sudokuMapCount)) return true;
        return false;

    }

    private static boolean checkSquares(char[][] board, Map<Character, Integer> sudokuMapCount) {
        int count = 0;
        sudokuMapCount.clear();
        for(int i = 0; i < board.length; i++) {
            if(count == 3) {
                sudokuMapCount.clear();
                count = 0;
            }
            count++;
            for(int j= 0; j < 3; j++) {
                System.out.println(j + " " + i);
                System.out.println(board[j][i]);
                if(sudokuMapCount.get(board[j][i]) == null && board[j][i] != '.') {
                    sudokuMapCount.put(board[j][i],1);
                } else if (board[j][i] != '.'){
                    return false;
                }
            }
        }

        count = 0;
        sudokuMapCount.clear();
        for(int i = 0; i < board.length; i++) {
            if(count == 3) {
                sudokuMapCount.clear();
                count = 0;
            }
            count++;
            for(int j= 3; j < 6; j++) {
                System.out.println(j + " " + i);
                System.out.println(board[j][i]);
                if(sudokuMapCount.get(board[j][i]) == null && board[j][i] != '.') {
                    sudokuMapCount.put(board[j][i],1);
                } else if (board[j][i] != '.'){
                    return false;
                }
            }
        }

        count = 0;
        sudokuMapCount.clear();
        for(int i = 0; i < board.length; i++) {
            if(count == 3) {
                sudokuMapCount.clear();
                count = 0;
            }
            count++;
            for(int j= 6; j < 9; j++) {
               System.out.println(i + " " + j);
                if(sudokuMapCount.get(board[j][i]) == null && board[j][i] != '.') {
                    sudokuMapCount.put(board[j][i],1);
                } else if (board[j][i] != '.'){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkColumns(char[][] board, Map<Character, Integer> sudokuMapCount) {
        for(int i = 0; i < board.length; i++) {
            sudokuMapCount.clear();
            for(int j = 0; j < board[0].length; j++) {
//                System.out.println(j + " " + i);
//                System.out.println(board[j][i]);
                if(sudokuMapCount.get(board[j][i]) == null && board[j][i] != '.') {
                    sudokuMapCount.put(board[j][i],1);
                } else if (board[j][i] != '.'){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkRows(char[][] board, Map<Character, Integer> sudokuMapCount) {
        for(int i = 0; i < board.length; i++) {
            sudokuMapCount.clear();
            for(int j = 0; j < board[0].length; j++) {
                System.out.println(i + " " + j);
                System.out.println(board[i][j]);
                if(sudokuMapCount.get(board[i][j]) == null && board[i][j] != '.') {
                    sudokuMapCount.put(board[i][j],1);
                } else if (board[i][j] != '.'){
                    return false;
                }
            }
        }
        return true;
    }


}
