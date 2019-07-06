package com.company;

public class SurroundedRegions {

    public static void main(String[] args) {
        // write your code here
    }

    public void solve(char[][] board) {
        int count;
        for(int i = 0; i < board.length; i++) {
            count = i;
            for(int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    if(i != 0) {
                        int temp = i-1;
                        if(board[temp][i] != 'X') {
                            while(count >= 0) {
                                if(board[temp--][i] == 'X') {
                                    board[temp++][i] = 'X';
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
