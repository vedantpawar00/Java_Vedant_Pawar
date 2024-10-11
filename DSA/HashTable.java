import java.util.List;
import java.util.ArrayList;

class Node
{
    int key, value;

    Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}

class Hash
{
    private int size;
    private List<List<Node>> table;

    Hash(int size)
    {
        this.size = size;
        this.table = new ArrayList<>(size);
        for(int i=0; i<size; i++)
        {
            table.add(new ArrayList<>());
        }
    }

    public int hashFunction(int key)
    {
        System.out.println("index for key: " + key + "=> " + key%size);
        return key % size;
    }

    public void insert(int key, int value)
    {
        int index = hashFunction(key);
        List<Node> list = table.get(index);
        // list.add(new Node(key, value));
        Node n = new Node(key, value);
        list.add(n);
    }

    public int search(int key)
    {
        int index = hashFunction(key);
        List<Node> list = table.get(index);
        for (Node node : list) 
        {
            if(node.key == key)
            {
                return node.value;
            }
        }
        return -1;
    }

}


public class HashTable 
{
    public static void main(String[] args) 
    {
        int tableSize = 5;
        Hash ht = new Hash(tableSize);

        ht.insert(2, 300);
        ht.insert(3, 500);
        ht.insert(4, 700);

        ht.search(5);

        if(ht.search(2) != -1)
        {
            System.out.println("Key is found");
        }
        else
        {
            System.out.println("not found");
        }

    }    
}
