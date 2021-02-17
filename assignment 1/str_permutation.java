package eh;


public class str_permutation {
	static void swap(char ch[],int l,int r){
		char t=ch[l];
		ch[l]=ch[r];
		ch[r]=t;
	}
static void permutaions(char ch[],int ci)
{int n=ch.length;
	if(ci==n-1)
	{
		System.out.println(String.valueOf(ch));
	}
	for(int j=ci;j<=n-1;j++)
	{
		swap(ch,ci,j);
		permutaions(ch,ci+1);
		swap(ch,ci,j);
		
		
	}
}
public static void main(String args[])
{
	String s="ABCD";
	permutaions(s.toCharArray(),0);
}
}
