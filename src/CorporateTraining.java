
//Corporate Training inheriting Training class.

public class CorporateTraining extends Training {

	int days;
	double getOrderValue;

	CorporateTraining(String id, String subject, int days, double fees) {
		super(id, subject, fees);
		this.days = days;
	}

	@Override
	void getOrderValue() {
		getOrderValue = fees * days;
	}

	void display() {
		System.out.println("The total amount for corporate training is: " + getOrderValue);
	}
}
