package org.book.etc.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1098 {
    int[][] grid;

    public Codeup1098(int xLen, int yLen) {
        this.grid = new int[xLen+1][yLen+1];
    }

    public void printArray() {
        for (int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }

    public void printArray2() {

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[1].length; j++) {
                System.out.printf("%d ", grid[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public void drawLog(int l, int d, int row, int column) {
        for (int i = 0; i < l; i++) {
            if(d == 1){
                grid[row++][column] = 1;
            }else{
                grid[row][column++] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Codeup1098 cu = new Codeup1098(sc.nextInt(), sc.nextInt());
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            cu.drawLog(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//            cu.drawLog(2, 0, 1, 1);
//            cu.drawLog(3, 1, 2, 3);
//            cu.drawLog(4, 1, 2, 5);
        }
        cu.printArray2();
    }
}
