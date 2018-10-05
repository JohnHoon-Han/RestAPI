package com.example.hello;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
	@RequestMapping(value= "/", method= {RequestMethod.POST, RequestMethod.GET})
	public  @ResponseBody ModelAndView index(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	} 
	
	@RequestMapping(value= "/es6", method= {RequestMethod.POST, RequestMethod.GET})
	public  @ResponseBody ModelAndView es6(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
		mav.setViewName("/es6");
		return mav;
	} 
	

	@RequestMapping(value="/data", method={RequestMethod.POST, RequestMethod.GET , RequestMethod.PUT , RequestMethod.DELETE  } )
	@ResponseBody
	public String data(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
		
		System.out.println(" Method : " + request.getMethod() );
		
		
		JSONParser parser = new JSONParser();
		String json = "";
		
		
		//System.out.println(f.getCanonicalPath()+"\\src\\main\\webapp\\data\\data.txt");
		try {
			
			File f = new File("C:\\workspace\\Web\\src\\main\\webapp\\data\\data.txt");
			System.out.println(" f ? " + f.exists());
			
			Object parserObj = parser.parse(new FileReader("C:\\workspace\\Web\\src\\main\\webapp\\data\\data.txt"));
			
			JSONArray obj = (JSONArray)parserObj;
			System.out.println(	obj.toJSONString() );
			json = obj.toJSONString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return json  ;
	} 

}
