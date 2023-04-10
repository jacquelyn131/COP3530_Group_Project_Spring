import java.lang.Comparable;
import java.util.*;
public class Vertex {
    int val;
    List<adjVertex> adjList;
    int dist;
    Vertex path;

    Vertex(int v, List<adjVertex> adjList)
    {
        this.val = v;
        this.adjList = adjList;
    }
    Vertex(int v)
    {
        this.val = v;
        this.adjList = new ArrayList<AdjVertex>();
    }
    public static int compareTo(Vertex vert)
    {
        return (this.dist - vert.dist);
    }
}
