package Hrms.hrmsProject.business.abstracts;

import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.entities.concretes.Verification;

public interface VerificationService {

	Result add(Verification verification);
}
