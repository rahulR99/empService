package ems.com.controller;


import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ems.com.model.User;

@Controller
@RequestMapping(value="/user",consumes="application/json", produces="application/json")
public class UserController implements Serializable{

	private static final long serialVersionUID = 1L;
	@RequestMapping(value="/create",method=RequestMethod.POST,
			headers={"Accept=application/json", "Content-Type=application/json"})
	@ResponseBody
	public String createUser(@RequestBody User user){
		
		//JSONObject jsonObj = new JSONObject(user);
		//String projectname = data.getString("name");
		System.out.println("String---"+user.getAddress()+"--------------------");
		return "scuccess";
	}
	@RequestMapping(value = "/ste", method = RequestMethod.POST)
	public @ResponseBody String saveContact(@ModelAttribute User user) {
		System.out.println(user.getName()+"    "+user.getAddress());
	    return "SAved";
	}
}
