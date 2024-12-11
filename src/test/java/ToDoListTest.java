import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ToDoListTest {

    private ToDoList toDoList;

   
    @BeforeEach
    public void setUp() {
        toDoList = new ToDoList();
    }

   
    @Test
    public void testAddTask() {
        toDoList.AddTask("Buy groceries");
        List<String> tasks = toDoList.GetTasks(); 
        assertEquals(1, tasks.size());
        assertEquals("Buy groceries", tasks.get(0));
    }

   
    @Test
    public void testRemoveTask() {
        toDoList.AddTask("Task 1");
        toDoList.AddTask("Task 2");
        toDoList.removeTask(0);

        List<String> tasks = toDoList.GetTasks();
        assertEquals(1, tasks.size());
        assertEquals("Task 2", tasks.get(0));
    }

   
    @Test
    public void testUpdateTask() {
        toDoList.AddTask("Old Task");
        toDoList.UpdateTask(0, "Updated Task");

        List<String> tasks = toDoList.GetTasks();
        assertEquals(1, tasks.size());
        assertEquals("Updated Task", tasks.get(0));
    }

  
    @Test
    public void testGetTasks() {
        toDoList.AddTask("Task 1");
        toDoList.AddTask("Task 2");
        List<String> tasks = toDoList.GetTasks();

        assertEquals(2, tasks.size());
        assertTrue(tasks.contains("Task 1"));
        assertTrue(tasks.contains("Task 2"));
    }

  
    @Test
    public void testRemoveInvalidTask() {
        toDoList.AddTask("Task 1");
        toDoList.removeTask(5); 
        List<String> tasks = toDoList.GetTasks();
        assertEquals(1, tasks.size());
    }

 
    @Test
    public void testUpdateInvalidTask() {
        toDoList.AddTask("Task 1");
        toDoList.UpdateTask(5, "New Task"); 
        List<String> tasks = toDoList.GetTasks();
        assertEquals("Task 1", tasks.get(0)); 
    }
}