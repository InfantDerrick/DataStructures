public interface List<T> {
    boolean add(T elem);
    boolean add(int index, T elem);
    boolean remove(int index);
    boolean contains(T elem);
    T get(int index);
    boolean set(int index, T elem);
}
