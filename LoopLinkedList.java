import java.util.HashMap;
import java.util.HashSet;

class ll{
    int data;
    ll next;
    ll(int data, ll LL)
    {
        this.data =data;
        this.next=LL;
    }
}
public class LoopLinkedList {
    //2 methods, floyd warshall (slow pointer and fast pointer, slow moves one and fast moves 2 and if they both meet then there is a loop;
    // second method is to maintain a map of type node which will check for loop
    public static boolean checkIfLoop(ll LL) //using HashMap
    {
        HashSet<ll> set = new HashSet();
        while(LL!=null)
        {
         if(set.contains(LL))
         {
             return true;
         }
         else
         {
             set.add(LL);
             LL =LL.next;
         }
        }
        return false;
    }
    public static boolean floydLoop(ll LL) //floyd loop method where we check if the fast pointer or the slow pointer matches at last;
    {
        ll fast = LL;
        ll slow =LL;
        while(fast!=null&&fast.next!=null&&slow!=null)
        {
            if(slow==fast)
            {
                return true;
            }
           slow=slow.next;
           fast=fast.next.next;
        }
        return false;
    }
    public static void main(String args[])
    {
        ll LL = new ll(1,new ll (2,new ll (3,new ll (4,new ll(5,null)))));
        ll temp =LL.next.next;
        for(int i=0;i<4;i++)
        {
            LL = LL.next;
        }
        LL.next = temp;
        System.out.println(checkIfLoop(LL));
    }

}
