package com.sdl.ListADT.PositionalList;

public class LinkedPositionalList<E> implements PositionalList<E> {

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public LinkedPositionalList() {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNextNode(trailer);
    }

    private Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
        Node<E> node = (Node<E>) p;
        if (node.getNextNode() == null)
            throw new IllegalArgumentException("p is no longer in the list");
        return node;
    }

    private Position<E> position(Node<E> node) {
        if (node == header || node == trailer)
            return null;
        return node;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Position<E> first() {
        return position(header.getNextNode());
    }

    @Override
    public Position<E> last() {
        return position(trailer.getPreviousNode());
    }

    @Override
    public Position<E> before(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getPreviousNode());
    }

    @Override
    public Position<E> after(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getNextNode());
    }

    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
        Node<E> newest = new Node<>(e, pred, succ);
        pred.setNextNode(newest);
        succ.setPreviousNode(newest);
        size++;
        return position(newest);
    }

    @Override
    public Position<E> addFirst(E e) {
        return addBetween(e, header, header.getNextNode());
    }

    @Override
    public Position<E> addLast(E e) {
        return addBetween(e, trailer.getPreviousNode(), trailer);
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node.getPreviousNode(), node);
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node, node.getNextNode());
    }

    @Override
    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E answer = p.getElement();
        node.setElement(e);
        return answer;
    }

    @Override
    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        Node<E> predecessor = node.getPreviousNode();
        Node<E> successor = node.getNextNode();
        predecessor.setNextNode(successor);
        successor.setPreviousNode(predecessor);
        size--;
        E answer = node.getElement();
        node.setElement(null);
        node.setPreviousNode(null);
        node.setNextNode(null);
        return answer;
    }
}
