package IdeaControl.ideaControl.models;

import java.util.ArrayList;

public class TaskTopics {

	private String taskTitle;
	private Task task;
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public TaskTopics(String taskTitle, Task task) {
		this.taskTitle = taskTitle;
		this.task = task;
//		tasks.add(task);
	}
	
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public ArrayList<Task> getTasks() {
		return tasks;
	}
	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
