        public class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val=val;
        }
        ListNode(int val,ListNode next)
        {
            this.val=val;
            this.next=next;
        }
        ListNode head;
        public void insertBeg(int val)
        {
            ListNode newNode=new ListNode(val);
            newNode.next=head;
            head=newNode;
        }
        public void insertEnd(int val)
        {
            ListNode newnNode=new ListNode(val);
            if(head==null)
            {
                head=newnNode;
                return;
            }
            
            
        }
    }