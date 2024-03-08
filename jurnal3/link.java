import java.util.NoSuchElementException;

public class link<E>{
    private node<E> firstNode;
    private node<E> lastNode;
    private String name;

    public link(){
        this("Linked List");
    }

    public link(String listName){
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(E insertItem){
        node<E> newNode = new node<>(insertItem);

        if(isEmpty()){
            firstNode = lastNode = new node<E>(insertItem);
        }else{
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem){
        node<E> newNode = new node<>(insertItem);

        if(isEmpty()){
            firstNode = lastNode = new node<E>(insertItem);
        }else{
            lastNode.next = newNode;
            lastNode = newNode;

        }
    }

    public E removeFromStart() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = firstNode.data;

        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            node<E> temp = firstNode;

            firstNode = firstNode.next;
            temp.next = null;

        }

        return removedItem;
    }

    public E removeFromBack() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = lastNode.data;

        if(firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
            node<E> current = firstNode;

            while(current.next != lastNode){
                current = current.next;
            }

            lastNode = current;
            current.next = null;
        }

        return removedItem;
    }

    private boolean isEmpty(){
        return firstNode == null;
    }

    public void print(){
        if(isEmpty()){
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: %n", name);
        node<E> current = firstNode;

        while(current != null){
            System.out.printf("%s", current.data);
            current = current.next;
        }

        System.out.println();
    }
}