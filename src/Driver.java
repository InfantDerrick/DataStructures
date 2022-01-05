import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Driver {
    public static void main(String[] args){
        BBList<Integer> bb = new BBList<>();
        for(int i = 0; i < 100; i++) bb.add(i);
        System.out.println(bb);

    }
}
