package Hrms.hrmsProject.core.utilities.results;

public class DataResult<TEntity> extends Result {

	private TEntity data;
	public DataResult(TEntity data, boolean succces, String message) {
		super( succces, message);
		this.data=data;
	}
	
	public DataResult(TEntity data, boolean succces) {
		super(succces);
		this.data=data;
	}
	
	public TEntity getData() {
		return this.data;
	}
}
