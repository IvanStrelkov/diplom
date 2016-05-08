package by.bsu.strelkov.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import by.bsu.strelkov.exception.DiplomException;
import by.bsu.strelkov.model.record.Job;
import by.bsu.strelkov.service.JobService;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private JobService feedbackService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Job> getAll() {
		return feedbackService.readAll();
    }

	@RequestMapping(value = "/{feedback_id}", method = RequestMethod.GET)
	@ResponseBody
	public Job get(Model model, @PathVariable long feedback_id) {
		return feedbackService.read(feedback_id);
    }

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Job add(Model model, @ModelAttribute Job feedback) throws DiplomException {
		return feedbackService.create(feedback);
    }

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Job update(Model model, @ModelAttribute Job feedback) throws DiplomException {
		return feedbackService.update(feedback);
    }

	@RequestMapping(value = "/{feedback_id}",method = RequestMethod.DELETE)
	public @ResponseBody void delete(Model model, @PathVariable long feedback_id) {
		feedbackService.delete(feedback_id);
    }
}
