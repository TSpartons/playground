package challenges.week_1;

import java.util.HashMap;

public class Ffizzbuzz
{
    ///This function returns a Hashmap for FizzBuzz for integers between given parameters
    public String[] FizzBuzz(int start, int end)
    {
        //Create String Array
        String s[] = new String[end];
        //Fill Hashmap
        for (int i = start; i < end; ++i) {
            if (i % 3 == 0 && i % 5 == 0)
                s[i] = "FizzBuzz";
            else if (i % 3 == 0)
                s[i] = "Fizz";
            else if (i % 5 == 0)
                s[i] = "Buzz";
            else
                s[i] = String.valueOf(i);
        }
        //return hashmap
        return s;
    }

    public String[] FizzBuzz(int range)
    { return FizzBuzz(0,range);}

}
