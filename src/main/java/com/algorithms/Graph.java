package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    
    private int value;
    private boolean visited;
    private List<Graph> adjacent;

    public Graph(int value) {
        this.value = value;
        this.adjacent = new ArrayList<>();
        this.visited = false;
    }

    public List<Graph> getAdjacent() {

        return adjacent;

    }

    public void addNode(Graph adj) {
        this.adjacent.add(adj);
    }

    public int getValue() {
        return this.value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {

        this.visited = visited;
    }
}
