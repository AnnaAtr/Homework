import java.util.ArrayList;

public class MyHashSet<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void insert(T value) {
        if (!data.contains(value)) {
            data.add(value);
        }
    }

    public void delete(T value) {
        data.remove(value);
    }

    public void print() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}