package Java.Stack.Linked;

public class Stack2<Element> {
    private Node _top ;
    private int _size;

    private class Node {
        private Element data; //데이터 값
        private Node next; // 다음 노드를 가르키는 필드,변수

        public Node(Element input){
            this.data = input;
            this.next = null;
        }
    }

    public boolean isEmpty () {
        if(this._size == 0){
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull () {
        return true;
    }

    public int size () {
        return this._size;
    }

    /* 0 부터 시작 */
    public Element elementAt (int anOrder) {
        if(isEmpty() || anOrder >= this._size){
            return null;
        } else {
            Node temp = this._top;
            while(anOrder > 0) {
                temp = temp.next;
                anOrder--;
            }
            return temp.data;
        }
    }

    public Element last () {
       return this.elementAt(this._size-1);
    }

    public void clear() {
        Node temp = this._top;
        while(this._size > 0){
            temp.data = null;
            temp = temp.next;
            this._size--;
        }
    }

     public boolean push (Element anElement) {
        Node data = new Node(anElement);
        Node temp = this._top;
        data.next = temp;
        this._top = data;
        this._size++;
        return true;
     }

     public Element pop () {
        Node temp = this._top;
        this._top = temp.next;
        this._size--;
        return temp.data;
     }

     public Element peek () {
        return this._top.data;
     }

    public void print() {
        Node temp = this._top;
        int tempSize = this._size;
        System.out.print("[ ");
        while(tempSize > 0){
            System.out.print(temp.data);
            temp = temp.next;
            if(tempSize - 1 != 0){
                System.out.print(" - ");
            }
            tempSize--;
        }
        System.out.println(" ]");
    }
}
