class missing_number
{
    static int find_missing(int a[])
    {
        int x1=a[0];
for(int i=1;i<a.length;i++)
{
    x1=x1^a[i];
}
int x2=1;
for(int i=2;i<=a.length+1;i++)
{
    x2=x2^i;
}
return x1^x2;


    }
    public static void main(String ar[])
    {
        int a[]={1,2,3,4,5,7};
System.out.println(find_missing(a));
    }
}