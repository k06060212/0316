package com.atworks.kjh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kjh_mall")
public class AT_OperatorController {

	@RequestMapping("/OPERATOR_main")
	public String OPERATOR() {
			System.out.println("OPERATOR_main 호출");
			
		return "kjh/operator/OPERATOR_main";
	}
}
