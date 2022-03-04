package Practicum_Review.Review02.Nodes;

public class Node <E>{
    private E value;
    private Node<E> next;

    public Node(E value){
        this(value, null);
    }
    public Node(E value, Node<E> next){
        this.value = value;
        this.next = next;
    }

    public E getValue(){
        return this.value;
    }
    public void setValue(E value){
        this.value = value;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

    public Node<E> getNext(){
        return this.next;
    }

    @Override
    public String toString(){
        return this.value +" -> "+this.next;
    }

    public static void main(String[] args) {
        // Node<String> nodde = new Node<>("abc");
        // Node<Integer> nodde2 = new Node<>(123);               // error because can only use one type

        // nodde.setNext(nodde2);
    }

}
