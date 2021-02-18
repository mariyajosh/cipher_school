class node{
    int data;
    node next;
   
    node(int x)
    {
     data=x;
        next=null;
    }
}
class LinkedList{
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
void printLinkedList(node head)
{
    while(head!=null)
    {
        System.out.println(head.data+" ");
        head=head.next;
    }
}
node reverse(node head)
{
    if(head==null || head.next==null)
    {
        return head;
    }
    
        node curr=head;
        node prev=null;
        node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }


    
    return prev;
}


}
class s_linkedlist
{
    public static void main(String arg[])
    {
        LinkedList l=new LinkedList();
       l.head= l.insert(1);
        l.head=l.insert(2);
        l.head=l.insert(3);
       l.printLinkedList(l.head);
       System.out.println("******************");
       l.head=l.reverse(l.head);
       l.printLinkedList(l.head);
    }

}