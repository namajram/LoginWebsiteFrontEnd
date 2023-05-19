package com.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
//	@RequestMapping(value = "/login", method=RequestMethod.GET )
//	public String page(ModelMap model) {
//		model.addAttribute("login", new Login());
//		return "login";

//	}
//@RequestMapping(value="/login", method=RequestMethod.POST)
//public String pages(Login login, ModelMap model) {
//	// TODO Auto-generated method stub
//	model.addAttribute("name", login.getUsername());
//Loginservice l=new Loginservice();
//
//
//if (b==true) {return "welcome";
//	
//}else {
//	model.addAttribute("e", "invaid username and pasword");
//	return "login";
//}
//}
	
	
	@Autowired
    private APIClient apiClient;

	@RequestMapping(value = "/userregister", method=RequestMethod.GET )
    public String showRegisterForm(Model model) {
        model.addAttribute("register", new Login());
        return "register";
    }

    @RequestMapping(value="/userregister", method=RequestMethod.POST)
    public String registerUser(@ModelAttribute("register") Login user) {
        apiClient.registerUser(user); // Call the API to register the user
        return "redirect:/userlogin";
    }

    @RequestMapping(value = "/userlogin", method=RequestMethod.GET )
    public String showLoginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

	@RequestMapping(value="/userlogin", method=RequestMethod.POST)
    public String loginUser(@ModelAttribute("login") Login user) {
        boolean loginSuccess = apiClient.loginUser(user); // Call the API to authenticate the user

        if (loginSuccess) {
            return "login Success";
        } else {
            return "redirect:/userlogin";
        }
    }
}
