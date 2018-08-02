//Parent class for Training Details.

public abstract class Training {

	String id;
	String subject;
	double fees;

	Training(String id, String subject, double fees) {
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	abstract void getOrderValue();
}
