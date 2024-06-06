package com.calculator.calci.AddController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.calculator.calci.domain.Addition;

@Controller 
public class AddController {
	@GetMapping("/index")
	public String ViewForm(Model model) {
		model.addAttribute("Addition",new Addition());
		return "index";
	}
	
	@PostMapping("/addition")
	public String addForm(@ModelAttribute Addition addition,BindingResult result,Model model) {
		double resultValue;
		try {
			switch(addition.getOperation()) {
			case "add":
				resultValue= addition.add();
				break;
			case "subtract":
			resultValue= addition.subtract();
				break;
			case "multiply":
				resultValue= addition.multiply();
				break;
			case "divide":
				resultValue = addition.divide();
				break;
			default:
	            throw new IllegalArgumentException("Invalid operation");
	
			}
			
			model.addAttribute("result",resultValue);
		}
		catch (ArithmeticException e) {
            model.addAttribute("error", e.getMessage());
        } 
		return "calculate";
	}
}
