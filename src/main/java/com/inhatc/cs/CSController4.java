package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CSController4 {

	@RequestMapping("doF")
	public String doF(RedirectAttributes rttr) {
		System.out.println("doF called########");
		
		rttr.addFlashAttribute("msg", "Redirect MSG~~~~~~~~~");
		return "redirect:/doG";
	}
	
	@RequestMapping("doG")
	public void doG(@ModelAttribute("msg") String msg) {
		System.out.println("doG called~~~~~~~~~~");

	}
}
