import java.lang.Comparable;
import java.util.*;
public class Vertex {
    int val;
    public List<AdjVertex> adjList;
    public int dist;
    Vertex path;
    boolean known;

    Vertex(int v, List<AdjVertex> adjList)
    {
        this.val = v;
        this.adjList = adjList;
    }
    Vertex(int v)
    {
        this.val = v;
        this.adjList = new ArrayList<AdjVertex>();
    }
    /*public static int compareTo(Vertex vert)
    {
        int theDistance = dist;
        return (theDistance - vert.dist);
    }*/
}
