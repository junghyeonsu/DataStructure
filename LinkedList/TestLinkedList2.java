package Java.LinkedList2;

public class TestLinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.printNode();
        linkedList.removeFirst();
        linkedList.printNode();
        linkedList.removeLast();
        linkedList.printNode();
        linkedList.remove(3);
        linkedList.printNode();
        linkedList.replaceAt(3,1);
        linkedList.printNode();
        linkedList.replaceAt(1,0);
        linkedList.replaceAt(2,1);
        linkedList.printNode();

        linkedList.clear();
        linkedList.printNode();
    }
}
