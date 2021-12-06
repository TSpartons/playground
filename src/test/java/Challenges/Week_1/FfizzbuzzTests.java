package Challenges.Week_1;

import challenges.week_1.Ffizzbuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class FfizzbuzzTests
{
    Ffizzbuzz fizzbuzz = new Ffizzbuzz();
    String[] sTrueArr = {"FizzBuzz", "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
    String[] sArr = fizzbuzz.FizzBuzz(16);

    @Test
    public void FizzBuzzTest()
    {
        Assertions.assertArrayEquals(sTrueArr, sArr);
    }

}
