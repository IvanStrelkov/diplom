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
import by.bsu.strelkov.model.Rating;
import by.bsu.strelkov.service.RatingService;

@Controller
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Rating> getAll() {
		return ratingService.readAll();
    }

	@RequestMapping(value = "/{rating_id}", method = RequestMethod.GET)
	@ResponseBody
	public Rating get(Model model, @PathVariable long rating_id) {
		return ratingService.read(rating_id);
    }

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Rating add(Model model, @ModelAttribute Rating rating) throws DiplomException {
		return ratingService.create(rating);
    }

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Rating update(Model model, @ModelAttribute Rating rating) throws DiplomException {
		return ratingService.update(rating);
    }

	@RequestMapping(value = "/{rating_id}",method = RequestMethod.DELETE)
	public @ResponseBody void delete(Model model, @PathVariable long rating_id) {
		ratingService.delete(rating_id);
    }
}
