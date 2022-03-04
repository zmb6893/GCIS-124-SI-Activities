package Practicum_Review.Review02.Nodes;
/**
 * Create a new Java class named "NodeUtils" and define a static method named
"length" that declares a parameter for a Node<String> and uses iteration to find and
return the length of the sequence

Define a main method with the appropriate signature
and use it to test your length method. Consider at least three test case: the empty
sequence (null), a sequence with one node, and a sequence with two or more nodes.
 */
public class NodeUtils<E> {

    public NodeUtils(){

    }

    public static int length(Node<String> node){
        int count = 1;
        boolean hasNext = true;
        while(hasNext){
            
            if (node.getNext() != null){
                node = node.getNext();
                count++;
            } else {
                hasNext = false;
                break;
            }
            //System.out.println(node.getValue());
        }

        return count;
    }

    public static void main(String[] args) {
        Node<String> node = new Node<String>("0");
        Node<String> node1 = new Node<String>("1");
        Node<String> node2 = new Node<String>("2");
        Node<String> node3 = new Node<String>("3");

        //and a sequence with two or more nodes.
        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println(length(node)); 
    }

}
