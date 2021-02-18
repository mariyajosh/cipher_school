class lnode{
    int data;
    lnode next;
    lnode(int x)
    {
        data=x;
    }
}
    class Loop
    {
lnode head;
lnode insert(int x)
{
    lnode n=new lnode(x);
   if(head==null)
   {
       head=n;
   }
   
   else{
       lnode curr=head;
       while(curr.next!=null)
       {
           curr=curr.next;
       }
       curr.next=n;

   }
   return head;
}
boolean loop(lnode head){
    lnode fp=head;lnode sp=head;
    while(fp!=null && fp.next!=null)
    {
        sp=sp.next;
        fp=fp.next.next;
        if(sp==fp)
        {
            return true;
        }
    }
    return false;
}
    }

class loopdetect{
    public static void main(String args[])
    {
        Loop l=new Loop();
l.head=l.insert(10);
l.head=l.insert(20);
l.head=l.insert(30);
System.out.println(l.loop(l.head));


    }
}