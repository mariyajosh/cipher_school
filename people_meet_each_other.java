package eh;

public class people_meet_each_other {
	static boolean each(int x1,int v1,int x2,int v2)
	{
		if(x1>x2 && v1>=v2)
		{
			return false;
		}
		else if(x1<x2 && v1<=v2){
			return false;
		}  
		else{
			if(x1<x2)
			{
				int t=x1;
				x1=x2;
				x2=t;
			}
			while(x1>=x2)
			{
				if(x1==x2)
				{
					return true;
				}
				x1=x1+v1;
				x2=x2+v2;
				
			}
			return false;
		}
	}
public static void main(String a[])
{
	int x1=5;int v1=6;
	
	int x2=6;int v2=7;
	if(each(x1,v1,x2,v2))
	{
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
	}
	
	
	
	
	
	
	
}
}
