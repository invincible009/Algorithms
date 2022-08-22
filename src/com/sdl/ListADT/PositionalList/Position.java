package com.sdl.ListADT.PositionalList;

public interface Position<E> {
    /**
    To use a positional list which is like the combo between a stack and a queue
    we would have to define our own positional list
     */

    E getElement() throws IllegalStateException;
}
