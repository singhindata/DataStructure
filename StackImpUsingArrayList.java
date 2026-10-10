import java.util.ArrayList;

public class StackImpUsingArrayList {
    ArrayList<Integer> stack;

    public StackImpUsingArrayList(){
        stack = new ArrayList<>();
    }
    void push(int value){
        stack.add(value);
    }
    int pop(){
        if(isEmpty())
            return -1;
        return stack.remove(stack.size()-1);
    }
    int peek(){
        if (isEmpty()) {
            return  -1;
        }
        return stack.get(stack.size()-1);
    }
    void display(){
        if (isEmpty()) {
            return;
        }
        for(int i = stack.size()-1;i>=0;i--)
            System.out.println(stack.get(i));
    }

    boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackImpUsingArrayList s = new StackImpUsingArrayList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.pop());
        System.out.println(s.peek());

        s.display();
    

    }
}

