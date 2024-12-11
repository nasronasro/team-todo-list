import java.util.ArrayList;

public class ToDoList {
	private ArrayList<String> todos;
	private int id;
	public ToDoList() {
		todos = new ArrayList<>();
		setId(0);
	}
	
	public void AddTask(String task) {
		todos.add(task);
		id++;
		System.out.println("ajout de la task : " + task);
	}
	
	public ArrayList<String> GetTasks() {
		return todos;
	}
	
	public void removeTask(int id) {
        if (id >= 0 && id < todos.size()) {
            todos.remove(id); 
            System.out.println(" suppression ac succes ");
        } else {
            System.out.println("id eroné");
        }
    }
	
	public void UpdateTask(int id, String newTask) {
        if (id >= 0 && id < todos.size()) {
            todos.set(id, newTask);
            System.out.println(" task updated :) ");
        } else {
            System.out.println(" verfier l'id demander : " + id);
        }
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
