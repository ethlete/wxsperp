package com.yahui.sperp.controller.management;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yahui.sperp.domain.Product;
import com.yahui.sperp.repository.masterdata.ProductRepository;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public ModelAndView list() {
		Iterable<Product> products = productRepository.findAll();
		return new ModelAndView("management/login", "products", products);
	}
	
	@PostMapping("dashboard")
	public ModelAndView dashboard() {
		Map<String, String[]> todolist = new HashMap<>();
		todolist.put("leaveApproval", new String[]{"a", "b", "c"});
		return new ModelAndView("dashboard", "todolist", todolist);
	}

}
