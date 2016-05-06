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
import by.bsu.strelkov.model.User;
import by.bsu.strelkov.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<User> getAll() {
		return userService.readAll();
    }

	@RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
	@ResponseBody
	public User get(Model model, @PathVariable long user_id) {
		return userService.read(user_id);
    }

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public User add(Model model, @ModelAttribute User user) throws DiplomException {
		return userService.create(user);
    }

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public User update(Model model, @ModelAttribute User user) throws DiplomException {
		return userService.update(user);
    }

	@RequestMapping(value = "/{user_id}",method = RequestMethod.DELETE)
	public @ResponseBody void delete(Model model, @PathVariable long user_id) {
		userService.delete(user_id);
    }
}
