package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("Going to complex page....");
		return "complex_form";
	}

	
	  @RequestMapping(path="/handleform", method = RequestMethod.POST) 
	  public String formHandler(@ModelAttribute("student") Student student) {
	      System.out.println(student); 
	      return "success"; 
	  }
	 

	/*
	 * @RequestMapping(path="/handleform", method = RequestMethod.POST) public
	 * String formHandler(@RequestParam("name") String name, @RequestParam("id")
	 * Long id) { System.out.println("name: "+ name); System.out.println("id: "+id);
	 * return "success"; }
	 */

}
