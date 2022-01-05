public interface List<T> {
    boolean add(T elem);
    boolean add(int index, T elem);
    boolean remove(int index);
    boolean contains(T elem);
    T get(int index);
    boolean set(int index, T elem);
    boolean clear();
    List clone();
    void ensureCapacity();
    int indexOf(T elem);
    boolean isEmpty();
    int lastIndexOf(int index);
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
