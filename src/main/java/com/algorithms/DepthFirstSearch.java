package com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private List<Graph> resultList = new ArrayList<>();

    private Stack<Graph> graphStack = new Stack<>();

    public List<Graph> dfs(Graph graph) {
        
        
        traverse(graph);


        return resultList;

    }

    public void traverse(Graph graph) {

        if(graph !=null && !graph.isVisited()) {

            System.out.println(graph.getValue());
            graph.setVisited(true);
            resultList.add(graph);

            for(Graph node : graph.getAdjacent()) {
                traverse(node);
            }

        }
    }
    
}
