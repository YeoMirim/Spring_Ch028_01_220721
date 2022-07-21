package com.mirim.mybatis28;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mirim.mybatis28.dao.ContentDao;
import com.mirim.mybatis28.dto.ContentDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	ContentDao dao;

	@Autowired
	public void setDao(ContentDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping (value = "/writeForm")
	public String writeForm() {
		
		return "writeForm";
	}
	
	
	@RequestMapping (value = "write")
	public String write(HttpServletRequest request) {
		
		String mwriter = request.getParameter("mwriter");
		String mcontent = request.getParameter("mcontent");
		
		dao.writeDao(mwriter, mcontent);
		
		return "redirect:list";
	}
	
	@RequestMapping (value = "/list")
	public String list(Model model) {
		
		ArrayList<ContentDto> dtos = dao.listDao();
		model.addAttribute("list", dtos);
		
		return "list";
	}
	
	@RequestMapping (value = "/delete")
	public String delete(HttpServletRequest request) {
		
		dao.deleteDao(request.getParameter("mid"));
		
		return "redirect:list";
	}
}
