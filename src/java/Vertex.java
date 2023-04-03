import java.util.*;
public class Vertex {
    int val;
    List<List> adjList;
    int dist;
    Vertex path;

    Vertex(int v, List<List> adjList)
    {
        this.val = v;
        this.adjList = adjList;
    }
}
