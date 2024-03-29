package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	
	@RequestMapping("/")
    @ResponseBody
    public String hauptseite() {
        return "<h1>Greetings from Spring Boot!</h1>"
		+ "<ul>"
		+ "<li><a href=doctor/1>William Haartnell</a></li>"
		+ "<li><a href=doctor/7>Tom Baker</a></li>"
		+ "<li><a href=doctor/10>David Tennant</a></li>"
		+ "<li><a href=doctor/13>Jodie Whittaker</a></li>"
		+ "</ul>";
    }
	
	@RequestMapping("/doctor/1")
    @ResponseBody
    public String william() {
        return "William Haartnell";
    }
	
	@RequestMapping("/doctor/10")
    @ResponseBody
    public String David() {
        return "David Tennant";
    }
	
	@RequestMapping("/doctor/13")
    @ResponseBody
    public String Jodie() {
        return "Jodie Whittaker";
    }
	
	@RequestMapping("/doctor/7")
    @ResponseBody
    public String Tom() {
        return "Tom Baker";
    }

}


