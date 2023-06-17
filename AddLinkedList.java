import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AddLinkedList {
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public void main(String args[])
        {
            ListNode ll1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null)))))));
            ListNode ll2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))));
            ListNode result = returnSum(ll1,ll2);
            while(result!=null)
            {
                System.out.println(result.val);
                result =result.next;
            }
        }
        public ListNode returnSum(ListNode ll1,ListNode ll2)
        {   ListNode ll3 = new ListNode();
            ListNode result = ll3;
            int carry = 0;
            while(ll1!=null || ll2!=null || carry==1)
            {
                if(ll1!=null)
                {
                    ll3.val+=ll1.val;
                    ll1 = ll1.next;
                }
                if(ll2!=null)
                {
                    ll3.val+=ll2.val;
                    ll2 = ll2.next;
                }
                ll3.val+=carry;
                if(ll3.val>=10)
                {
                    carry = 1;
                    ll3.val = ll3.val-10;
                }
                else
                {
                    carry = 0;
                }
                if(ll1!=null || ll2!=null||carry==1) {
                    ll3.next = new ListNode();
                    ll3 = ll3.next;
                }
            }
            return result;
        }

    }

