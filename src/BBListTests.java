import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BBListTests {
    @Test
    @DisplayName("test the construction and toString()")
    public void testConstructorAndToString(){
        String[] familyMembers = new String[]{"Derrick", "Angeline", "Adonis", "Andromeda"};
        BBList<String> list1 = new BBList<>();
        BBList<String> list2 = new BBList<>(20);
        BBList<String> list3 = new BBList<>(familyMembers);

        Assertions.assertAll(() -> {
            assertEquals("[]", list1.toString());
            assertEquals("[]", list2.toString());
            assertEquals(Arrays.toString(familyMembers), list3.toString());
        });
    }
    @Test
    @DisplayName("test add()")
    public void testAdd(){
        BBList<String> list = new BBList<>();
        for(int i = 0; i < 20; i++) assertTrue(list.add("" + i));
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]", list.toString());
        list = new BBList<>();
        assertEquals("[]", list.toString());
        BBList<String> finalList = list;
        Assertions.assertAll(() -> {
            assertTrue(finalList.add(0, "zero"));
            assertTrue(finalList.add(0, "one"));
            assertTrue(finalList.add(0, "two"));
            assertTrue(finalList.add(2, "three"));
            assertEquals("[two, one, three, zero]", finalList.toString());
        });
    }
    @Test
    @DisplayName("test remove()")
    public void testRemove(){
        BBList<String> list = new BBList<>();
        for(int i = 0; i < 20; i++) list.add("" + i);
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]", list.toString());
        assertTrue(list.remove(3));
        assertEquals("[0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]", list.toString());
        for(int i = 18; i > 10; i--) assertTrue(list.remove(i));
        assertEquals("[0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11]", list.toString());
    }


}
