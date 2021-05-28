package Hrms.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.MernisCheckService;
import Hrms.hrmsProject.core.utilities.adapters.MernisAdapterService;

@Service
public class MernisCheckManager  {

	 MernisCheckService mernisCheckService;
	
	 @Autowired
    public MernisCheckManager() {

		mernisCheckService = new MernisAdapterService();
	}


}
