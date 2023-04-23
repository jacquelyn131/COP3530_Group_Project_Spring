import java.util.*;
public class Main {
    

    public static void main(String[] args)
    {
        
        // Create and populate a graph for testing.
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(7);
        Vertex v8 = new Vertex(8);
        Vertex v9 = new Vertex(9);
        Vertex v10 = new Vertex(10);
        Vertex v11 = new Vertex(11);
        Vertex v12 = new Vertex(12);
        // v1 adjacency
        AdjVertex av12 = new AdjVertex(v2, 2);
        AdjVertex av14 = new AdjVertex(v4, 4);
        v1.adjList = new ArrayList<AdjVertex>();
        v1.adjList.add(av12);
        v1.adjList.add(av14);
        // v2 adjacency
        AdjVertex av21 = new AdjVertex(v1, 2);
        AdjVertex av23 = new AdjVertex(v3, 1);
        AdjVertex av25 = new AdjVertex(v5, 1);
        v2.adjList.add(av21);
        v2.adjList.add(av23);
        v2.adjList.add(av25);
        // v3 adjacency
        AdjVertex av32 = new AdjVertex(v2, 1);
        AdjVertex av36 = new AdjVertex(v6, 1);
        v3.adjList.add(av32);
        v3.adjList.add(av36);
        // v4 adjacency
        AdjVertex av41 = new AdjVertex(v1, 4);
        AdjVertex av45 = new AdjVertex(v5, 2);
        AdjVertex av47 = new AdjVertex(v7, 4);
        v4.adjList.add(av41);
        v4.adjList.add(av45);
        v4.adjList.add(av47);
        // v5 adjacency
        AdjVertex av54 = new AdjVertex(v4, 2);
        AdjVertex av52 = new AdjVertex(v2, 1);
        AdjVertex av56 = new AdjVertex(v6, Integer.MAX_VALUE);
        AdjVertex av58 = new AdjVertex(v8, 1);
        v5.adjList.add(av54);
        v5.adjList.add(av52);
        v5.adjList.add(av56);
        v5.adjList.add(av58);
        // v6 adjacency
        AdjVertex av65 = new AdjVertex(v5, Integer.MAX_VALUE);
        AdjVertex av63 = new AdjVertex(v3, 1);
        AdjVertex av69 = new AdjVertex(v9, 1);
        v6.adjList.add(av65);
        v6.adjList.add(av63);
        v6.adjList.add(av69);
        // v7 adjacency
        AdjVertex av74 = new AdjVertex(v4, 4);
        AdjVertex av78 = new AdjVertex(v8, 2);
        AdjVertex av710 = new AdjVertex(v10, 4);
        v7.adjList.add(av74);
        v7.adjList.add(av78);
        v7.adjList.add(av710);
        // v8 adjacency
        AdjVertex av87 = new AdjVertex(v7, 2);
        AdjVertex av85 = new AdjVertex(v5, 1);
        AdjVertex av89 = new AdjVertex(v9, Integer.MAX_VALUE);
        AdjVertex av811 = new AdjVertex(v11, 2);
        v8.adjList.add(av87);
        v8.adjList.add(av85);
        v8.adjList.add(av89);
        v8.adjList.add(av811);
        // v9 adjacency
        AdjVertex av98 = new AdjVertex(v8, Integer.MAX_VALUE);
        AdjVertex av96 = new AdjVertex(v6, 1);
        AdjVertex av912 = new AdjVertex(v12, 2);
        v9.adjList.add(av98);
        v9.adjList.add(av96);
        v9.adjList.add(av912);
        // v10 adjacency
        AdjVertex av107 = new AdjVertex(v7, 4);
        AdjVertex av1011 = new AdjVertex(v11, 2);
        v10.adjList.add(av107);
        v10.adjList.add(av1011);
        // v11 adjacency
        AdjVertex av1110 = new AdjVertex(v10, 2);
        AdjVertex av118 = new AdjVertex(v8, 2);
        AdjVertex av1112 = new AdjVertex(v12, 2);
        v11.adjList.add(av1110);
        v11.adjList.add(av118);
        v11.adjList.add(av1112);
        // v12 adjacency
        AdjVertex av1211 = new AdjVertex(v11,2);
        AdjVertex av129 = new AdjVertex(v9, 2);
        v12.adjList.add(av1211);
        v12.adjList.add(av129);
        // making hte graph
        ArrayList<Vertex> vertList = new ArrayList<Vertex>();
        vertList.add(v1);
        vertList.add(v2);
        vertList.add(v3);
        vertList.add(v4);
        vertList.add(v5);
        vertList.add(v6);
        vertList.add(v7);
        vertList.add(v8);
        vertList.add(v9);
        vertList.add(v10);
        vertList.add(v11);
        vertList.add(v12);

        Graph g = new Graph(vertList);
        
        /*Vertex vertList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        AdjVertex adjVertList = {{2,2}, {4, 4}, {1,2}, {3,1}, {5,1}, {2,1}, {6,1}
                                , {1,4}, {5,2}, {7,4},{2,1}, {4,2}, {6,Integer.MAX_VALUE}, {8,1}
                                , {3,1}, {5,Integer.MAX_VALUE}, {9,1}, {4,4}, {8,2}, {10,4}
                                , {5,1}, {7,2}, {9,Integer.MAX_VALUE}, {11,2}, {7,4}};

        */
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
        //Graph gameGraph = new Graph(vertList, adjVertList);

        // Call dijkstra() on the new graph, assume zombie is at position v1.
        dijkstra(g, v1);
        
        // Print the path calculated by dijkstra(), assuming zombie is at v1 and player is at v12.
        // print value of player vertex.
        int zombiePos = 1;
        int playerPos = 12;
        System.out.println("Path: ");
        Vertex currVertex = g.vertexList.get(playerPos - 1);
        System.out.println(currVertex.val);
        currVertex = currVertex.path;
        // while the current vertex is not equal to zombie position;
        printPath(currVertex);

    }

