package com.sdl.ListADT.PositionalList;

public class Node <E> implements Position<E>{

    private E element;

    private Node<E> previousNode;

    private Node<E> nextNode;

    public Node(E element, Node<E> previousNode, Node<E> nextNode) {
        this.element = element;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }

    @Override
    public E getElement() throws IllegalStateException {
        if(nextNode == null)
            throw new IllegalArgumentException("Position is no longer valid");
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<E> previousNode) {
        this.previousNode = previousNode;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}
