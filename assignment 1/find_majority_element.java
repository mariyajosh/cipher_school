package eh;

public class find_majority_element {
	static int majority(int a[])
	{
		int MaxOccuringElement=a[0];
		int count=1;
		int majority_index=0;
		for(int i=1;i<a.length;i++)
		{
			if(MaxOccuringElement==a[i]){
				count+=1;
			}
			else{
				count--;
				if(count==0){
					MaxOccuringElement=a[i];
					majority_index=i;
					count++;
				}
				
			}
		}
		int frequency_index=frequency(a,majority_index);
		if(frequency_index==majority_index){
			return a[majority_index];
		}
		else{
			return -1;
		}
		
	}
	static int frequency(int a[],int index)
	{
		int count=0; 
		for(int i=0;i<a.length;i++)
		{
			if(a[index]==a[i])
			{
				count++;
			}
		}
		if(count>a.length/2)
		{
			return index;
		}
		return -1;
	}
public static void main(String ar[])
{
	int a[]={2,2,4,4,1,4,4};
	System.out.println(majority(a));
}
}
