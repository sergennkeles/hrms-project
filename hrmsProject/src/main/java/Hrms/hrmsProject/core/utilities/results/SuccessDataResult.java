package Hrms.hrmsProject.core.utilities.results;

public class SuccessDataResult<TEntity>  extends DataResult<TEntity>{
	
	public SuccessDataResult(TEntity data,  String message) {
		super(data, true, message);
		
	}
	
	public SuccessDataResult(TEntity data) {
		super(data, true);
		
	}
	
	public SuccessDataResult(String message) {
		super(null, true, message);
		
	}
	
	public SuccessDataResult() {
		super(null, true );
		
	}
}
