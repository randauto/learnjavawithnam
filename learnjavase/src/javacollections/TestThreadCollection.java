package javacollections;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by TuanLQ on 6/17/17.
 */
public class TestThreadCollection {
    public static void main(String[] args) {

    }

    public void testVector() {
        long startTime = System.currentTimeMillis();

        Vector<Integer> vector = new Vector<>();

        for (int i = 0; i < 10_000_000; i++) {
            vector.addElement(i);
        }

        long endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        System.out.println("Vector execute in : " + totalTime + " ms");

    }

    public void testArrayList() {
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
        }


        long endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        System.out.println("ArrayList execute in : " + totalTime + " ms");
    }
}
