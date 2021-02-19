class snode{
    int data;
    snode next;
    snode(int x)
    {
        data=x;
    }
}
class seg{
    snode head;
    snode insert(int x)
{
    snode n=new snode(x);
   if(head==null)
   {
       head=n;
   }
   
   else{
       snode curr=head;
       while(curr.next!=null)
       {
           curr=curr.next;
       }
       curr.next=n;

   }
   return head;
}
snode segregate(snode head)
{
    if(head==null)
    {
        return null;
    }
    snode even_s=null;
    snode even_e=null;
    snode odd_s=null;
    snode odd_e=null;
    snode curr=head;
    while(curr!=null)
    {
        int x=curr.data;
        if(x%2==0)
        {
            if(even_s==null)
            {
                even_s=curr;even_e=even_s;    
            }
            else{
                even_e.next=curr;
                even_e=even_e.next;
                }
        }
        else{
            if(odd_s==null)
            {
                odd_s=curr;
                odd_e=odd_s;
            }
            else{
                odd_e.next=curr;
odd_e=odd_e.next;
            }
        }
        curr=curr.next;
    }
    if(odd_s==null || even_s==null)
    {
        return head;
    }
    else{

    
    even_e.next=odd_s;
    odd_e.next=null;
    }
return even_s;
}
void printLinkedList(snode head)
{
    while(head!=null)
    {
        System.out.print(head.data+" ");
        head=head.next;
    }
  
}

}
public class segregate_even_and_odd {
    public static void main(String a[])
    {
        seg s=new seg();
        s.head=s.insert(1);
        s.head=s.insert(5);
        s.head=s.insert(2);
        s.head=s.insert(3);
        s.head=s.insert(4);
        s.head=s.segregate(s.head);
s.printLinkedList(s.head);

    }
}
