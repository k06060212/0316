package com.atworks.kjh.Controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atworks.kjh.DTO.MemberDTO;
import com.atworks.kjh.Service.MemberService;


@Controller
@RequestMapping("/kjh_mall")
public class AT_MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(AT_MemberController.class);

	@Inject
	MemberService service;
	
	@RequestMapping("/LOGIN")
	public String Login() {
		
		System.out.println("LOGIN 호출");
		
		return "kjh/member/LOGIN";
	}
	
	@RequestMapping("/JOIN")
	public String JOIN() {
		System.out.println("JOIN 호출");
		
		return "kjh/member/JOIN";
	}
	
	@RequestMapping("/SHOPPING_BASKET")
	public String SHOPPINGBASKET() {
		System.out.println("SHOPPING_BASKET 호출");
		
		return "kjh/member/SHOPPING_BASKET";
	}	
		
	// 회원가입 post
	@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
	public String postRegister(MemberDTO dto) throws Exception {
		logger.info("post register");
			
		service.join(dto);
			
		return "member/login_check";
	}
	
}
