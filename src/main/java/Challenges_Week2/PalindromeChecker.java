package Challenges_Week2;


public class PalindromeChecker {

    public Boolean CheckPalindrome(String palindrome)
    {
        //goes up
        int count = 0;
            //goes down
        for(int i = palindrome.length() - 1; i > 0; --i)
        {
            //compares
            if(palindrome.charAt(count) != palindrome.charAt(i))
            {
                System.out.println(palindrome + " is NOT a palindrome");
                return false;
            }
            ++count;

        }

        System.out.println(palindrome + " is a palindrome");
        return true;
    }

}
