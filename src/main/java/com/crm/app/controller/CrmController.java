package com.crm.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.app.pojo.Ball;
import com.crm.app.service.CrmService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CrmController {
	
	@Autowired
	CrmService crmService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewPage(Model model) {
		System.out.println("***********hello **************************");
		System.out.println("***********hello hi **************************");
        return "home_page";
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public String create(HttpServletRequest req, Model model) {
		String id = (String) req.getParameter("id");
		String color = (String) req.getParameter("color");
		String size = (String) req.getParameter("size");
        
        
        Ball ball = new Ball();
        ball.setBallSize(Integer.parseInt(size));
        ball.setBallColor(color);
        
        crmService.saveBall(ball);
       
        ArrayList<Ball> balls = crmService.findAll();
        model.addAttribute("listofballs", balls);
        
        return "display_page";
    }
 
}
