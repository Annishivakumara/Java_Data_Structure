package graph;
import java.util.Scanner;
import  java.util.ArrayList;
public class impli{
class Edge{
    int src;
    int dest;
    public Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}
public void creategraph(ArrayList<Edge> graph[]){ 
   for(int i=0;i<graph.length;i++){
    graph[i]=new ArrayList<Edge>();
   }
}
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  Number of Vertexe's ");
        int v=sc.nextInt();
   
       ArrayList<Edge> graph[]= new ArrayList[v];
    }
}
