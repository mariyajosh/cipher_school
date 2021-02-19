import java.util.LinkedList;

public class union_of_two_lists {
    static LinkedList<Integer> intersection(LinkedList<Integer> l1,LinkedList<Integer> l2){
        LinkedList<Integer> l3=new LinkedList<Integer>();
        if(l1.size()==0 && l2.size()==0)
        {
            return null;
        }
        if(l1.size()==0)
        {
            return l2;
        }
        if(l2.size()==0)
        {
            return l1;
        }
        int i=0;
        int j=0;
        while(i<l1.size()& j<l2.size())
        {
            if(l1.get(i)>l2.get(j))
            {
                l3.add(l2.get(j));
                j++;
            }
            else if(l1.get(i)==l2.get(j))
            {
                l3.add(l1.get(i));
                i++;
                j++;
            }
            else if(l1.get(i)<l2.get(j))
            {
                l3.add(l1.get(j));
                i++;
            }
        }
        while(i<l1.size())
        {
            l3.add(l1.get(i));
            i++;
        }
        while(j<l2.size())
        {
            l3.add(l2.get(j));
            j++;
        }
        return l3;
    }
    public static void main(String arg[])
    {
LinkedList<Integer> l1=new LinkedList<Integer>();
LinkedList<Integer> l2=new LinkedList<Integer>();
l1.add(10);
l1.add(20);
l1.add(30);
l1.add(40);
l2.add(5);
l2.add(10);
l2.add(15);
l2.add(20);
System.out.println(intersection(l1,l2));
    }
}
