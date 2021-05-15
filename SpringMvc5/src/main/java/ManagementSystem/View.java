package ManagementSystem;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Details.Employee;
import harika.DAO;

@Controller
public class View {

	private DAO employeeDAO = new Employee();

	@RequestMapping(value = "/viewEmployee", method = RequestMethod.GET)
	public String showLoginPage(Model model) {
		List<Employee> emp = employeeDAO.getEmployees();
		model.addAttribute("employees", emp);
		return "viewEmployee";
	}

}
