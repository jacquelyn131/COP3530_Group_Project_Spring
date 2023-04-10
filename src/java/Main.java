import java.util.*;
public class Main {
    

    public static void main(String[] args)
    {
        // Create and populate a graph for testing.

        // Call dijkstra() on the new graph.
        
        // Print the path calculated by dijkstra().
    }

    public void dijkstra(Graph g, Vertex s)
    {
        // Set the dist of all vertices to 0 and the path of all vertices to null.
        for (int i = 0; i < g.vertexList.size(); ++i)
        {
            g.vertexList.get(i).dist = 0;
            g.vertexList.get(i).path = null;
        }
        // Create a priority queue of type Vertex
        PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();
        q.add(s);
        while (!q.isEmpty)
        {
            Vertex v = q.poll();
            v.known = true;
            // for each Vertex adjacent to v:
                // get the next Vertex to be set to known.
                // if the path from v is the shortest path
                // Do something.
        }
    }
}
