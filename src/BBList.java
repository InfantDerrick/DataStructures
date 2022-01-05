public class BBList<T> implements List<T> {
    private T data[];
    private int point;

    public BBList(){
        data = (T[])(new Object[10]);
        point = 0;
    }
    public BBList(int initialCapacity){
        data = (T[])(new Object[initialCapacity > 1 ? initialCapacity : 10]);
        point = 0;
    }
    @Override
    public boolean add(T elem) {
        return add(point, elem);
    }

    @Override
    public boolean add(int index, T elem) {
        if(index > point) return false;
        if(point + 1 == data.length) changeByFactor(2);
        shiftRight(index);
        data[index] = elem;
        return true;
    }
    private void changeByFactor(double factor){
        T newData[] = (T[])new Object[(int)(factor * point)];
        for(int i = 0; i < point; i++) newData[i] = data[i];
        data = newData;
    }
    private void shiftRight(int ind){
        for(int i = point; i > ind; i--)
            data[i] = data[i-1];
        point++;
    }
    private void shiftLeft(int ind){
        for(int i = ind; i < point; i++)
            data[i] = data[i+1];
        point--;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < point; i++){
            sb.append(data[i].toString()).append(", ");
        }
        if(sb.length() > 1) sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean remove(int index) {
        if(index > point) return false;
        if((point + 1) * 2 < data.length && data.length > 10) changeByFactor(0.75);
        shiftLeft(index);
        return true;
    }

    public boolean contains(T elem){
        for(int i = 0; i < point; i++){
            if(data[i].equals(elem)) return true;
        }
        return false;
    }
    //TODO: get and set
    public T get(int index){
        if(index < 0 || index >= point) throw new ArrayIndexOutOfBoundsException();
        return data[index];
    }
    public boolean set(int index, T elem){
        if(index < 0 || index >= point) throw new ArrayIndexOutOfBoundsException();
        data[index] = elem;
        return true;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public List clone() {
        return null;
    }

    @Override
    public void ensureCapacity() {

    }

    @Override
    public int indexOf(T elem) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int lastIndexOf(int index) {
        return 0;
    }

    @Override
    public boolean remove(T elem) {
        return false;
    }

    @Override
    public boolean removeAll(T elem) {
        return false;
    }

    @Override
    public boolean removeRange(int start, int end) {
        return false;
    }

    @Override
    public boolean replaceAll(T elem, T newElem) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void bubbleSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public void trimToSize(int size) {

    }

}
