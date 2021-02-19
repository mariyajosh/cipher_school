class node{
    int data;
    node next;

node(int x)
{
    data=x;
}
}
class duplicate{
    node head;
    node insert(int x)
{
    node n=new node(x);
   if(head==null)
   {
       head=n;
   }
   
   else{
       node curr=head;
       while(curr.next!=null)
       {
           curr=curr.next;
       }
       curr.next=n;

   }
   return head;
}
void removeduplicates(node head){
    if(head==null)
    {
        return;
    }
    node curr=head;
    while(curr!=null && curr.next!=null)
    {
        if(curr.data==curr.next.data)
        {
            curr.next=curr.next.next;
        }
        else{
            curr=curr.next;
        }
    }
}
void printLinkedList(node head)
{
    while(head!=null)
    {
        System.out.print(head.data+" ");
        head=head.next;
    }
}
}
public class delete_duplicates_from_list {
    public static void main(String a[])
    {
        duplicate d=new duplicate();
        d.head=d.insert(20);
        d.head=d.insert(30);
        d.head=d.insert(30);
        d.head=d.insert(31);
        d.head=d.insert(31);
        d.removeduplicates(d.head);
d.removeduplicates(d.head);
d.printLinkedList(d.head);
    }
}
