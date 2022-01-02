package linear.deq;

import java.util.Deque;
import java.util.LinkedList;

public class Library {

    private Deque<Integer> deq = new LinkedList<>();

    public void deqMethod(){
        deq.addFirst(1);
        deq.addLast(1);
        deq.pollFirst();
        deq.pollLast();
        deq.size();
        deq.peekFirst();
        deq.peekLast();
        deq.isEmpty();
        //defensive code : offer 큐와 동일
        deq.offerFirst(1);
        deq.offerLast(1);
    }

    public void loop(){
        while(!deq.isEmpty()){
            deq.pollFirst();
            deq.pollLast();
        }
    }
}