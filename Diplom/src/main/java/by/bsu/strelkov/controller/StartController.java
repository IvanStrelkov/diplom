package by.bsu.strelkov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

	@RequestMapping(value = "/")
	public String start(Model model){
		return "start";
	}
}