import java.util.HashSet;
import java.util.Set;

class LiL{
    int data;
    LiL next;
    LiL(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class LinkedListIntersection {
    public static int findIntersection(LiL node, LiL node2)
    {
        Set<LiL> set = new HashSet<>();
        while(node!=null)
        {
            if(!set.contains(node))
            {
                set.add(node);
            }
            node = node.next;
        }
        while(node2!=null)
        {
            if(set.contains(node2))
            {
                return node2.data;
            }
            node2=node2.next;
        }
        return -1;
    }
    public static void main(String args[])
    {
        LiL node = new LiL(5);
        node.next = new LiL(6);
        node.next.next = new LiL(1);
        node.next.next.next= new LiL(8);
        node.next.next.next.next = new LiL(4);
        node.next.next.next.next.next= new LiL(5);

        LiL node2 = new LiL(4);
        node2.next = new LiL(1);
        node2.next.next = node.next.next.next;

        System.out.println(findIntersection(node,node2));
    }
}
