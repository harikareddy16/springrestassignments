package ManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import harika.DAO;
import harika.Employee;

@Controller
public class Delete {

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String showLoginPage() {
		return "deleteFirst";
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
	public String showe(Model model, @RequestParam int eid) {
		DAO emp = new Employee();
		emp.delete(eid);
		model.addAttribute("message", "Record Deleted Successfully");
		return "final";
	}
}
