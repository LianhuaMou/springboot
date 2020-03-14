package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;

@Controller
public class HelloWorldController {

	@Autowired
	private UserInfoService userInfoService;
	
	/**
	 * 测试获取用户名
	 * 访问： http://127.0.0.1:8088/index/1
	 * @param model
	 * @param userId
	 * @return
	 */
	
	  @RequestMapping("index/{userId}") public String hello(@PathVariable("userId")
	  String userId,Model model) {
	  
	  String userName = userInfoService.getUserName(userId);
	  System.out.println(userId+"给个面子"+userName); 
	  model.addAttribute("userName",userName); 
	  return "index"; 
	  }
	
	@RequestMapping(value = "/",method = {RequestMethod.POST,RequestMethod.GET})
	public String login() {
		return "login";
	}
	 /*用户登录*/
    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.GET})
    public String loginUser(HttpServletRequest request,HttpSession session) {
        String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	System.out.println(username+"密码"+password);
    	String tname=userInfoService.login(username,password);
    	session.setAttribute("tname", tname);
        if (tname != null) { 
            return "redirect:/selectAll";
        } else {
            return "login";
        }
    }

	 @RequestMapping("/selectAll")
	    public String selectAll(Model model){
	        List<UserInfo> list= userInfoService.selectAll();
	        model.addAttribute("users",list);
	        return "list";
	    }
	 
	 /*添加用户页面*/
	    @RequestMapping("/add")
	    public String addUser(Model model){
	    	System.out.println("add的方法");
	    	model.addAttribute("userInfo",new UserInfo());
	    	System.out.println("跳转页面以前");
	        return "add";
	    }
	    
	    /*添加完用户后重定向到list页面*/
	    @PostMapping("/saveI")
	    public String saveI(@ModelAttribute UserInfo userInfo){
	        userInfoService.insert(userInfo);
	     	System.out.println("跳转页面以前");
	     	//userInfo.setBirthday(new Date());
	        System.out.println(userInfo.getBirthday());
	        return "redirect:/selectAll";
	    }
	    

	    /*更新用户页面*/
	    @RequestMapping("/update")
	    public String updateUser(Model model){
	    	System.out.println("更新前");
	        model.addAttribute("userInfo",new UserInfo());
	        System.out.println("gengxin====================");
	        return "update";
	    }

	    /*更新完用户后重定向到list页面*/
	    @PostMapping("/saveU")
	    public String saveU(@ModelAttribute UserInfo userInfo){
	        userInfoService.UpdateUser(userInfo);
	        return "redirect:/selectAll";
	    }

	    /*删除用户*/
	    @RequestMapping("/delete")
	    public String deleteUser(String id){
	        userInfoService.delete(id);
	        System.out.println("删除成功");
	        return "redirect:/selectAll";
	    }
	    
	   

}
