package Java.Stack.Linked;

        public class TestStack2 {
            public static void main(String[] args) {
                Stack2<String> stack = new Stack2<String>();

                stack.push("ㅎㅇ");
                stack.push("나는");
                stack.push("현수야");
                stack.print();

                System.out.println(stack.elementAt(3));

                stack.pop();
                stack.print();
                stack.pop();
                stack.print();

                System.out.println(stack.peek());
    }
}
