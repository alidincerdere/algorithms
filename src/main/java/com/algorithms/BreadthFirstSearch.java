package com.algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {


    public static List<Graph> bfs(Graph graph) {

        List<Graph> result = new ArrayList<>();

        Queue<Graph> graphQueue = new ArrayDeque<>();

        graphQueue.add(graph);

        while(!graphQueue.isEmpty()){

            Graph currentNode = graphQueue.poll();

            if(!currentNode.isVisited()) {
                currentNode.setVisited(true);
                System.out.println(currentNode.getValue());
                result.add(currentNode);
                graphQueue.addAll(currentNode.getAdjacent());
            }
            

        }

        return result;

    }
    
    
}
