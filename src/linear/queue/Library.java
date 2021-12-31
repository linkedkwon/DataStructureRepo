package linear.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Library {

    private Queue<Integer> queue = new LinkedList<>();

    public void queueMethod(){
        queue.isEmpty();
        queue.size();
        /**
         * Defensive Code in queue size overflow
         * add() : throws Exception
         * offer() : return boolean value
         */
        queue.add(1);
        queue.offer(1);
        queue.poll();
        queue.peek();
    }

    public void loop(){
        while(!queue.isEmpty()){
            queue.poll();
        }
    }

}