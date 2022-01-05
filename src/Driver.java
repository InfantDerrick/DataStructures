import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Driver {
    public static void main(String[] args){
        BBList<Integer> bb = new BBList<>();
        for(int i = 0; i < 15; i++) bb.add(i);
        for(int i = 0; i < 7; i++) bb.remove(i);
        bb.remove(5);
        bb.get(-1);
        System.out.println(bb);

    }
}
