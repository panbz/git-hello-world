package git.hello.world.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController{
	private Logger log=LoggerFactory.getLogger(TestController.class);

	 @RequestMapping("/hello")
	 public String helloHtml() {
		 return "/index";
	 }
}
