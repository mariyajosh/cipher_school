 class binary_search{
static boolean search(int a[],int x)
{
    int beg,mid,end;
    beg=0;
    end=a.length-1;
    mid=(beg+end)/2;
    while(beg<end)
    {
        if(a[mid]==x)
        {
            return true;
        }
        else if(a[mid]>x)
        {
            end=mid-1;
        }
        else{
            beg=mid+1;
        }
    }
    return false;
}
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7};
        int x=2;
System.out.println(search(a,x));
    }
}