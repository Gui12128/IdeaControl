package IdeaControl.ideaControl.models;

public class Idea {

	private String idea;
	private String category;
	
	public Idea(String idea, String category) {
		this.idea = idea;
		this.category = category;
	}
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
}
