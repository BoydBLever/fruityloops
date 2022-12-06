package com.boydlever.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boydlever.models.Fruit;
@Controller
public class HomeController {

	@RequestMapping("/fruityLoop")
	public String fruityLoop(Model model) {
		ArrayList<Fruit>fruitList = new ArrayList<Fruit>();
		fruitList.add(new Fruit("Kiwi", 5));
		fruitList.add(new Fruit("Apple", 4));
		fruitList.add(new Fruit("Orange", 5));
		fruitList.add(new Fruit("Avocado", 2));
		
		model.addAttribute("fruitList", fruitList);
		return "fruityLoop.jsp";
	}
}