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
<<<<<<< Updated upstream
        this.adjList = new ArrayList<adjVertex>();
=======
        this.adjList = new ArrayList<AdjVertex>();
    }
    public int compareTo(Vertex vert)
    {
        return (this.dist - vert.dist);
>>>>>>> Stashed changes
    }
}
