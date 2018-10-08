package com.example.hello;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "REST main", description = "main controller")
public class RestContorller {
/*
	@RequestMapping(value="/boards/{id}",method= {RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
	public ModelAndView board(ModelAndView mav, HttpServletRequest request, HttpServletResponse response ) {
		
		//읽기햣  수정 삭제 
		if(request.getMethod().toUpperCase().equals("GET")){
			
		}else if(request.getMethod().toUpperCase().equals("PUT")){
			
		}else if(request.getMethod().toUpperCase().equals("DELETE")){
			
		}
		
		System.out.println("!!!");
		return mav;
	}
*/
	@ApiOperation(value = "목록 조회")
	@RequestMapping(value="/board", method= RequestMethod.GET )
	public JSONObject selectList( ) {
		
		JSONObject  json = null;
		
		json = new JSONObject();
		
		
		return json;
	}
	@ApiOperation(value = "검색어 조회")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "키", required = true, dataType = "string", paramType = "path")
            , @ApiImplicitParam(name = "param1", value = "파라미터1", required = true, dataType = "string", paramType = "query")
    })
	@RequestMapping(value="/board/{id}",method= RequestMethod.GET )
	public JSONObject selectListSearch( @PathVariable("id") String id ) {
		
		JSONObject  json = null;
		
		json = new JSONObject();
		
		
		return json;
	}
	

	
	

	@ApiOperation(value = "입력")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "키", required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "param1", value = "파라미터1", required = true, dataType = "string", paramType = "query")
    })
	@RequestMapping(value="/board/{id}",method= RequestMethod.PUT )
	public JSONObject inputTest( @PathVariable("id") String id,
				@RequestParam String param1 
			) {
		
		JSONObject  json = null;
		
		json = new JSONObject();
		
		
		return json;
	}
	

	
}
