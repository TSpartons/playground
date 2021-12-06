package Challenges_Week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTests {

    PalindromeChecker checker = new PalindromeChecker();
    String racecar = "RACECAR";
    String palindrome = "PALINDROME";

    @Test
    public void CheckPalindromeTest()
    {
        Assertions.assertSame(true, checker.CheckPalindrome(racecar));
    }

}
