import java.util.*;
public class Graph {
    List<Vertex> vertexList; // List of vertices in the graph.
    ArrayList<AdjacentList> adjacencies; // A set of adjacency lists

    Graph()
    {
        this.vertexList = new ArrayList<Vertex>();
        this.adjacencies = new ArrayList<AdjacentList>();
    }
    Graph(List<Vertex> vertices)
    {
        this.vertexList = vertices;
    }
    Graph(List<Vertex> vertices, ArrayList<AdjacentList> adj)
    {
        this.vertexList = vertices;
        this.adjacencies = adj;
    }

    /*void add(Vertex v)
    {
        this.vertexList.add(v);
    }*/
}
