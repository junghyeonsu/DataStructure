public class Node<Element> {
    private Element _element;
    private Node _next;

    public Node(){
        this.setElement(null);
        this.setNext(null);
    }

    public Node(Element givenElement,Node<Element> givenNext){
        this.setElement(givenElement);
        this.setNext(givenNext);
    }

    public Element element() {
        return null;
    }

    public Node next() {
        return null;
    }

    public Element getElement() {
        return _element;
    }

    public void setElement(Element anElement){

    }

    public Node getNext() {
        return _next;
    }

    public void setNext(Node aNode){

    }

}