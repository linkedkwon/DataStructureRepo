package linear.stack;

//Stack using array(or LinkedList)
public class Stack {

    private int top;
    private int[] stack;

    public Stack(int size){
        top = -1;
        stack = new int[size];
    }

    public void push(int e){
        stack[++top] = e;
    }

    public int pop(){
        return stack[top--];
    }

    public int peek(){
        return stack[top];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

}