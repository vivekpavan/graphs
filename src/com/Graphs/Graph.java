package com.Graphs;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

//NOT WORKING:


public class Graph {
    private class Node{
        private String label;
        public Node(String label){
            this.label = label;
        }
    }
    private LinkedList<List<Node>> alpha  = new LinkedList<>();
    private Hashtable<Integer,String> table = new Hashtable<>();
    private int count;
    public void addNode(String label){
        if(!table.contains(label)) {
            table.put(count, label);
            count++;
            List<Node> list = new LinkedList<>();
            list.add(new Node(label));
            alpha.add(list);
        }
    }
    public void removeNode(String label){
        if(table.contains(label)) {
            for(var i = 0;i <= count ; i++){
                if(table.get(i) == label) {
                    table.remove(i);
                    break;
                }
            }
            var node = new Node(label);
            for(var list : alpha) {
                if(list.get(0).label == label) {
                    alpha.remove(list);
                    break; // CONCURRENT MODIFICATION EXCEPTION
                }
                else {
                    for (var nod : list) {
                        if (nod.label == node.label) {
                            list.remove(nod);
                            break;
                        }
                    }
                }
            }
            count--;
        }
    }
    public void addEdge(String add,String to){
        for(var list : alpha){
            if(list.get(0).label == to && !list.contains(new Node(add))){
                list.add(new Node(add));
            }
        }
    }
    public void removeEdge(String remove,String from){
        for(var list : alpha){
            if(list.get(0).label == from && list.contains(remove))
                list.remove(remove);
        }
    }
    public void print(){
        for (var list : alpha) {
            if (list.size() > 1 && !(list.get(0) == null)) {
                for (var i = 1; i <  list.size(); i++) {
                    System.out.println(list.get(0).label + " is connected with " + list.get(i).label);
                }
            }
            else
                System.out.println(list.get(0).label + " is connected to nothing");
        }
    }
}
