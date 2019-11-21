/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Hirusha
 */
public class TSPAlgo {
    private static int numberOfNodes = 8;
    private static Stack<Integer> stack;
 
    public TSPAlgo(){
        stack = new Stack<>();
        
    }
 
    public static ArrayList calculateShortestPath(int adjacencyMatrix[][]) {
        numberOfNodes = adjacencyMatrix[1].length - 1;
        int[] visited = new int[numberOfNodes + 1];
        visited[1] = 1;
        stack.push(1);
        int element, dst = 0, i;
        int min = Integer.MAX_VALUE;
        boolean minFlag = false;
        ArrayList<Integer> output = new ArrayList();
        output.add(1);
 
        while (!stack.isEmpty()) {
            element = stack.peek();
            i = 1;
            min = Integer.MAX_VALUE;
            while (i <= numberOfNodes) {
                if (adjacencyMatrix[element][i] > 1 && visited[i] == 0) {
                    if (min > adjacencyMatrix[element][i]) {
                        min = adjacencyMatrix[element][i];
                        dst = i;
                        minFlag = true;
                    }
                }
                i++;
            }
            if (minFlag) {
                visited[dst] = 1;
                stack.push(dst);
                output.add(dst);
                minFlag = false;
                continue;
            }
            stack.pop();
        }
        
        return output;
    }
}