    public static void dijkstra(Graph g, Vertex s)
    {

        //int counter = 0;
        //int minDistance = Integer.MAX_VALUE;
        boolean known = true;
        s.path = null;
        ArrayList<Vertex> qAsList = new ArrayList<Vertex>();
        ArrayList<Vertex> finalVertices = new ArrayList<Vertex>(g.vertexList); 
        ArrayList<AdjacentList> listOfAdjacent = setupStuff(g, s); 

        // Set the dist of all vertices to 0 and the path of all vertices to null.
        Vertex s2 = null;
        for (int i = 0; i < finalVertices.size(); ++i)
        {
            if (finalVertices.get(i).val == s.val)
            {
                finalVertices.get(i).dist = 0;
                finalVertices.get(i).path = null;
                s2 = finalVertices.get(i);
            }
            finalVertices.get(i).dist = Integer.MAX_VALUE;
            finalVertices.get(i).path = null;
            finalVertices.get(i).known = false;
        }
        if (s2 != null)
        {
            s2.path = null;
            s2.dist = 0;
        }
        // Create a priority queue of type Vertex
        PriorityQueue<Vertex> q = new PriorityQueue<Vertex>(10, new Comparator<Vertex>() {
            public int compare(Vertex v1, Vertex v2)
            {
                return v1.dist - v2.dist;
            }
        });
        //updates the distance of that vertex

        q = queue(q, known, finalVertices); // Populate the priority queue.
        //q.add(s2);
        while (q.size() > 0)
        {
            Vertex v = q.poll();
            v.known = true;
            // find the AdjacentList
            AdjacentList av = null;
            for (int k = 0; k < listOfAdjacent.size(); ++k)
            {
                if (listOfAdjacent.get(k).s.val == v.val)
                {
                    av = listOfAdjacent.get(k);
                }
            }
            if (av != null)
            {
                for (int j = 0; j < av.lst.size(); ++j) // for each vertex adjacent to v
                {
                    // check if w needs to be updated.
                    Vertex w = av.lst.get(j).v;

                    int cost = av.lst.get(j).weight; // cost of edge from v to w
                    
                    finalVertices = updateDistance(finalVertices, w, v, cost);
                    q = updateQDist(q, finalVertices); // FIXME: this might be causing a problem later
                    if (!w.known && !q.contains(w))
                    {
                        q.add(w);
                    }
                }
            }
            q = updateQDist(q, finalVertices); // update the distances in q.
            //qAsList.add(v); // FIXME: 
            
            
        }
        // update g
        g.vertexList = finalVertices;
        g.adjacencies = listOfAdjacent;
        
    }

    private static ArrayList<Vertex> updateVertices(ArrayList<Vertex> finalVertices, ArrayList<Vertex> qAsList) 
    {
        ArrayList<Vertex> newVertList = new ArrayList<Vertex>(finalVertices); //FIXME: change method so that newVertList starts empty and grows.

        for (int i = 0; i < qAsList.size(); ++i)
        {
            // do something to update the vertices
            Vertex v = qAsList.get(i);
            for (int j = 0; j < finalVertices.size(); ++j)
            {
                // compare
                Vertex w = finalVertices.get(j);
                if (v.val == w.val)
                {
                    // update
                    w = new Vertex(v.val, v.adjList);
                    w.dist = v.dist;
                    w.known = v. known;
                    w.path = v.path;
                    newVertList.add(w);
                }
            }
        }
        return newVertList;
    }

