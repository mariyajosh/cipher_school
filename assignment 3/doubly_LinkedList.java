class dnode{
    int data;
    
    dnode next;
    dnode prev;
   
    dnode(int x)
    {
     data=x;
        next=null;
        prev=null;
    }
}
class dLinkedList{
    dnode head;
dnode insert(int x)
{
    dnode n=new dnode(x);
   if(head==null)
   {
       head=n;

   }
   
   else{
       dnode curr=head;
       while(curr.next!=null)
       {
           curr=curr.next;
       }
       curr.next=n;
       curr.next.prev=curr;
      
   }
   return head;
}
dnode reverse(dnode head){
    if(head==null||head.next==null)
    {
        return head;
    }
   else{
       dnode prev=null;
      dnode curr=head;
      
       while(curr!=null)
       {
          prev=curr.prev;
          curr.prev=curr.next;
          curr.next=prev;
          curr=curr.prev;;


       }
       return prev.prev;
   }
}
void printLinkedList(dnode head)
{
    while(head!=null)
    {
        System.out.println(head.data+" ");
        head=head.next;
    }
    
    
}



}
class doubly_linkedlist
{
    public static void main(String arg[])
    {
        dLinkedList l=new dLinkedList();
       l.head= l.insert(1);
        l.head=l.insert(2);
        l.head=l.insert(3);
      l.printLinkedList(l.head);
      System.out.println("********************");
      l.head=l.reverse(l.head);
      l.printLinkedList(l.head);
    }

}