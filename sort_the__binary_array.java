package eh;

public class sort_the__binary_array {
	
	static void binarysort(int a[])
	{
		int z=0;
		int o=a.length-1;
		while(z<o)
		{
			if(a[z]==0)
			{
				
				z++;
				
			}
			else if(a[z]==1)
			{
				int t=a[z];
				a[z]=a[o];
				a[o]=t;
				o--;
			}
		}
	}
public static void main(String ar[])
{
	int a[]={0,1,0,0,0,1,1,0,0,1};
	binarysort(a);
	for(int x:a)
	{
		System.out.print(x+" ");
	}
}
}
//tc =O(N);