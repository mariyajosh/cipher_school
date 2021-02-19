import java.util.LinkedList;
import java.util.ListIterator;
public class intersection_point {
        static boolean point(LinkedList<Integer> l1,LinkedList<Integer> l2)
        {
            int len1=l1.size();
            int len2=l2.size();
            int d=Math.abs(len1-len2);
            ListIterator<Integer> i1=l1.listIterator(d);
            ListIterator<Integer> i2=l2.listIterator();
            while(i1.hasNext() && i2.hasNext())
            {
                if((int)i1.next()==(int)i2.next())
                {
                    System.out.println(i1.previous());
                return true;
                }
                
            }
            return false;
        }
    public static void main(String args[])
    {
        LinkedList<Integer> p=new LinkedList<Integer>();
        LinkedList<Integer> p1=new LinkedList<Integer>();
        p.add(1);
        p.add(2);
        p.add(5);
        p.add(10);

        
        p1.add(7);
        p1.add(10);
        System.out.println(point(p,p1));
    }
}
