/**
 * Created with IntelliJ IDEA.
 * User: WANG
 * Date: 3/9/14
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class fizzbuzz {
   public static void play(int n)
   {
       for (int i=1;i<=n;i++)
       {
             String  cur;
           if ((i%3==0)&&(i%5==0))
               cur = "Fizz Buzz";
           else if (i%3==0)
                  cur = "Fizz";
           else if (i%5==0)
               cur = "Buzz";
           else
               cur = Integer.toString(i);
           System.out.print(cur+",");

       }
   }
    public static void main(String[] args)
    {
        play(100);
    }
}
