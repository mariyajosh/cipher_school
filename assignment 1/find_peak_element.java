package eh;

public class find_peak_element {
	static void peak(int a[])
	{if(a[0]>a[1] )
	{
		System.out.println(a[0]);
	}
	if(a[a.length-1]>a[a.length-2])
	{
		System.out.println(a[a.length-1]);
	}
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1]&&a[i]>a[i+1]){
				System.out.println(a[i]);
				i=i+2;
			}else
			{
			continue;	
			}
		}
	}
public static void main(String ar[])
{
	int arr[]={1, 3, 20, 4, 1, 0};
			
	peak(arr);
	}
}
//take O(n) time complexity can do more efficiently in O(logn) time using binary search.
