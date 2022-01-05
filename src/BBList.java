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
        if(point == data.length) doubleSize();
        shiftRight(index);
        data[index] = elem;
        point++;
        return true;
    }

    private void doubleSize(){
        T newData[] = (T[])new Object[point * 2];
        for(int i = 0; i < data.length; i++) newData[i] = data[i];
        data = newData;
    }
    private void shiftRight(int ind){
        for(int i = point; i > ind; i--)
            data[i] = data[i-1];
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
}
