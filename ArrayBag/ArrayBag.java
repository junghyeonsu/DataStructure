import java.lang.reflect.Array;

public class ArrayBag<E> {
    private E[] bag;
    private int size;
    private int capacity;

    public E[] getBag() {
        return bag;
    }

    public void setBag(E[] bag) {
        this.bag = bag;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @SuppressWarnings("unchecked")
    public ArrayBag(){
        this.bag = (E[])new Object[100];
        this.size = 0;
        this.capacity = 100;
        System.out.println("크기가 100인 객체가 생성되었습니다.");
    }

    @SuppressWarnings("unchecked")
    public ArrayBag(int givenCapacity){
        this.bag = (E[])new Object[givenCapacity];
        this.size = 0;
        this.capacity = givenCapacity;
        System.out.println("크기가 "+givenCapacity+"인 객체가 생성되었습니다.");
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.capacity;
    }

    public boolean doesContain(E element){
        for(int i = 0; i < this.size; i++){
            if(bag[i] == element){
                return true;
            }
        }
        return false;
    }

    public int frequencyOf(E element){
        int frequency = 0;
        for(int i=0;i<this.size;i++){
            if(bag[i] == element) {frequency++;}
        }
        return frequency;
    }

    public E any(){
        if(this.isEmpty()){
            return null;
        }
        return bag[0];
    }
    public boolean add(E element){
        if(this.isFull()){
            return false;
        }else{
            bag[this.size++] = element;
            return true;
        }
    }
    public E removeAny(){
        if(isEmpty()){
            return null;
        }else{
            E temp = bag[this.size];
            bag[this.size--] = null;
            return temp;
        }
    }

    public boolean remove(E element){
        if(this.doesContain(element)){
            for(int i=0;i<this.getSize();i++){
                if(bag[i] == element){
                    bag[i] = null;
                    this.setSize(this.size-1);
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public void clear(){
        for(int i=0;i<this.getSize();i++){
            bag[i] = null;
        }
        this.setSize(0);
    }
}//End of Class "Bag"
