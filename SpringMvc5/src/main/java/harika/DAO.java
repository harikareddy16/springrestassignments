package harika;

import java.util.List;

import org.springframework.stereotype.Repository;

import Details.Employee;

@Repository
public interface DAO {

	public void insert(Employee e);

	public List<Employee> getEmployees();

	Employee getEmployee(int eid);

	void update(Employee employee);

	public void delete(int eid);

	/* public boolean findUser(String username, String password); */

}
