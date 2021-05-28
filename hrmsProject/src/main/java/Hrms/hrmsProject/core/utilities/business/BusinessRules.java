package Hrms.hrmsProject.core.utilities.business;

import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;

public class BusinessRules {
	
	public static Result run(Result... logics) {
		for (Result logic : logics)
		{
			if (!logic.isSuccess())
			{
				return logic;
			}
		}		
		return null;
	}
}
