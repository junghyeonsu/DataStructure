package Java.LinkedList2;

public class LinkedList<T> {
    /* Node class */
    public class Node<T>{
        private T _element;
        private Node<T> _next;

        public Node(){
            this._element = null;
            this._next = null;
        }

        public Node(T givenElement, Node givenNext) {
            this._element = givenElement;
            this._next = givenNext;
        }

        public T element(){
            return this._element;
        }

        public Node<T> next(){
            return this._next;
        }

        public void setElement(T element){
            this._element = element;
        }

        public void setNext(Node<T> nextNode){
            this._next = nextNode;
        }
    }

    /* 비공개 변수들 */
    private int _size;
    private Node<T> _head;

    /* 비공개 함수 (내가 원하는 위치에 데이터가 존재하는가를 알게하는 함수) */
    private boolean anElementDoesExistAt(int anOrder){
        return ((anOrder >= 0) && (anOrder < this._size));
    }

    public boolean 	isEmpty() {
        if(this._size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* 시스템 메모리가 모자라지 않다고 가정 */
    public boolean	isFull () { return false; }

    public int size () {
        return this._size;
    }

    public boolean	doesContain (T anElement) {
        Node<T> temp = new Node<T>();
        temp = this._head;

        while(temp != null){
            if(temp._element == anElement){
                return true;
            }
            temp = temp._next;
        }
        return false;
    }

    public T elementAt (int anOrder) {
        Node<T> temp = new Node<T>();
        temp = this._head;
        int tempOrder = anOrder;
        while(tempOrder > 0){
            temp = temp._next;
            tempOrder--;
        }
        return temp._element;
    }

    public T firstElement () {return this._head._element;}

    public T lastElement () {
        int tempSize = this._size;
        Node<T> tempNode = new Node<>();
        tempNode = this._head;

        while(tempSize > 0) {
            tempNode = tempNode._next;
            tempSize--;
        }
        return tempNode._element;
    }

    public int orderOf (T anElement) {
        Node<T> tempNode = new Node<T>();
        tempNode = this._head;
        for(int i=0;i<this._size;i++){
            if(tempNode._element == anElement){
                return i;
            }
            tempNode = tempNode._next;
        }
        return -1;
    }

    public boolean addTo (T anElement, int anOrder) {
        if(anOrder < 0 || anOrder > this._size){
            return false;
        } else {
            Node<T> addNode = new Node<>(anElement,null);
            if(anOrder == 0) {
                addNode._next = this._head;
                this._head = addNode;
            }else {
                Node<T> tempNode = this._head;
                for(int i = 1;i < this.size();i++){
                    tempNode = tempNode.next();
                }
                addNode._next = tempNode._next;
                tempNode._next = addNode;
            }
            this._size++;
            return true;
        }
    }

    public boolean 	addToFirst (T anElement) {
        return addTo(anElement,0);
    }

    public boolean	addToLast (T anElement) {
        return addTo(anElement, this._size);
    }

    public boolean	add (T anElement) {
        return addToLast(anElement);
    }

    public T removeFrom (int anOrder) {
        if(isEmpty()){
            return null;
        }else if(anOrder < 0 || anOrder > this._size){
            return null;
        }else {
            Node<T> tempNode = null;
            if(anOrder == 0){
                tempNode = this._head;
                this._head = tempNode._next;
                this._size--;
                return tempNode.element();
            } else {
                Node<T> previousNode = this._head;
                for(int i=1;i<anOrder;i++){
                    previousNode = previousNode.next();
                }
                tempNode = previousNode.next();
                previousNode._next = tempNode._next;
                this._size--;
                return tempNode.element();
            }
        }
    }

    public T removeFirst () {
        return this.removeFrom(0);
    }
    public T removeLast () {
        return this.removeFrom(this._size-1);
    }
    public T removeAny () {
        return this.removeFirst();
    }

    public boolean	remove(T anElement){
        if(isEmpty()){
            return false;
        } else {
            int index = this.orderOf(anElement);
            this.removeFrom(index);
            return true;
        }
    }
//
    public boolean	replaceAt (T anElement, int anOrder) {
        if(isEmpty()){
            return false;
        }else if(anOrder < 0 || anOrder > this._size){
            return false;
        }else{
            this.removeFrom(anOrder);
            this.addTo(anElement,anOrder);
            return true;
        }
    }

    public void	clear () {
        this._head = null;
        this._size = 0;
    }

    public void printNode(){
        Node<T> temp = this._head;
        System.out.print("[");
        for(int i=0;i<this.size();i++){
            if(i == this._size-1){
                System.out.print(temp._element);
                break;
            }
            System.out.print(temp._element + "-");
            temp = temp.next();
        }
        System.out.println("]");
    }
}
