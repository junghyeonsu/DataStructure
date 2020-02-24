public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(2);
        numbers.addFirst(3);
        numbers.addFirst(5);
        numbers.addLast(8);
        numbers.printNode();
        numbers.add(4,3);
        numbers.printNode();
        numbers.removeFirst();
        numbers.printNode();
        numbers.remove(2);
        numbers.printNode();
        numbers.remove(2);
        numbers.printNode();
    }
}
