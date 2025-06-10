package lab_10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ToDoListTest {

    @Test
    void testAddTask() {
        ToDoList list = new ToDoList();
        list.addTask("Study");
        assertTrue(list.getTasks().contains("Study"));
    }

    @Test
    void testRemoveTask() {
        ToDoList list = new ToDoList();
        list.addTask("Exercise");
        list.removeTask("Exercise");
        assertFalse(list.getTasks().contains("Exercise"));
    }
}
