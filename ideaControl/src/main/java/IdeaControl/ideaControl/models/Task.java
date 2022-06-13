package IdeaControl.ideaControl.models;

public class Task {
		
		private String task;
		private String priority;
		
		public Task(String task, String priority) {
			this.task = task;
			this.priority = priority;
		}
		
		public String getTask() {
			return task;
		}
		public void setTask(String task) {
			this.task = task;
		}
		public String getPriority() {
			return priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

}
