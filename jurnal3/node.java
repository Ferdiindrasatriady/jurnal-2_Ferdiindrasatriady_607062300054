public class node<E>{
    E data;
    node<E> next;

    public node (E object){
        data = object;
        this.next = null;
    }

    public E getData(){
        return data;
    }
}