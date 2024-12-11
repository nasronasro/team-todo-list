import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<String> todos;
	
	public ToDoList() {
		todos = new ArrayList();
	}
	
	public void AddTask(String task) {
		todos.add(task);
	}
	
	public List<String> GetTasks() {
		return todos;
	}
	
	public void RemoveTask(String task) {
		todos.remove(task);
	}
	
	public void UpdateTask(int id, String newTask) {
        if (id >= 0 && id < todos.size()) {
            todos.set(id, newTask);
        } else {
            System.out.println("ID invalide : " + id);
        }
    }
}
