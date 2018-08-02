//Public Training inheriting Training class.
public class PublicTraining extends Training {

	int participants;
	double getOrderValue;

	PublicTraining(String id, String subject, int participants, double fees) {
		super(id, subject, fees);
		this.participants = participants;
	}

	@Override
	void getOrderValue() {
		getOrderValue = fees * participants;
	}

	void display() {
		System.out.println("The total amount for public training is: " + getOrderValue);
	}

}
