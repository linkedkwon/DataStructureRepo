package linear.queue;

//Circular queue using array
public class Queue {

    private int front;
    private int rear;
    private int[] queue;
    private int size;

    public Queue(int size){
        queue = new int[size];
        this.size = size;
        front = rear = 0;
    }

    public boolean isFull(){
        return front == (rear + 1) % size;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public void enqueue(int e){
        if(isFull())
            return;
        rear = (rear + 1) % size;
        queue[rear] = e;
    }

    public int dequeue(){
        if(isEmpty())
            return -1;
        front = (front + 1) % size;
        return queue[front];
    }

    public int peek(){
        if(isEmpty())
            return -1;
        return queue[(front + 1) % size];
    }

}