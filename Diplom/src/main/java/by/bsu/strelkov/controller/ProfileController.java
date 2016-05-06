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
import by.bsu.strelkov.model.Profile;
import by.bsu.strelkov.service.ProfileService;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Profile> getAll() {
		return profileService.readAll();
    }

	@RequestMapping(value = "/{profile_id}", method = RequestMethod.GET)
	@ResponseBody
	public Profile get(Model model, @PathVariable long profile_id) {
		return profileService.read(profile_id);
    }

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Profile add(Model model, @ModelAttribute Profile profile) throws DiplomException {
		return profileService.create(profile);
    }

	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public Profile update(Model model, @ModelAttribute Profile profile) throws DiplomException {
		return profileService.update(profile);
    }

	@RequestMapping(value = "/{profile_id}",method = RequestMethod.DELETE)
	public @ResponseBody void delete(Model model, @PathVariable long profile_id) {
		profileService.delete(profile_id);
    }
}
