package com.yahui.sperp.controller.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

}
