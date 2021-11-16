package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        boolean rsl = true;
        if (!monoHorizontal(board) && !monoVertical(board)) {
            rsl = false;
        }
        return rsl;
    }
    public static boolean monoHorizontal(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != 1) {
                    result = false;
                    break;
                }
                if (board[i][board.length - 1] == 1) {
                    return true;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != 1) {
                    result = false;
                    break;
                }
                if (board[board.length - 1][j] == 1) {
                    return true;
                }
            }
        }
        return result;
    }
}
