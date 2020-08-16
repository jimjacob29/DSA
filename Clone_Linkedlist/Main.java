package Clone_Linkedlist;

public class Main
{
   public static class Node
    {
        Node next;
        Node random;
        int val;

        Node(int val)
        {
            this.val = val;
            next = null;
            random = null;
        }
    }
    public static void main(String[] args)
    {
        Node A = new Node(1);
        Node head = A;
        Node B = new Node(2);
        A.next = B;
        Node C = new Node(3);
        B.next = C;
        Node D = new Node (4);
        C.next = D;
        A.random = A;
        B.random =D;
        C.random = A;
        D.random = A;
        Node newHead = CloneList(head);
        Node temp = newHead;
        while(temp!=null)
        {
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
        temp = newHead;
        while(temp!=null)
        {
            System.out.print(temp.random.val +" ");
            temp=temp.next;
        }
    }
    public static Node CloneList(Node head)
    {
        Node temp=null,newHead=null;
        Node temp1=head;
        int count=0;
        while(temp1!=null)
        {
            count++;
            Node A = new Node(temp1.val);
            if(count==1)
            {
                newHead = A;
                temp = A;
                temp1=temp1.next;
            }
            else
            {
                temp.next = A;
                temp = A;
                temp1=temp1.next;
            }
        }
        temp1 = head;
        Node temp4 = newHead;
        while(temp1!=null)
        {
            Node ran = temp1.random;
            Node temp2 = head;
            Node temp3 = newHead;
            while(temp2!=null)
            {
                if(temp2==ran)
                {
                    temp4.random = temp3;
                    break;
                }
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
            temp1 = temp1.next;
            temp4 = temp4.next;

        }

        return newHead ;
    }
}
