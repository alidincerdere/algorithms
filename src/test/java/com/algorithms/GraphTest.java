package com.algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GraphTest {

    @Test
    public void bfsTest() {

        Graph graph = new Graph(1);
        Graph graph2 = new Graph(2);
        Graph graph3 = new Graph(3);
        Graph graph4 = new Graph(4);
        Graph graph5 = new Graph(5);

        graph.addNode(graph2);
        graph.addNode(graph3);
        graph2.addNode(graph3);
        graph2.addNode(graph4);
        graph3.addNode(graph5);
        graph4.addNode(graph5);
        graph5.addNode(graph);

        
        List<Graph> result = BreadthFirstSearch.bfs(graph);

        List<Graph> expected = new ArrayList<>();

        expected.add(graph);
        expected.add(graph2);
        expected.add(graph3);
        expected.add(graph4);
        expected.add(graph5);

        assertArrayEquals(expected.toArray(), result.toArray());

    

    }

    @Test
    public void dfsTest() {

        Graph graph = new Graph(1);
        Graph graph2 = new Graph(2);
        Graph graph3 = new Graph(3);
        Graph graph4 = new Graph(4);
        Graph graph5 = new Graph(5);

        graph.addNode(graph2);
        graph.addNode(graph3);
        graph2.addNode(graph4);
        graph2.addNode(graph3);
        graph3.addNode(graph5);
        graph4.addNode(graph5);
        graph5.addNode(graph);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

        List<Graph> result = depthFirstSearch.dfs(graph);

        List<Graph> expected = new ArrayList<>();

        expected.add(graph);
        expected.add(graph2);
        expected.add(graph4);
        expected.add(graph5);
        expected.add(graph3);

        assertArrayEquals(expected.toArray(), result.toArray());


    }
    
}
