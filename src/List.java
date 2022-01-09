public interface List<T> {
    boolean add(T elem);
    boolean add(int index, T elem);
    boolean remove(int index);
    boolean contains(T elem);
    T get(int index);
    boolean set(int index, T elem);
    boolean clear();
    List<T> clone();
    void ensureCapacity(int toAdd);
    int indexOf(T elem);
    boolean isEmpty();
    int lastIndexOf(T elem);
    boolean remove(T elem);
    boolean removeAll(T elem);
    boolean removeRange(int start, int end);
    boolean replaceAll(T elem, T newElem);
    int size();
    void bubbleSort();
    void selectionSort();
    void mergeSort();
    void quickSort();
    T[] toArray();
    void trimToSize(int size);
}
