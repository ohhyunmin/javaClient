package com.example.javaClient1.Home;

import java.io.IOException;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(value="/")
	public String indexRedirect() throws IOException {
		System.out.println("-----------------------indexRedirect");
        return "Home/index";
    }
}
