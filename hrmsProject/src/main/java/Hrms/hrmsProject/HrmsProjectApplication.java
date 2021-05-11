package Hrms.hrmsProject;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HrmsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsProjectApplication.class, args);
		/*
		 * ConfigurableApplicationContext applicationContext =
		 * SpringApplication.run(HrmsProjectApplication.class, args); EmployeeDao dao =
		 * applicationContext.getBean(EmployeeDao.class);
		 */
		/*
		 * User user=new User(); user.setMail("sergen@sergenkeles.com");
		 * user.setPassword("12345"); user.setConfirm(false);
		 * 
		 * dao.save(user);
		 */

		/*
		 * Employee employee = new Employee(); Date myDate = new Date(2014, 02, 11);
		 * 
		 * employee.setFirstName("Sergen"); employee.setBirthDay(LocalDate.of(1992, 9,
		 * 2)); employee.setLastName("Keleş"); employee.setNationalityId("1234567890");
		 * employee.setMail("sergen@sergen.com"); employee.setPassword("23456");
		 * employee.setConfirm(false);
		 * 
		 * 
		 * dao.save(employee);
		 */
	}

}
