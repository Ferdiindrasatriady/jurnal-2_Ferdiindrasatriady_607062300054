import java.util.*;

public class kiw  <E>{

    private Queue <E> queueList;

// konstruktor
public kiw (){
    queueList = new LinkedList<E>();

}
// menambahkan objek ke queue
public void enqueue (E object){
    queueList.add(object);
}
// menghapus
public E dequeue () throws NoSuchElementException{
    return queueList.remove();

}
// menampilkan seluruh keluaran
public void printQueue(){
    Iterator<E> iterator = queueList.iterator();
    while (iterator.hasNext()) {
        Object value = iterator.next();
        System.out.print(value + " ");
    }
}
}