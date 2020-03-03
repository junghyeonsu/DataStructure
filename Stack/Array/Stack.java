package Java.Stack.Array;

public class Stack<Element> {
    private static final int DEFAULT_CAPACITY = 50;
    private int _capacity;
    private int _top;
    private Element[] _elements;

    public int get_capacity() {
        return _capacity;
    }

    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }

    public int get_top() {
        return _top;
    }

    public void set_top(int _top) {
        this._top = _top;
    }

    public Stack(){
        this._elements = (Element[]) new Object[Stack.DEFAULT_CAPACITY];
        this._capacity= Stack.DEFAULT_CAPACITY;
        this._top = -1;
    }

    public Stack(int givenStackSize){
        this._elements = (Element[]) new Object[givenStackSize];
        this._capacity = givenStackSize;
        this._top = -1;
    }

    public boolean isEmpty(){
        return (this._top < 0);
    }

    public boolean isFull(){
        return ((this._top + 1) == this._capacity);
    }

    public int size(){
        return (this._top + 1);
    }

    public boolean push(Element anElement){
        if(this.isFull()){
            return false;
        } else {
            this._top++;
            this._elements[this._top] = anElement;
            return true;
        }
    }

    public Element pop(){
        if(this.isEmpty()){
            return null;
        } else {
            Element temp = this._elements[this._top];
            this._elements[this._top] = null;
            this._top--;
            return temp;
        }
    }

    public Element peek(){
        if(isEmpty()){
            return null;
        } else {
            return this._elements[this._top];
        }
    }

    public void clear(){
        while(this._top >= 0){
            this._elements[this._top] = null;
            this._top--;
        }
    }

    public void print(){
        int tempCount = this._top;
        while(tempCount >= 0){
            System.out.println("|     "+this._elements[tempCount]+"     |");
            tempCount--;
        }
        System.out.println(" 바닥바닥바닥");
    }
}
