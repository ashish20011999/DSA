import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class NNodeFromStart
{
    public static void main(String args[])
    {
        ListNode node = new ListNode(1,null);
//        new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5,null)))));
//        ListNode head = removeNthFromStart(node,4);
        ListNode head = removeNthFromEnd(node,1);
        while(head!=null)
        {
            System.out.println(head.val);
            head =head.next;
        }
    }
    public static ListNode removeNthFromStart(ListNode head, int n) {
        int count = 1;
        ListNode temp = null;
        ListNode headtemp =head;
        while(count!=n)
        {
            temp=head;
            head = head.next;
            count++;
        }
        temp.next = head.next;
        head.next = null;
        return headtemp;
    }

        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode p1 = head;
            ListNode p2 = head;
            while(n>0)
            {
                p2 = p2.next;
                n--;
            }
            while(p2.next!=null)
            {
                p1 = p1.next;
                p2 = p2.next;
            }
            p1.next = p1.next.next;
            return head;
        }
}
