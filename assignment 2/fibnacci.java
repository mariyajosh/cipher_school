import java.util.Scanner;

public class fibnacci{
static int fib(int n)
{
if(n==1||n==2)
{
    return 1;
}
else{
return(fib(n-1)+fib(n-2));
}
}
    public  static void main(String ar[]) {

        System.out.println(fib(10));
        
    }
}