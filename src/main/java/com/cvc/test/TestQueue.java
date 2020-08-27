package com.cvc.test;

//import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.List;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
public class TestQueue {

    public static void main(String[] args) {
        //Creating BlockingQueue of size 10

        ArrayDeque<String> list = new ArrayDeque<String>(3);// ArrayQueue<>(3);
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.peek();
        System.out.println(queue.size());

        queue.poll();
        System.out.println(queue.size());
        System.out.println(queue.offer("eee") );
        System.out.println(queue.offer("rrr") );

//        list.add("1");
//        list.add("2");
//        list.add("3");
//        System.out.println( list.size());
//        System.out.println( list.add("eee") );
//        System.out.println( list.size());

        list.offer("1");
        list.offer("2");
        list.offer("3");
        System.out.println(  list.getLast());

        list.peek();

        System.out.println(  list.poll());

    }
}
