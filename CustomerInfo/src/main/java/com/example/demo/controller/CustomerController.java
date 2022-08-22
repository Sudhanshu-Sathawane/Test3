package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.CustomerInfo;

@Controller
public class CustomerController {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/customerInfo")
	public ModelAndView customerInfo(CustomerInfo cust) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("cust",cust);
		mv.setViewName("Info.jsp");
		return mv;
	}
	/*Output:
	 * Welcome
	Customer 101, Sudhanshu, 9970125946, Bhandara, 1234, Java03
	 */
	
}
