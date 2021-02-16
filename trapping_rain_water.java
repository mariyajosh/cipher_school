package eh;

public class trapping_rain_water {
	static int trw(int a[])
	{int n=a.length;
		int res=0;
		int lmax[]=new int[a.length];
		int rmax[]=new int[a.length];
		lmax[0]=a[0];
		rmax[n-1]=a[n-1];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(lmax[i-1], a[i]);
		}
		for(int i=n-2;i>0;i--)
		{
			rmax[i]=Math.max(rmax[i+1], a[i]);
		} 
		for(int i=1;i<n;i++)
		{
			res=res+(Math.min(lmax[i], rmax[i])-a[i]);
		}
		return res;
	}
public static void main(String args[])
{
	int a[]={5,4,3,0,6};
	System.out.println(trw(a));
}
}
