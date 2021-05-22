package Hrms.hrmsProject.core.utilities.results;

public class ErrorDataResult<TEntity> extends DataResult<TEntity> {

	public ErrorDataResult(TEntity data,  String message) {
		super(data, false, message);
		
	}
	
	public ErrorDataResult(TEntity data) {
		super(data, false);
		
	}
	
	public ErrorDataResult(String message) {
		super(null, false, message);
		
	}
	
	public ErrorDataResult() {
		super(null, false );
		
	}
}
