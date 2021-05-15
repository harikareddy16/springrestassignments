package harika;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/add/{n1}/{n2}")
	public int add(@PathVariable int n1,@PathVariable int n2)
	{
		return n1+n2;	
	}
	
	@GetMapping("/multiply/{n1}/{n2}")
	public int multiply(@PathVariable int n1,@PathVariable int n2)
	{
		return n1*n2;	
	}
	
	@GetMapping("/devide/{n1}/{n2}")
	public float devide(@PathVariable int n1,@PathVariable int n2)
	{
		return n1/n2;	
	}
	
	@GetMapping("/subtract/{n1}/{n2}")
	public int subtract(@PathVariable int n1,@PathVariable int n2)
	{
		return n1-n2;	
	}
	
	@GetMapping("/sqrt/{n1}")
	public double squareRoot(@PathVariable int n1)
	{
		return Math.sqrt(n1);	
	}
	
	
}
