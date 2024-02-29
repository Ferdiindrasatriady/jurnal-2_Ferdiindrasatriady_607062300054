import java. util.ArrayList;
import java.util.Collection;

public class gen <E> {

    private final ArrayList <E> list;

    public gen (int capacity){
        int iniCapacity = capacity > 0? capacity :0;
        list = new ArrayList <> (iniCapacity);

        
}
public void addData(E velues){
    list.add(velues);
}
    public void display(){
        for( int i = 0; i <list.size(); i++){
            System.out.printf(list.get(i)+" ");
        }
        System.out.println();
    }
    public void removeData(E entry){
        list.remove(entry);
    }
    public void setData(E object1, E object2 ){
        int index = list.indexOf(object1);
        list.add(index, object2);
    }
}