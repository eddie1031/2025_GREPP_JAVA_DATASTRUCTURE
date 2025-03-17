package io.eddie.stream;

import io.eddie.arrayList.ArrayList;
import io.eddie.arrayList.List;
import io.eddie.queue.Queue;

public class StreamTest {

    public static void main(String[] args) {

        Queue<Integer> Q = new Queue<>();

        Q.add(1);
        Q.add(1);
        Q.add(2);
        Q.add(2);
        Q.add(3);
        Q.add(1);

        List<Integer> list = new ArrayList<>();

        for ( Integer n : list ) {
            list.add(n*2);
        }

        System.out.println(list.size());

        List<Integer> result = list.stream()
                .filter(n -> n == 2)
                .toList();

        System.out.println(result.size());


    }

}
