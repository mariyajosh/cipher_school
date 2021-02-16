package eh;
import java.util.Arrays;
public class minimum_number_of_platforms {
	static int platform(int a[],int d[])
	{
		Arrays.sort(a);
		Arrays.sort(d);
		int i=1;int j=0;
		int curplatform=1;
		int  minplatform=1;
		while(i<a.length && j<d.length)
		{
			if(a[i]<d[j])
			{
				curplatform+=1;
				i++;
				
			}
			else
			{
				curplatform-=1;
				j++;
			}
			minplatform=Math.max(curplatform, minplatform);
			
				
		}
		return minplatform;
		
	}
	public static void main(String args[])
	
	{
	int a[]={930,945,950,1130,1210};	
	int d[]={1000,1130,1030,1230,1215};
	System.out.println("Minimum number of platforms needed: "+platform(a,d));
	}
}
