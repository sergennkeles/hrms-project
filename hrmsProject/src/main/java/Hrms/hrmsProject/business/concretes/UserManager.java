package Hrms.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrmsProject.business.abstracts.UsersService;
import Hrms.hrmsProject.core.utilities.results.Result;
import Hrms.hrmsProject.core.utilities.results.SuccessResult;
import Hrms.hrmsProject.dataAccess.abstracts.UsersDao;
import Hrms.hrmsProject.entities.concretes.User;

@Service
public class UserManager implements UsersService {

	private UsersDao userDao;
	
	@Autowired
	public UserManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User eklendi.");
	}

}
