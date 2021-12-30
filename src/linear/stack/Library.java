package linear.stack;

import java.util.Stack;

//Stack using java.util library
public class Library {

    Stack<Integer> stack = new Stack<>();

    public void initStack(){
        stack.size();
        stack.push(1);
        stack.pop();
        stack.peek();
        stack.isEmpty();
    }

    public void loop(){
        while(!stack.isEmpty()){
            stack.pop();
        }
    }

    /**
     * 고려해야 할 변수가 2개 이상인 경우 또는 동일한 변수 값에 가중치가 부여되어야 하는 경우 Pair 생성
     * 정렬이 필요한 경우 Comparable(interface)>CompareTo(또는 Comparator) 오버라이딩
     */
    public class Pair implements Comparable<Pair>{
        private int x;
        private int priority;

        public Pair(int x, int priority){
            this.x = x;
            this.priority = priority;
        }

        @Override
        public int compareTo(Pair o) {
            return this.x == o.x ? this.priority - o.priority : this.x - o.x;
        }
    }

    public void initPairStack(){
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(1, 1));
    }

}