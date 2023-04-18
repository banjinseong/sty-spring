package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController {

	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJOSN() {
		
		ProductVO pdc = new ProductVO("ªÛ«∞", 100);
		
		System.out.println("doJSON called!!!!!!!!!!!!!!!!!!!!!!");
		return pdc;
	}
	
}
