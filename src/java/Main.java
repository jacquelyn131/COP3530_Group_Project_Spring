import java.util.*;
public class Main {
    

    public static void main(String[] args)
    {
        // Create and populate a graph for testing.
        Vertex vertList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        AdjVertex adjVertList = {{2,2}, {4, 4}, {1,2}, {3,1}, {5,1}, {2,1}, {6,1}
                                , {1,4}, {5,2}, {7,4},{2,1}, {4,2}, {6,Integer.MAX_VALUE}, {8,1}
                                , {3,1}, {5,Integer.MAX_VALUE}, {9,1}, {4,4}, {8,2}, {10,4}
                                , {5,1}, {7,2}, {9,Integer.MAX_VALUE}, {11,2}, {7,4}};


        /**
        Example input: graph = {{1: {2:2}, {4:4}},
                            {2: {1:2}, {3:1}, {5:1}},
                            {3: {2:1}, {6:1}},
                            {4: {1:4}, {5:2}, {7:4}},
                            {5: {2:1}, {4:2}, {6:infinity}, {8:1}},
                            {6: {3:1}, {5:infinity}, {9:1}},
                            {7: {4:4}, {8:2}, {10:4}},
                            {8: 5, 7, 9, 11},
                            {10: {7:4}, {11:2}},
                            {11: {10:2}, {8:2}, {12:2}},
                            {12: {11:2}, {9:2}}},
                  zombie = 1, player = 12
        Output: {1, 2, 3, 6, 9, 12}
        */
        Graph gameGraph = new Graph(vertList, adjVertList);

        // Call dijkstra() on the new graph.
        dijkstra(gameGraph, vertList);
        System.out.println(dijkstra());

        // Print the path calculated by dijkstra().
    }

    public void dijkstra(Graph g, Vertex s)
    {

        int counter = 0;
        int minDistance = Integer.MAX_VALUE;
        boolean known = true;
        s.path = s;


        // Set the dist of all vertices to 0 and the path of all vertices to null.
        for (int i = 0; i < g.vertexList.size(); ++i)
        {
            g.vertexList.get(i).dist = 0;
            g.vertexList.get(i).path = null;
        }
        // Create a priority queue of type Vertex
        PriorityQueue<Vertex> q = new PriorityQueue<Vertex>();

        queue(q, known);
        while (counter < g.vertices.size())
        {
            for(int i = 0; i < g.vertices.size(); i++)
            {
                if(g.vertices.get(i).dist < Integer.MAX_VALUE)// if the distance is less than infinity 
                {
                    if(known && g.vertices.get(i).dist < minDistance)//if vertex is known and distance is less than the minDistance
                    {
                        minDistance = g.vertices.get(i).dist;//makes current distance the minimum distance of vertex at g.vertexList.get(i)
                    }
                }
            }
            s.known = true;//sets vertex to known
            counter ++;
        }

        // {
                // get the next Vertex to be set to known.
                // Do something.
        // }
    }

    public static PriorityQueue<Vertex> queue (PriorityQueue<Vertex> pq, boolean k )
    {
        for(int i = 0; i < g.vertexList.size(); i++)// traverse through Graph g to check if current vertex has been visited
        {
            Vertex currentPV = g.vertexList.get(i);

            if(currentPV.known)
            {
                continue;
            }
            
            pq.add(currentPV);//adds current vertex to PriorityQueue q
        }

        return pq;//returns PriorityQueue
    }
}

