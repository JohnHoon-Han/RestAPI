package com.example.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestContorller {

	@RequestMapping(value="/board/{id}",method= {RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
	public ModelAndView board(ModelAndView mav, HttpServletRequest request, HttpServletResponse response ) {
		
		//읽기햣  수정 삭제 
		if(request.getMethod().toUpperCase().equals("GET")){
			
		}else if(request.getMethod().toUpperCase().equals("PUT")){
			
		}else if(request.getMethod().toUpperCase().equals("DELETE")){
			
		}
		
		System.out.println("!!!");
		return mav;
	}


	@RequestMapping(value="/board",method= {RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
	public ModelAndView list(ModelAndView mav, HttpServletRequest request, HttpServletResponse response ) {
		
		
		
		
		return mav;
	}


}
