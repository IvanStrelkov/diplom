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
import by.bsu.strelkov.model.Like;
import by.bsu.strelkov.service.LikeService;

@Controller
@RequestMapping("/like")
public class LikeController {

	@Autowired
	private LikeService likeService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Like> getAll() {
		return likeService.readAll();
    }

	@RequestMapping(value = "/{like_id}", method = RequestMethod.GET)
	@ResponseBody
	public Like get(Model model, @PathVariable long like_id) {
		return likeService.read(like_id);
    }

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Like add(Model model, @ModelAttribute Like like) throws DiplomException {
		return likeService.create(like);
    }

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Like update(Model model, @ModelAttribute Like like) throws DiplomException {
		return likeService.update(like);
    }

	@RequestMapping(value = "/{like_id}",method = RequestMethod.DELETE)
	public @ResponseBody void delete(Model model, @PathVariable long like_id) {
		likeService.delete(like_id);
    }
}
