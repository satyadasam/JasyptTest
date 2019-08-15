import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
	String[] res = {"spring/beans.xml"};
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(res);
	        
			EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
	        Employee employee1 = new Employee(123, "javacodegeeks", 30);
	        employeeDAO.insert(employee1);
	        Employee employee2 = employeeDAO.findById(123);
	        System.out.println(employee2);	
			
	        JDBCEmployeeDAO jdbcEmployeeDAO = (JDBCEmployeeDAO) context.getBean("jdbcEmployeeDAO");
	        Employee employee3 = new Employee(456, "javacodegeeks", 34);
	        jdbcEmployeeDAO.insert(employee3);	 
	        Employee employee4 = jdbcEmployeeDAO.findById(456);
	        System.out.println(employee4);	
	        
			context.close();
	}
}