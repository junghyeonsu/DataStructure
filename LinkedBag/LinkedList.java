public class LinkedList<Element> {
    /* 지역 변수들 */
    private Node head;
    private Node tail;
    private int size = 0;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /* 이 클래스는 LinkedList에서만 쓰기위해서 private로 하는거임 */
    private class Node {
        private Object data; //데이터 값
        private Node next; // 다음 노드를 가르키는 필드,변수

        public Node(Object input){
            this.data = input;
            this.next = null;
        }

        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input){
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }

    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node node(int index){
        Node x = head;
        for(int i = 0; i<index; i++)
            x = x.next;
        return x;
    }

    public void printNode(){
        if(head == null){
            System.out.println("[]");
        }
        Node x = head;
        String str = "[";
        while(x.next != null){
            str += x.data + "-";
            x = x.next;
        }
        str += x.data;
        System.out.println(str+"]");
    }

    /*
    k = 넣고자하는 위치의 인덱스
    input = 넣고자하는 값
    */
    public void add(int k,Object input){
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);

            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }

    public Object removeFirst(){
        Node temp = head;

        if(temp == null){
            System.out.println("비어있다.");
            return null;
        } else {
            head = temp.next;
            Object tempdata = temp.data;
            temp = null;
            size--;
            return tempdata;
        }
    }

    public Object remove(int k){
        if(k==0){
            return removeFirst();
        } else {
            Node temp = node(k-1);
            Node delete = node(k);
            temp.next = delete.next;
            Object deleteData = delete.data;
            if(delete.next == null){
                tail = temp;
            }
            delete = null;
            size--;
            return deleteData;
        }
    }
}