package org.book.etc.codeup;

public class ArrayPrinter {

    public void printGrid(int[][] grid) {

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[1].length; j++) {
                System.out.printf("%d ", grid[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
