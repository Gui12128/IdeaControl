package IdeaControl.ideaControl.models;

import java.util.ArrayList;

public class IdeaTopics {
	
	private Idea idea;
	private ArrayList<Idea> ideas = new ArrayList<Idea>();
	
	public IdeaTopics(Idea idea) {
		this.idea = idea;
//		ideas.add(idea);
	}
	
	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}

	public ArrayList<Idea> getIdeas() {
		return ideas;
	}
	public void setIdeas(ArrayList<Idea> ideas) {
		this.ideas = ideas;
	}
	
	
}
