package com;
import java.util.Arrays;

public class View {
    private String[][] board = new String[15][15];

    public void welcome() {
        System.out.println("控制台五子棋V0.114514");
        System.out.println("棋盘 15x15, 行号 1~15， 列标 A~O\n落子格式：列字母 + 行号\n例如：J8");
        System.out.println("_________________________________________________");
    }

    public void init() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                board[i][j] = "●";
            }
        }
    }

    public void paint() {
        System.out.print("   ");
        for (int i = 65; i <= 79; i++) {
            char ch = (char) i;
            System.out.printf(" %c ", ch);
        }
        System.out.printf("\n");

        for (int i = 1; i <= 15; i++) {
            System.out.printf(" %2d ", i);
            for (int j = 0; j <15; j++) {
                System.out.printf("%s  ",board[i - 1][j]);
            }
            System.out.printf("\n");
        }
    }
}
