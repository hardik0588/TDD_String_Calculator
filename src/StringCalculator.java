import java.util.StringTokenizer;

public class StringCalculator {
    public  int add(String numbers)
    {
        if(numbers.equals(""))
        {
            return 0;
        }
        StringTokenizer st=new StringTokenizer(numbers,",");
        if(st.countTokens()==1)
        {
            return Integer.parseInt(numbers);
        }
        else if(st.countTokens()==2)
        {
            int sum=0;
            while(st.hasMoreTokens())
            {
                sum =sum +Integer.parseInt(st.nextToken());
            }
            return sum;
         }
        return -1;
    }  
}