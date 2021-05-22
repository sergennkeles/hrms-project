package Hrms.hrmsProject.core.utilities.results;

public class Result {
	
	private boolean success;
	private String message;
	
	public Result(boolean succces) 
	{
		this.success=succces;
	}
	
	public Result(boolean succces,String message) 
	{
		this(succces);
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
	

}
