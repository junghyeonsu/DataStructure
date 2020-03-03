package Java.Stack.Array;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.clear();
        stack.print();
    }
}
