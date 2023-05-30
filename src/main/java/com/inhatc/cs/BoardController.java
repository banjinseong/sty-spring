package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.Criteria;
import com.inhatc.domain.PageMaker;
import com.inhatc.domain.boardVO;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*")//localhost:port/board/~~~~~
public class BoardController {
	
	@Inject
	private BoardService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGET(boardVO board, Model model)throws Exception {
		System.out.println("!~~~~~~~~ called");
		return "/board/register3";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(boardVO board, RedirectAttributes rttr)throws Exception {
		System.out.println("!~~~~~~~~ called");
		service.regist(board);
		return "redirect:/board/listAll";
	}
	
	//board/listall
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public String listAllGET(boardVO board, Model model)throws Exception {
		System.out.println("called listall page (get)");
		model.addAttribute("list",service.listAll());
		return "/board/listAll7";
	}
	
	//board/read
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readGET(@RequestParam("bno")int bno, Model model)throws Exception {
		System.out.println("called read page (get)");
		System.out.println("bno="+bno);
		model.addAttribute("boardVO",service.read(bno));
		return "/board/read7";
	}
	
	//board/modify
		@RequestMapping(value = "/modify", method = RequestMethod.GET)
		public String modifyGET(@RequestParam("bno")int bno, Model model)throws Exception {
			System.out.println("called modify page (get)");
			System.out.println("bno="+bno);
			model.addAttribute("boardVO",service.read(bno));
			return "/board/modify";
		}
	//board/modify
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(boardVO vo, Model model)throws Exception {
		System.out.println("called modify page (post)");
		System.out.println("bno="+vo.getBno());
		System.out.println("bno="+vo.getContent());
		System.out.println("bno="+vo.getTitle());
		System.out.println("bno="+vo.getWriter());
		System.out.println("bno="+vo.getView());
		System.out.println("bno="+vo.getRegdate());
		
		service.modify(vo);
		return "redirect:/board/listAll";
	}
		
	//board/remove
	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String removeGET(@RequestParam("bno")int bno)throws Exception {
		service.remove(bno);
		return "redirect:/board/listAll";
	}
	
	//board/listPage
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public String listPageGET(boardVO board, Model model)throws Exception {
		System.out.println("called listPage page (get)");
		model.addAttribute("list",service.listPage(3));
		return "/board/listAll7";
	}
	
	//board/listCri
	@RequestMapping(value = "/listCri", method = RequestMethod.GET)
	public String listCriGET(@ModelAttribute("cri") Criteria cri, Model model)throws Exception {
		System.out.println("√—µ•¿Ã≈Õºˆ: " + service.totalDataCount());
		model.addAttribute("list",service.listCriteria(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.totalDataCount());
		model.addAttribute("pageMaker", pageMaker);
		return "/board/listPage";
	}
	
	//board/readPage
		@RequestMapping(value = "/readPage", method = RequestMethod.GET)
		public String readPage(@RequestParam("bno")int bno, @ModelAttribute("cri") Criteria cri, Model model)throws Exception {
			System.out.println("called read page (get)");
			System.out.println("bno="+bno);
			model.addAttribute("boardVO",service.read(bno));
			return "/board/readPage";
		}
		
		//board/modifyPage
		@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
		public String modifyPageGet(@RequestParam("bno")int bno, @ModelAttribute("cri") Criteria cri, Model model)throws Exception {
		
			
			model.addAttribute(service.read(bno));
			return "/board/modifyPage";
		}
		
		@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
		public String modifyPagePOST(boardVO vo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr, Model model)throws Exception {
			
			service.modify(vo);
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("perPageNum", cri.getPerPageNum());
			return "redirect:/board/listCri";
		}
		
		//board/remove
		@RequestMapping(value = "/removePage", method = RequestMethod.POST)
		public String removePOST(@RequestParam("bno")int bno,@ModelAttribute("cri") Criteria cri, RedirectAttributes rttr)throws Exception {
			service.remove(bno);
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("perPageNum", cri.getPerPageNum());
			return "redirect:/board/listCri";
		}
}
