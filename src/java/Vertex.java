import java.lang.Comparable;
import java.util.*;
public class Vertex  extends AbstractVertex
{
    
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
        super(v);
        this.adjList = new ArrayList<AdjVertex>();
    }
    public boolean equals(Object o)
    {
        if(!(o instanceof Vertex))
        {
            return false;
        }
        Vertex vert = (Vertex) o;
        return val == (vert.val);
    }
}
