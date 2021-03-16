package com.atworks.kjh.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kjh_mall")
public class AT_MainController {
	public static void main(String[] args) {
		System.out.println("controller : kjh_mall");
	}
		
	@RequestMapping("/hometest")
	public String hometest(Locale locale, Model model){
		
		Date date = new Date();
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String fd = dateFormat.format(date);
		
		model.addAttribute("serverTime", fd);
		
		return "/kjh/home";
	}
	
	@RequestMapping("/main")
	public String HomeMain() {
		System.out.println("main 호출");
		
		return "kjh/main";
	}
	
	@RequestMapping("/ABOUT")
	public String ABOUT() {
		System.out.println("ABOUT 호출");
		
		return "kjh/main/ABOUT";
	}
	
	@RequestMapping("/SHOP")
	public String SHOP() {
		System.out.println("SHOP 호출");
		
		return "kjh/main/SHOP";
	}
	
	@RequestMapping("/LOOK")
	public String LOOK() {
		System.out.println("LOOK 호출");
		
		return "kjh/main/LOOK";
	}
	
	
	@RequestMapping("/BOARD")
	public String BOARD() {
		System.out.println("BOARD 호출");
		
		return "kjh/main/BOARD";
	}
	
	@RequestMapping("/PEOPLE")
	public String PEOPLE() {
		System.out.println("PEOPLE 호출");
		
		return "kjh/main/PEOPLE";
	}
	
	@RequestMapping("/LOCATION")
	public String LOCATION() {
		System.out.println("LOCATION 호출");
		
		return "kjh/main/LOCATION";
	}
	
}
