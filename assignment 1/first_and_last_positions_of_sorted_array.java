package eh;

public class first_and_last_positions_of_sorted_array {
	static int firstelement(int a[],int beg,int end,int x)
	{
		int res=-1;
		while(beg<=end)
		{
			
		
		int mid=(beg+end)/2;
		 if(a[mid]==x){
			res=mid;
			end=mid-1;
		 }
		 else if(a[mid]>x)
		 {
			 end=mid-1;
		 }
		 else if(a[mid]<x)
		 {
			 beg=mid+1;
		 }
		 
		}
		return res;
		
	}
	static int lastelement(int a[],int beg,int end,int x)
	{
		int res=-1;
		while(beg<=end)
		{
			
		
		int mid=(beg+end)/2;
		 if(a[mid]==x){
			res=mid;
			beg=mid+1;
		 }
		 else if(a[mid]>x)
		 {
			 end=mid-1;
		 }
		 else if(a[mid]<x)
		 {
			 beg=mid+1;
		 }
		 
		}
		return res;
		
	}
public static void main(String ar[])
{
	int a[]={1,2,4,7,8,8,8,9};
	int x=9;
	int beg=0;
	int end=a.length-1;
	System.out.println(firstelement(a,beg, end,x));
	System.out.println(lastelement(a,beg,end,x));
}
}
//tc O(logn)
