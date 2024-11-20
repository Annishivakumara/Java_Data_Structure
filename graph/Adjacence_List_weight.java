package graph;
import java.util.Scanner;
import  java.util.ArrayList;
public class Adjacence_List_weight{
static class Edge{
    int src;
    int dest;
    int wigh;
     Edge(int src,int dest,int wigh){
        this.src=src;
        this.dest=dest;
        this.wigh=wigh;
    }
}
//CreateGraph Method 
public  static  void  creategraph(ArrayList<Edge> graph[]){ 
   for(int i=0;i<graph.length;i++){
    graph[i]=new ArrayList<Edge>();
   }
   graph[0].add(new Edge(0, 2,1));
   graph[1].add(new Edge(1, 2,3));
   graph[1].add(new Edge(1, 3,5));
   graph[2].add(new Edge(2, 0,10));
   graph[2].add(new Edge(2, 1,0));
   graph[2].add(new Edge(2, 3,5));
   graph[3].add(new Edge(3, 1,4));
   graph[3].add(new Edge(3, 2,6));
}
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number of Vertexe's ");
        int v=sc.nextInt();
   
        ArrayList<Edge>  [] graph= new ArrayList[v];
        creategraph(graph);
       
        // Print The graph
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println("srs: "+e.src+ " to  dest: "+e.dest+ " Weight: "+e.wigh);
        }
    }
}