    public static ArrayList<Vertex> updateDistance(ArrayList<Vertex> lst, Vertex v1, Vertex parent, int cost) 
    {
        Vertex v2;
        Vertex parent2 = null;
        for (int i = 0; i < lst.size(); ++i)
        {
            
            if (lst.get(i).val == parent.val)
            {
                parent2 = lst.get(i);
                
            }
        }
        if (parent2 != null)
        {
            for (int j = 0; j < lst.size(); ++j)
            {
                
                if (lst.get(j).val == v1.val)
                {
                    v2 = lst.get(j);
                    if (!(v2.dist == Integer.MAX_VALUE) && parent2.dist + cost < v2.dist)
                    {
                        v2.dist = parent2.dist + cost;
                        v2.path = parent2;
                    }
                }
            }
        }
        return lst;
    }
    public static PriorityQueue<Vertex> queue (PriorityQueue<Vertex> pq, boolean k, ArrayList<Vertex> a)
    {
        for(int i = 0; i < a.size(); i++)// traverse through Graph g to check if current vertex has been visited
        {
            Vertex currentPV = a.get(i);
            

            /* if(currentPV.known)
            {
                continue;
            }*/     
            
            pq.add(currentPV);// adds current vertex to PriorityQueue q
        }

        return pq;// returns PriorityQueue
    }

    public static ArrayList<AdjacentList> setupStuff(Graph g, Vertex source)
    {
        Vertex s = source;
        ArrayList<AdjacentList> a = new ArrayList<AdjacentList>();
        // set up all the vertices 
        s.dist = 0;
        s.path = null;
        for (int i = 0; i < g.vertexList.size(); i++)
        {
            Vertex w = g.vertexList.get(i);
            if (w.val == s.val)
            {
                continue;
            }
            else 
            {
                w.dist = Integer.MAX_VALUE;
                w.path = null;
            }
        }
        // and then update the AdjacentLists
        for (int j = 0; j < g.adjacencies.size(); ++j)
        {
            // get the source vertex
            Vertex v1 = g.adjacencies.get(j).s;
            Vertex v4 = g.vertexList.get(g.find(v1.val));
            AdjacentList adjacent = new AdjacentList(v4);
            // then iterate through each adjacent vertex
            if (g.adjacencies.get(j).lst.size() > 0)
            {
                for (int k = 0; k < g.adjacencies.get(j).lst.size(); ++k)
                {
                    
                    if (g.find(v1.val) >= 0)
                    {
                        AdjVertex av1 = g.adjacencies.get(j).lst.get(k);
                        Vertex v2 = av1.v;
                        if (g.find(v2.val) >= 0)
                        {
                            Vertex v3 = g.vertexList.get(g.find(v2.val)); 
                            AdjVertex av2 = new AdjVertex(v3);
                            av2.weight = av1.weight;
                            adjacent.lst.add(av2);
                        }
                    }
                }
                a.add(adjacent);
                
            }
        }
        return a;
    }
    public static PriorityQueue<Vertex> updateQDist(PriorityQueue<Vertex> q, ArrayList<Vertex> aList)
    {
        // create a new priortiy queue.
        PriorityQueue<Vertex> newQ = new PriorityQueue<Vertex>(10, new Comparator<Vertex>() {
            public int compare(Vertex v1, Vertex v2)
            {
                return v1.dist - v2.dist;
            }
        });
        boolean found = false;
        // for each vertex in q
        while (!q.isEmpty())
        {
            Vertex ogVert = q.poll();
            //Vertex ogVert = q.peek();
            
            // check if Vertex needs to be updated
            for (int i = 0; i < aList.size(); ++i)
            {
                Vertex currentVertex = aList.get(i);
                if (currentVertex.known)
                {
                    continue;
                }
                if (aList.get(i).val == ogVert.val)
                {
                    found = true;
                    if (aList.get(i).known == true)
                    {
                        continue;
                    }
                    if (aList.get(i).dist != ogVert.dist)
                    {
                        // update dist of Vertex and add to newQ
                        newQ.add(aList.get(i));
                    }
                    else
                    {
                        newQ.add(ogVert);
                    }
                }
                
            }
            if (!found)
            {
                newQ.add(ogVert);
            }
        }
        return newQ;
    }
    static void printPath(Vertex v)
    {
        if (v == null)
        {
            return;
        }
        if (v.path != null)
        {
            printPath(v.path);
        }
        System.out.println(v.val);
    }
}

