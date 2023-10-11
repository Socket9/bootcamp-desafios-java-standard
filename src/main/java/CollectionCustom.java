import java.util.Iterator;

public class CollectionCustom<T>{
    private T[] arr;

    public CollectionCustom(){
        this.arr = (T[]) new Object[0];
    }

    public int size(){
        return arr.length;
    }

    public void add(T obj){
        T[] arrAux = (T[]) new Object[size() + 1];
        System.arraycopy(arr, 0, arrAux, 0, size());
        arrAux[arrAux.length - 1] = obj;
        arr =  arrAux;
    }
    public void addFirst(T obj){
        T[] arrAux = (T[]) new Object[size() + 1];
        System.arraycopy(arr, 0, arrAux, 1, size());
        arrAux[0] = obj;
        this.arr = arrAux;
    }

    public void addLast(T obj){
        add(obj);
    }

    public T remove(T obj){
        T[] arrAux = (T[]) new Object[size() - 1];
        int indice = 0;
        T objAux = null;
        for (int i = 0; i < size(); i++) {
            if(arr[i] != obj){
                arrAux[indice] = arr[i];
                indice++;
            } else {
                objAux = obj;
            }
        }
        arr = arrAux;
        return objAux;
    }

    public void removeAll(){
        T[] arrAux = (T[]) new Object[0];
        arr = arrAux;
    }

    public boolean isEmpty(){
        return size() == 0 ? true : false;
    }

    public void listCollection(){
        for (T el : arr) {
            System.out.println(el);
        }
    }
}
