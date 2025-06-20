import java.util.ArrayList;

public class MyList<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T value) {
        list.add(value);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void remove(T value) {
        list.remove(value);
    }

    public void addAll(ArrayList<T> values) {
        list.addAll(values);
    }

    public void print() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}