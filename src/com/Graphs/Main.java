package com.Graphs;

public class Main {

    public static void main(String[] args) {
//        var graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addEdge("B","A");
//        graph.addEdge("C","A");
//        graph.addEdge("A","B");
//        graph.removeEdge("A","B");
//        graph.removeNode("A");
//        graph.print();

        //mosh graph implementation:
//        var graph = new Graphs();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A","B");
//        graph.addEdge("B","D");
//        graph.addEdge("D","C");
//        graph.addEdge("A","C");
//        graph.print();
//        graph.traverseDepthFirst("A");
//        System.out.println();
//        graph.Dfs("A");
//        System.out.println();
//        graph.Bfs("A");

        //topological sort implementation:
//        var graph = new Graphs();
//        graph.addNode("X");
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("P");
//        graph.addEdge("X","A");
//        graph.addEdge("X","B");
//        graph.addEdge("A","P");
//        graph.addEdge("B","P");
//        System.out.println(graph.topologicalSort());

        //cycle detection
        var graph = new Graphs();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("B","C");
        graph.addEdge("D","A");
        System.out.println(graph.hasCycle());
    }
}
