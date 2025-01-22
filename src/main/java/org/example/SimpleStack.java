package org.example;

import java.util.LinkedList;

public class SimpleStack implements Stack {
    private LinkedList<Item> items;

    // Constructeur
    public SimpleStack() {
        this.items = new LinkedList<>();
    }
    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {

        return items.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {

        return items.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item an item of the stack
     */
    @Override
    public void push(Item item) {
        items.addFirst(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return items.getFirst();
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.removeFirst();
    }
}
