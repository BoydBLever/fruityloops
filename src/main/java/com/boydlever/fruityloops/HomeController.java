package com.boydlever.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String fruityLoop(Model model) {

		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		fruitList.add(new Fruit("Kiwi", 2.0));
		fruitList.add(new Fruit("Mango", 2.0));
		fruitList.add(new Fruit("Goji Berries", 2.0));
		fruitList.add(new Fruit("Guava", 2.0));
		fruitList.add(new Fruit("Avocado", 2.0));
		fruitList.add(new Fruit("Georgia peaches", 2.0));


		return "fruityLoop.jsp";
	}
}
//Notice the PascalCase of the project name, FruityLoops
//There needs to be a package for the model