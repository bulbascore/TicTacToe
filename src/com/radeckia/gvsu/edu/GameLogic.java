package com.radeckia.gvsu.edu;

/**
 * Created by Alex on 5/27/2016.
 */

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    static int A1, A2, A3, B1, B2, B3, C1, C2, C3;

    Scanner sc = new Scanner(System.in);



    private String computerMove() {
        Random rn = new Random();
        String cpuMove = "";
        int isMoveTrue = 0;

        while(isMoveTrue == 0) {
            int move = rn.nextInt(9) + 1;
            switch (move) {
                case 1:
                    if (A1 == 0) {
                        cpuMove = "A1";
                        isMoveTrue = 1;
                    }
                    break;
                case 2:
                    if (B1 == 0) {
                        cpuMove = "B1";
                        isMoveTrue = 1;
                    }
                    break;
                case 3:
                    if (C1 == 0) {
                        cpuMove = "C1";
                        isMoveTrue = 1;
                    }
                    break;
                case 4:
                    if (A2 == 0) {
                        cpuMove = "A2";
                        isMoveTrue = 1;
                    }
                    break;
                case 5:
                    if (B2 == 0) {
                        cpuMove = "B2";
                        isMoveTrue = 1;
                    }
                    break;
                case 6:
                    if (C2 == 0) {
                        cpuMove = "C2";
                        isMoveTrue = 1;
                    }
                    break;
                case 7:
                    if (A3 == 0) {
                        cpuMove = "A3";
                        isMoveTrue = 1;
                    }
                    break;
                case 8:
                    if (B3 == 0) {
                        cpuMove = "B3";
                        isMoveTrue = 1;
                    }
                    break;
                case 9:
                    if (C3 == 0) {
                        cpuMove = "C3";
                        isMoveTrue = 1;
                    }
                    break;
                //default:
            }
        }
        return cpuMove;
    }

    private boolean isRowWon(int a, int b, int c) {
        return (a == b) & (a == c) & (a != 0);
    }

    private boolean isGameWon() {
        if (isRowWon(A1, A2, A3))
            return true;
        if (isRowWon(B1, B2, B3))
            return true;
        if (isRowWon(C1, C2, C3))
            return true;
        if (isRowWon(A1, B1, C1))
            return true;
        if (isRowWon(A2, B2, C2))
            return true;
        if (isRowWon(A3, B3, C3))
            return true;
        if (isRowWon(A1, B2, C3))
            return true;
        if (isRowWon(A3, B2, C1))
            return true;
        return false;
    }

}

