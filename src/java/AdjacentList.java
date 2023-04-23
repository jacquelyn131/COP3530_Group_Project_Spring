import java.util.*;
public class AdjacentList {
    public ArrayList<AdjVertex> lst;
    public Vertex s;

    AdjacentList()
    {
        lst = new ArrayList<AdjVertex>();
    }
    AdjacentList(Vertex source)
    {
        this.s = source;
        lst = new ArrayList<AdjVertex>();
    }

    public int find(int value) // Returns index of Vertex if found, -1 otherwise
    {
        for (int i = 0; i < lst.size(); ++i)
        {
            if (lst.get(i).v.val == value)
            {
                return i;
            }
        }
        return -1;
    }
}
