
import java.util.Scanner;
import java.util.Stack;

public class Practice {
 public void arrow (int n)
 {
     Scanner s=new Scanner(System.in);
     Stack<Integer> res=new Stack<>();
     int x;
     for(int i=0;i<n;i++)
     {
         x=s.nextInt();
         if(!res.isEmpty() && res.peek()>0 && x<0){
//             Collision Possible
             boolean flag=false;
             while (!res.isEmpty() && res.peek() > 0 && x < 0)
             {
                 if(Math.abs(x) == Math.abs(res.peek()))
                 {
                     res.pop();
                     flag=false;
                     break;
                 }
                 else if(Math.abs(x)>Math.abs(res.peek()))
                 {
                     res.pop();
                   flag=true;
                 }
                 else if(Math.abs(x)<Math.abs(res.peek()))
                 {
                     flag=false;
                     break;
                 }
             }
             if(flag)
             {
                 res.push(x);
             }
         }
         else{
             res.push(x);
         }
     }
     Stack<Integer> stack=new Stack<>();
     while(!res.isEmpty())
     {
         stack.push((res.peek()));
         res.pop();
     }
     while(!stack.isEmpty())
     {
         System.out.print(stack.peek() +" ");
         stack.pop();
     }
 }
}
