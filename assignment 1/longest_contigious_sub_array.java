package eh;

public class longest_contigious_sub_array {
	static int maximum_sum(int a[])
	{
		int current_sum=a[0];
		int previous_max=a[0];
		for(int i=1;i<a.length;i++)
		{
			current_sum=Math.max(a[i], current_sum+a[i]);
			previous_max=Math.max(current_sum, previous_max);
		}
		return previous_max;
	}
public static void main(String ar[])
{
	int a[]={4,-5,6,-2,-7,-8,9,10,-2};
	System.out.println(maximum_sum(a));
}
}
