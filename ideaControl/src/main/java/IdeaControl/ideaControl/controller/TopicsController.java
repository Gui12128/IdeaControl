package IdeaControl.ideaControl.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import IdeaControl.ideaControl.models.Idea;
import IdeaControl.ideaControl.models.IdeaTopics;
import IdeaControl.ideaControl.models.Task;
import IdeaControl.ideaControl.models.TaskTopics;


@Controller
public class TopicsController {

	@RequestMapping("/tasks")
	@ResponseBody
	public List<TaskTopics> listTaskTopics() {
		TaskTopics taskTopics = new TaskTopics("Casa", new Task("Organizar quarto", "prioridade 2"));
		return Arrays.asList(taskTopics, taskTopics, taskTopics);
	}
	
	@RequestMapping("/ideas")
	@ResponseBody
	public List<IdeaTopics> listIdeaTopics() {
		IdeaTopics ideaTopics = new IdeaTopics(new Idea("Meio doidera tudo isso ", "Pensamento"));
		return Arrays.asList(ideaTopics, ideaTopics, ideaTopics);
	}
	
}
