package session2;

public class StudentException extends Exception {

	
	
	
	private static final long serialVersionUID = 1L;
	public String msg;

	public StudentException(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return this.msg;
	}
}
