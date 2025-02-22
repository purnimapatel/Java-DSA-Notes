import java.util.ArrayList;

public class GenericTree<T> {
    T data;
    ArrayList<GenericTree<T>> children;
    GenericTree(T data){
        this.data = data;
        this.children = new ArrayList<>();

    }

}
