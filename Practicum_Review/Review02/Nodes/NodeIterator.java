package Practicum_Review.Review02.Nodes;

import java.util.Iterator;

/**
 * Create a new Java class named "NodeUtils" and define a static method named
"length" that declares a parameter for a Node<String> and uses iterationto find and
return the length of the sequence. Define a main method with the appropriate signature
and use it to test your length method. Consider at least three test case: the empty
sequence (null), a sequence with one node, and a sequence with two or more nodes.
 */

public class NodeIterator<E> implements Iterator<E> {
    Node<E> node;

    public NodeIterator(Node<E> node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node!=null;
    }

    @Override
    public E next() {
        E value = node.getValue();
        node = node.getNext();

        return value;
    }



}
