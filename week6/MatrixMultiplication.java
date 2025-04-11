/*Write a Java program that performs matrix multiplication using multiple threads*/
package week6;

import java.util.Scanner;
import java.lang.Thread;

class Multiplier extends Thread {
    int c = 0;
    int a[][];
    int b[][];
    int row;
    int col;

    Multiplier(int a[][], int b[][], int row, int col) {
        this.a = a;
        this.b = b;
        this.row = row;
        this.col = col;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            c += a[row][i] * b[i][col];
        }
    }
}

public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row1, col1, row2, col2;
        System.out.println("Enter the number of rows and columns of 1st matrix: ");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns of 2nd matrix: ");
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int m[][] = new int[row1][col2];
        if (col1 != row2) {
            System.out.println("Matrix multiplication not possible.");
            sc.close();
            return;
        }
        System.out.println("Enter the 1st array: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        Multiplier t[] = new Multiplier[row1 * col2];
        int pos = 0;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                t[pos] = new Multiplier(a, b, i, j);
                t[pos].start();
                pos++;
            }
        }
        for (int i = 0; i < row1 * col2; i++) {
            try {
                t[i].join();
                m[t[i].row][t[i].col] = t[i].c;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Resultant Matrix: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
 * Sample Output:
 * Resultant Matrix:
 * 19 22
 * 43 50
 */