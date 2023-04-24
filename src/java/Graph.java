import java.util.*;
public class Graph extends AbstractGraph
{
     
    ArrayList<AdjacentList> adjacencies; // A set of adjacency lists

    Graph()
    {
        this.vertexList = new ArrayList<Vertex>();
        this.adjacencies = new ArrayList<AdjacentList>();
    }
    Graph(List<Vertex> vertices)
    {
        this.vertexList = vertices;
        this.adjacencies = new ArrayList<AdjacentList>();
    }
    Graph(List<Vertex> vertices, ArrayList<AdjacentList> adj)
    {
        this.vertexList = vertices;
        this.adjacencies = adj;
    }

    public int find(int value) // find method returns index of Vertex if found and -1 otherwise
    {
        for (int i = 0; i < vertexList.size(); ++i) 
        {
            if (vertexList.get(i).val == value)
            {
                return i;
            }
            
        }
        return -1;
    }
    /*void add(Vertex v)
    {
        this.vertexList.add(v);
    }*/
}
