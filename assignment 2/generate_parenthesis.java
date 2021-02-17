import java.util.*;

class generate_parenthesis{
    static List<String> generate(int n)
    {
ArrayList<String> a=new ArrayList<String>();
helper(a,"",0,0,n);
return a;

    }
    static void helper(ArrayList<String> a,String s,int open,int close,int n)
    {
        if(s.length()==n*2)
        {
            a.add(s);
            return;
        }
        if(open<n){
            helper(a,s+"(",open+1,close,n);

        }
        if(close<open)
        {
            helper(a,s+")",open,close+1,n);
            
        }

    }
    public static void main(String args[])
    {
      // Scanner scanner=new Scanner(System.in);
        int n=3;
            System.out.println(generate(n));
    }
}