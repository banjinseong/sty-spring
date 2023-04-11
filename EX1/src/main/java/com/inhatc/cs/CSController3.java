package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.ProductVO;

@Controller
public class CSController3 {

	@RequestMapping("doD")
	public String doD(Model model) {
		
		System.out.println("doD calles!!!!!!!!!!!!!!");
		ProductVO pdc = new ProductVO("상품", 10000);
		
		model.addAttribute(pdc);
		return"productDetail";
	}
	@RequestMapping("doE")
	public String doE(Model model) {
		
		System.out.println("doE calles!!!!!!!!!!!!!!");
		MemberVO mb = new MemberVO("반진성");
		
		model.addAttribute(mb);
		return "domain";
	}
}
