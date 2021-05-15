package ManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Details.Employee;
import harika.DAO;

@Controller
public class Find {

	@RequestMapping(value = "/findEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "searchFirst";
	}

	@RequestMapping(value = "/findEmployee", method = RequestMethod.POST)
	public String show(@RequestParam int eid, Model model) {
		System.out.println(eid);
		DAO emp = new Employee();
		Employee myEmployee = emp.getEmployee(eid);
		model.addAttribute("employee", myEmployee);
		return "searchSecond";
	}
}