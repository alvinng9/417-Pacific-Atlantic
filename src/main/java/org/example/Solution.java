package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        boolean[][] pac = new boolean[row][col];
        boolean[][] atl = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            helper(heights, pac, i, 0, heights[i][0]);
            helper(heights, atl, i, col - 1, heights[i][col - 1]);
        }

        for (int i = 0; i < col; i++) {
            helper(heights, pac, 0, i, heights[0][i]);
            helper(heights, atl, row - 1, i, heights[row - 1][i]);
        }

        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pac[i][j] && atl[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    public void helper(int[][] heights, boolean[][] ocean, int x, int y, int height) {
        if (x < 0 || y < 0 || x >= heights.length || y >= heights[0].length || heights[x][y] < height || ocean[x][y]) {
            return;
        }
        ocean[x][y] = true;
        helper(heights, ocean, x + 1, y, heights[x][y]);
        helper(heights, ocean, x - 1, y, heights[x][y]);
        helper(heights, ocean, x, y + 1, heights[x][y]);
        helper(heights, ocean, x, y - 1, heights[x][y]);
    }

}
