package linear.deq;

public class Dequeue {

    private Element front;
    private Element rear;

    public Dequeue(){
        front = rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void addFirst(int e){
        Element node = new Element(e);
        if(isEmpty()){
            front = node;
            rear = node;
            node.leftE = node.rightE = null;
        }
        else{
            node.rightE = front;
            node.leftE = null;
            front.leftE = node;
            front = node;
        }
    }

    public int pollFirst(){
        if(isEmpty()) {
            return -1;
        }
        else{
            int data = front.data;
            if(front.rightE == null){
                front = null;
                rear = null;
            }
            else{
                front = front.rightE;
                front.leftE = null;
            }
            return data;
        }
    }

    public void addLast(int data){
        Element node = new Element(data);
        if(isEmpty()){
            front = node;
            rear = node;
            node.rightE = node.leftE = null;
        }
        else{
            node.leftE = rear;
            node.rightE = null;
            rear.rightE = node;
            rear = node;
        }
    }

    public int pollLast(){
        if(isEmpty()){
            return -1;
        }
        else {
            int data = rear.data;
            if(rear.leftE == null){
                front = rear = null;
            }
            else{
                rear = rear.leftE;
                rear.rightE = null;
            }
            return 1;
        }
    }

    public int peekFirst(){
        return isEmpty() ? -1 : rear.data;
    }

    public int peekLast(){
        return isEmpty() ? -1 : front.data;
    }

}

class Element{

    public int data;
    public Element leftE;
    public Element rightE;

    public Element(){
        leftE = rightE = null;
    }

    public Element(int data){
        this.data = data;
        leftE = rightE = null;
    }
}
