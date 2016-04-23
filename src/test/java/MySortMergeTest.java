import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2016.
 */
public class MySortMergeTest {



    @Test
    public void testSort() throws Exception {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i =0 ; i<arr1.length; i++) {
            arr1[i]=(int)(50*Math.random());
        }
        arr2=arr1;
        MySortMerge.sort(arr1);
        Arrays.sort(arr2);
        assertTrue(arr1.equals(arr2));


    }

//    public static void main(String[] args) throws Exception {
//        JUnitCore runner = new JUnitCore();
//        Result result = runner.run(MySortMergeTest.class);
//        System.out.println("run tests: " + result.getRunCount());
//        System.out.println("failed tests: " + result.getFailureCount());
//        System.out.println("ignored tests: " + result.getIgnoreCount());
//        System.out.println("success: " + result.wasSuccessful());
//    }
}