import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortArrayListTest {

    SortArrayList arraylist = new SortArrayList();
    @Test
    public void sort() throws Exception {

        ArrayList<String> sList = new ArrayList<String>(3);
        sList.add("NN");
        sList.add("CC");
        sList.add("AA");
        System.out.print(sList.toString());
        ArrayList<String> ssList = new ArrayList<String>(3);
        ssList.add("AA");
        ssList.add("CC");
        ssList.add("NN");
        System.out.print(ssList.toString());

        arraylist.sort(sList);
        System.out.print(sList.toString());

        Assert.assertEquals("test equals",ssList.toString(),sList.toString());


    }

}