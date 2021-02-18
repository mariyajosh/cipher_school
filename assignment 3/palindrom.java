
class pnode{
    int data;
    pnode next;
   
    pnode(int x)
    {
     data=x;
        next=null;
    }
}

class pLinkedList{
    pnode head;
    pnode mid;





pnode insert(int x)
{
    pnode n=new pnode(x);
   if(head==null)
   {
       head=n;
   }
   else{
       pnode curr=head;
       while(curr.next!=null)
       {
           curr=curr.next;
       }
       curr.next=n;
   }
   return head;
}





pnode reverse(pnode head)
{
    if(head==null || head.next==null)
    {
        return head;
    }
    
        pnode curr=head;
        pnode prev=null;
        pnode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }


    
    return prev;
}
boolean palin(pnode head){
if(head==null||head.next==null)
{
    return true;
}

pnode fp=head;
pnode sp=head;
pnode mid=null;
while(fp!=null && fp.next!=null){
sp=sp.next;
fp=fp.next.next;
}
if(fp!=null)
{
    mid=sp.next;
}
else{
    mid=sp;
}
pnode dhead=reverse(mid);
while(dhead!=null)
{
    if(head.data!=dhead.data)
    {
        return false;
    }
    head=head.next;
    dhead=dhead.next;

}
return true;
}

}
public class palindrom{

    public static void main(String arg[])
    {
        pLinkedList l=new pLinkedList();
       l.head= l.insert(1);
        l.head=l.insert(2);
        l.head=l.insert(2);
        l.head=l.insert(1);
        l.head=l.insert(0);
      System.out.println(l.palin(l.head));
     
      
    }

}