import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Driver {
    public static void main(String[] args){
        testAdd();
        testRemove();
        BBList<String> list = new BBList<>(new String[]{"Hello"});
        System.out.println(list);
    }

    public static void testAdd(){
        BBList<Integer> bb = new BBList<>();
        for(int i = 0; i < 15; i++) bb.add(i);
        System.out.println(bb);
    }
    public static void testRemove(){
        BBList<Integer> bb = new BBList<>();
        for(int i = 0; i < 15; i++) bb.add(i);
        System.out.println(bb);
    }
    public static void testReplaceAll(){

    }
    public static void testDifferentConstructors(){

    }
}
