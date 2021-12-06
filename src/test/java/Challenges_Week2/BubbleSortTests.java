package Challenges_Week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

    BubbleSort sorter = new BubbleSort();
    int[] numbers = {5,7,3,2,1};
    int[] orderedNumbers = {1,2,3,5,7};

    @Test
    public void SorterTest()
    {
        Assertions.assertArrayEquals(orderedNumbers, sorter.Sorter(numbers));
    }

}
