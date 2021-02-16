package eh;
public class sorted_rotated_array {
static int pivot(int a[],int l,int h)
{
	if(l>h){
		return -1;
	}
	if(l==h)
	{
		return l;
	}
	int mid=(l+h)/2;
	if(mid<h && a[mid]>a[mid+1])
	{
		return mid;
	}
	if(mid>l && a[mid]<a[mid-1])
	{
		return (mid-1);
	}
	if(a[l]>=a[mid])
	{
		return pivot(a,l,mid-1);
	}
	else{
		return pivot(a,mid+1,h);
	}
}
static int pivotbinarysearch(int arr[],int l,int h,int key)
{
	int p=pivot(arr,l,h);
	if(p==-1){
		return bs(arr,l,h,key);
	}
	if(arr[p]==key){
		return p;
	}
	 if (arr[0] <= key) 
         return bs(arr, 0, p - 1, key); 
     return bs(arr, p + 1, h - 1, key);  
	
}
static int bs(int arr[], int low, int high, int key) 
{ 
    if (high < low) 
        return -1; 

    
    int mid = (low + high) / 2; 
    if (key == arr[mid]) 
        return mid; 
    if (key > arr[mid]) 
        return bs(arr, (mid + 1), high, key); 
    return bs(arr, low, (mid - 1), key); 
}
public static void main(String a[])
{
	int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 }; 
    int n = arr1.length; 
    int key = 8; 
    System.out.println("Index of the element is : "
                       + pivotbinarysearch(arr1, 0,n, key));
}

}
