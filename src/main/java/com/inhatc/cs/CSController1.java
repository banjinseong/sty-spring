package com.inhatc.cs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController1 {
	
	@RequestMapping("doA")
	public void doA() {
		System.out.println("doA Called!~~~~~~~~~~~~");
	}
	@RequestMapping("doB")
	public String doB() {
		return "doBresult";
	}
	
}
