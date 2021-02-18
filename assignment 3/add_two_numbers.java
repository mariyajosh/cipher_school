import java.util.LinkedList;

class perform{
LinkedList<Integer> addition(LinkedList<Integer> l1, LinkedList<Integer> l2){
    LinkedList<Integer> l3=new LinkedList<Integer>();

int sum;
int carry=0;

if(l1==null)
{
    return l2;
}
if(l2==null)
{
    return l1;
}
int ls1=l1.size()-1;
int ls2=l2.size()-1;
while(ls1>=0||ls2>=0){
 sum=carry+l1.get(ls1)+l2.get(ls2);
 carry=sum/10;
 sum=sum%10;
 l3.add(sum);
ls1--;
ls2--;
}
return l3;
}

}

class add_two_numbers{
    public static void main(String ar[])
{

        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        LinkedList<Integer> l2=new LinkedList<Integer>();
        l2.add(5);
        l2.add(2);
        l2.add(3);
perform p=new perform();
LinkedList<Integer> j=p.addition(l,l2);
System.out.print("addition is: ");
for(int i=j.size()-1;i>=0;i--)
{
    System.out.print(j.get(i));
}
    }
}