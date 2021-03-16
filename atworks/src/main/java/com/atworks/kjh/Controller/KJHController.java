package com.atworks.kjh.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/kjh")
public class KJHController {
	public static void main(String[] args) {
		System.out.println("controller : kjh");
	}
		
	@RequestMapping("/home")
	public String home(Locale locale, Model model){
		
		Date date = new Date();
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String fd = dateFormat.format(date);
		
		model.addAttribute("serverTime", fd);
		
		return "/kjh/home";
	}
	
	@RequestMapping("/test")
	public String hometest(Locale locale, Model model){
		
//		sessionTest(null, model);
		
		Date date = new Date();
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String fd = dateFormat.format(date);
		
		model.addAttribute("serverTime", fd);
		return "/kjh/home";
	}
	
//	List 
//	Map
//	JSP 하나를 만들어서. java data(단일데이터, 리스트데이터, 맵데이터) 를 리퀘스트받은후, jsp화면에 jstl, el표현식으로 출력하세요
	@RequestMapping("/receive")
	public String receive(HttpServletRequest request, Model model){
		
		Map<String, Object> HCMap = new HashMap<String, Object>();
		
		List<String> list = new ArrayList<String>();
		
		String test1="111111111111111";
		String test2="222222222222222";
		String test3="333333333333333";
		
		list.add(test1);
		list.add(test2);
		list.add(test3);
		
		  int totalElements = list.size();// arrayList의 요소의 갯수를 구한다.
		  for (int i = 0; i < totalElements; i++) {
		   System.out.println(list.get(i));
		  }
		
		HCMap.put("keyTest", list);
		
		model.addAttribute("HCMap", HCMap);	
		
		model.addAttribute("list",list);
		
		System.out.println("list : "+list);
		
		System.out.println("HCMap : "+HCMap);
	
		for(Entry<String, Object> entry : HCMap.entrySet()) {
			System.out.println("[key]"+entry.getKey()+",[value]:"+entry.getValue());
		}
		
		return "/kjh/con_jsp_receive";
	}
	
	@RequestMapping("/receive2")
	public String receive2(HttpServletRequest request, Model model) {
		
		List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "가씨" );
		map1.put("age", "25" );
		map1.put("gender", "남자" );
		listMap.add(map1);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "나씨" );
		map2.put("age", "35" );
		map2.put("gender", "여자" );
		listMap.add(map2);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("name", "다씨" );
		map3.put("age", "45" );
		map3.put("gender", "남자" );
		listMap.add(map3);
		
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("name", "라씨" );
		map4.put("age", "52" );
		map4.put("gender", "여자" );
		listMap.add(map4);
		
		model.addAttribute("listMap",listMap);
		
		System.out.println("listMap"+listMap);
		
		return "kjh/con_jsp_receive2";
	}
	
	@RequestMapping("/a")
	public String sessionTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		HttpSession session = request.getSession();
	
		System.out.println("session : " + session);
		System.out.println(session.getId());
		
		return "/kjh/SessionTest";
	}
	
	@RequestMapping("/b")
	public String cookieTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Cookie cookie = new Cookie("cookietest", "test"); //쿠키 생성
		response.addCookie(cookie); //쿠키 전송
		
		System.out.println("cookie : " + cookie);
		System.out.println(cookie.getName());
			
		return "/kjh/CookieTest";
	}
	
	
	
}