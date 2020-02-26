package Java.List;

public class ArrayList<T> {
    private static final int DEFAULT_CAPACITY = 25;
    private int _capacity;
    private int _size;
    private T[] _elements;

    public void printElements(){
        String str = "[";
        if(isEmpty()){
            System.out.println("비어있습니다.");
            return;
        } else {
            for(int i=0;i<this._size;i++){
                str += this._elements[i]+"-";
            }
        }
        str += "]";
        System.out.println(str);
    }

    private boolean	anElementDoesExistAt ( int aPosition ) { return true; }
    private void makeRoomAt ( int aPosition ) {
        for(int i = this._size; i > aPosition; i--){
            this._elements[i] =  this._elements[i-1];
        }
    }
    private void removeGapAt ( int aPosition ) {
        for(int i = aPosition; i< this._size; i++){
            this._elements[i] = this._elements[i+1];
        }
        this._elements[this._size] = null;
    }

    /* 생성자 */
    public 	ArrayList () {
        this(ArrayList.DEFAULT_CAPACITY);
    }

    /* 매개변수가 있는 생성자 */
    public 	ArrayList (int givenCapacity) {
        this._elements = (T[]) new Object[givenCapacity];
        this._capacity = givenCapacity;
        this._size = 0;
    }

    public boolean 	isEmpty () {
        if(this._size == 0) {
            return true;
        }
        return false;
    }

    public boolean	isFull () {
        if(this._size == this._capacity){
            return true;
        }
        return false;
    }

    public boolean 	size () { return true; }

    public T elementAt (int anOrder) { return null; }

    public T first() {
        if(this.isEmpty()){
            return null;
        }else{
            return this._elements[0];
        }
    }

    public T last () {
        if(this.isEmpty()){
            return null;
        }else {
            return this._elements[this._size-1];
        }
    }

    public boolean	doesContain (T anElement) {
        if(this.isEmpty()){
            return false;
        }else{
            for(int i=0;i<this._size;i++){
                if(this._elements[i] == anElement){
                    return true;
                }
            }
        }
        return false;
    }

    public int		frequencyOf (T anElement) {
        int count = 0;
        if(this.isEmpty()){
            return 0;
        }else{
            for(int i= 0;i<this._size;i++){
                if(this._elements[i] == anElement){
                    count++;
                }
            }
        }
        return count;
    }

    public int	orderOf (T anElement) {
        for(int i = 0; i<this._size;i++){
            if(this._elements[i]== anElement){
                return i;
            }
        }
        return -1;
    }

    public boolean	addTo (T anElement, int anOrder) {
        if(isFull()){
            return false;
        }else{
            if(anOrder >= 0 && anOrder <= this._size) {
                this.makeRoomAt(anOrder);
                this._elements[anOrder] = anElement;
                this._size++;
                return true;
            }
        }
        return false;
    }

    public boolean	addToFirst (T anElement) {
        return this.addTo(anElement,0);
    }

    public boolean	addToLast (T anElement) {
        return this.addTo(anElement, this._size);
    }

    public boolean	add (T anElement) {
        return this.addToLast(anElement);
    }

    public T removeFrom (int anOrder) {
        if (isEmpty())
            return null;
        T temp = this._elements[anOrder];
        this.removeGapAt(anOrder);
        this._size--;
        return temp;
    }

    public T removeFirst () {
        return this.removeFrom(0);
    }

    public T removeLast () {
        return this.removeFrom(this._size);
    }

    public T removeAny () {
        return this.removeLast();
    }

    public boolean remove(T anElement) {
        int orderOfIndex = this.orderOf(anElement);
        if(orderOfIndex < 0){
            return false;
        } else {
            this.removeGapAt(orderOfIndex);
            this._size--;
            return true;
        }
    }

    public boolean replaceAt (T anElement, int anOrder) {
        if(this._elements[anOrder] == null || anOrder < 0){
            return false;
        } else {
            this._elements[anOrder] = anElement;
            return true;
        }
    }
    public void	clear() {
        while(this._size > 0){
            this._elements[this._size] = null;
            this._size--;
        }
    }
}
