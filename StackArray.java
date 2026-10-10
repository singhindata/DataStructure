public class StackArray {
    int stack[];
    int top;
    int capacity;

    public StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;

    }

    boolean isFull() {
        return top == capacity - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int value) {
        if (isFull())
            return;
        top++;
        stack[top] = value;
    }

    int pop() {
        if (isEmpty())
            return -1;
        return stack[top--];
    }

    int peek() {
        if (isEmpty())
            return -1;
        return stack[top];
    }

    void display() {
        if (isEmpty())
            return;
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

    }
}