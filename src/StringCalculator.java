import java.util.StringTokenizer;

public class StringCalculator {
    public  int add(String numbers)
    {
        
        if(numbers.equals(""))
        {
            return 0;
        }    
        StringTokenizer st=new StringTokenizer(numbers,",\n");
        int sum=0;
        String tmp="";
        while(st.hasMoreTokens())
        {
            String str=st.nextToken();
            char ch=str.charAt(0);
            if((!Character.isDigit(ch)) && (str.length()==1))
            {
                int num=ch;
                num=num-96;
                sum=sum+num;
            }
            else if(Integer.parseInt(str)<0)
            {
                tmp += str+",";
            }
            else 
            {
                if(!(Integer.parseInt(str)>1000))
                {
                     sum=sum+Integer.parseInt(str);
                } 
            }
        }
        if(tmp.length()>0)
        {
            throw new RuntimeException("Negative not allowed "+tmp);
        }
        return sum;
    }
    
}