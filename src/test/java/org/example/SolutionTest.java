package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void pacificAtlanticTest() {
        Solution solution = new Solution();
        int[][] input = {{1,2,2,3,5}, {3,2,3,4,4}, {2,4,5,3,1}, {6,7,1,4,5}, {5,1,1,2,4}};
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(0,4));
        output.add(Arrays.asList(1,3));
        output.add(Arrays.asList(1,4));
        output.add(Arrays.asList(2,2));
        output.add(Arrays.asList(3,0));
        output.add(Arrays.asList(3,1));
        output.add(Arrays.asList(4,0));
        Assert.assertEquals(output, solution.pacificAtlantic(input));
    }
}