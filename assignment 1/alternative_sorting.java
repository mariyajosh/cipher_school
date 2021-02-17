package eh;

import java.util.Arrays;

public class alternative_sorting {
	static void a_sort(int a[])
	{
		int beg=0;
		int end=a.length-1;
		while(beg<end)
		{
			System.out.print(a[end]+" ");
			System.out.print(a[beg]+" ");
			end--;
			beg++;
		}
	}
public static void main(String ar[])
{
	int a[]={1,4,5,7,84,1,5};
	Arrays.sort(a);
	a_sort(a);
}
}
//naive=O(n*n) nested iteration 
//efficient and tc of this algo O(nlogn);first sort and use two pointers  and print.
