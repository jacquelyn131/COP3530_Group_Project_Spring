public class AdjacentList {
    public ArrayList<Vertex> lst;

    AdjacentList()
    {
        lst = new ArrayList<Vertex>();
    }

    public int find(int value) // Returns index of Vertex if found, -1 otherwise
    {
        for (int i = 0; i < lst.size(); ++i)
        {
            if (lst.get(i).val == value)
            {
                return i;
            }
        }
        return -1;
    }
}
