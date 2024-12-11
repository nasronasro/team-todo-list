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
}
