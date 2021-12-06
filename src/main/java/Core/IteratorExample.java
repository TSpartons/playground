package Core;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorExample
{

    private List<Integer> myList;// example object

    public IteratorExample(List<Integer> myList){ this.myList = myList;}

    public void addToArrayList(int num)
    {
        for (int number : myList) { myList.add(num);}
    }

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        IteratorExample example = new IteratorExample(list);

    }

}
