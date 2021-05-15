package ManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Details.Employee;
import harika.DAO;

@Controller
public class Employee {

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "addEmployee";
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.POST)
	public String showDetails(ModelMap map, @ModelAttribute("model") Employee e) {

		System.out.println(e);
		DAO emp = new Employee();
		emp.insert(e);
		map.put("message", "Employee Registered Succesfully");
		return "final";

	}

}
