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
import by.bsu.strelkov.model.record.Resume;
import by.bsu.strelkov.service.ResumeService;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private ResumeService postService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Resume> getAll() {
		return postService.readAll();
    }

	@RequestMapping(value = "/{post_id}", method = RequestMethod.GET)
	@ResponseBody
	public Resume get(Model model, @PathVariable long post_id) {
		return postService.read(post_id);
    }

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Resume add(Model model, @ModelAttribute Resume post) throws DiplomException {
		return postService.create(post);
    }

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Resume update(Model model, @ModelAttribute Resume post) throws DiplomException {
		return postService.update(post);
    }

	@RequestMapping(value = "/{post_id}",method = RequestMethod.DELETE)
	public @ResponseBody void delete(Model model, @PathVariable long post_id) {
		postService.delete(post_id);
    }
}
