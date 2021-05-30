package Hrms.hrmsProject.business.abstracts;

import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.VerificationEmployee;

public interface VerificationEmployeeService {

	Result add(VerificationEmployee employee);
}
