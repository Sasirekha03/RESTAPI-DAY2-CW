package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ApiModel;

@RestController
public class ApiController {

	@GetMapping("/sn")
	public ApiModel function()
	{
		return new ApiModel("Sasirekha");
	}
	
}
