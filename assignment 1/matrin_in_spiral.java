package eh;


public class matrin_in_spiral {
	static void spiral(int [][]matrix){
		int row_start=0;
		int row_end=matrix.length-1;
		int col_start=0;
		int col_end=matrix[0].length-1;
		while(row_start<=row_end && col_start<=col_end)
		{
			
		
		for(int i=col_start;i<=col_end;i++)
		{
			System.out.print(matrix[row_start][i]+" ");
		}
		row_start++;
		for(int j=row_start;j<=row_end;j++)
		{
			System.out.print(matrix[j][col_end]+" ");
		}
		col_end--;
		if(row_start<row_end){
			for(int j=col_end;j>=col_start;j--)
			{
				System.out.print(matrix[row_end][j]+" ");
			}
			row_end--;
			
		}
	
		if(col_start<col_end){
			for(int j=row_end;j>=row_start;j--)
			{
				System.out.print(matrix[j][col_start]+" ");
			}
			col_start++;
			
		}
		
		}
		
	}
public static void main(String arg[])
{

	
	int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	spiral(matrix);
	
	
}
}
