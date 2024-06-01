package com.home.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.home.spring.model.Item;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping("/home")
	public String getHome(Model model)
	{
		model.addAttribute("name", "Farheen");
		return "first";
	}
	
	@RequestMapping("/data")
	public String getData(ModelMap model)
	{
		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("Brazil");
		model.addAttribute("name", "Farheen");
		model.addAttribute("list",list);
		return "first";
	}
	
	@RequestMapping("/itemform")
	public String getItemForm()
	{
		return "itemform";
		
	}
	
	
	@RequestMapping("/item")
	public ModelAndView getItem()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("itemlist");
		mv.addObject("item",new Item());
		return mv;
	}
	
	//method one to access and retrieve data from ui and send to controller ie. UI to Controller
	
	@RequestMapping("/processitem")
	public ModelAndView getItem1(HttpServletRequest request)
	{
		int id = Integer.parseInt(request.getParameter("itemId"));
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		int rate = Integer.parseInt(request.getParameter("rate"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		Item item = new Item();
		item.setItemId(id);
		item.setName(name);
		item.setCategory(category);
		item.setRate(rate);
		item.setQuantity(quantity);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("itemlist");
		mv.addObject("item", item);
		return mv;
	}
	
	//method two to access and retrieve data from ui and send to controller ie. UI to Controller
	
	@RequestMapping("/processitem1")
	public ModelAndView getItem2(@RequestParam int itemId,
			@RequestParam String name, @RequestParam String category,
			@RequestParam int rate,@RequestParam int quantity)
	{
		
		
		Item item = new Item();
		item.setItemId(itemId);
		item.setName(name);
		item.setCategory(category);
		item.setRate(rate);
		item.setQuantity(quantity);
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("itemlist");
//		mv.addObject("item", item);
//		return mv;
		
		//above code could be written as below in one line
		
		return new ModelAndView("itemlist","item",item);
	}
	
	
	
	//method two to access and retrieve data from ui and send to controller ie. UI to Controller
	
		@RequestMapping("/processitem2")
		public ModelAndView getItem3(@ModelAttribute Item item)
		{
			return new ModelAndView("itemlist","item",item);			
			
		}
}