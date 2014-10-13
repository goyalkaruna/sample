package edu.sjsu.cmpe275.lab2;

import java.text.DateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProfileController {
	
	  
	   
	   @RequestMapping(method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("profile", "command", new Profile());
	   }
	   
	   @RequestMapping(value ="/results",method = RequestMethod.POST)
	   public String addProfile(@ModelAttribute("SpringWeb")Profile profile, 
	   ModelMap model) {
	      model.addAttribute("id", profile.getId());
	      model.addAttribute("firstname", profile.getFirstname());
	      model.addAttribute("lastname", profile.getLastname());
	      model.addAttribute("email", profile.getEmail());
	      model.addAttribute("address", profile.getAddress());
	      model.addAttribute("organization", profile.getOrganization());
	      model.addAttribute("aboutMyself", profile.getAboutMyself());
	      return "results";
	   }
}
