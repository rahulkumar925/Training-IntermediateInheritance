//Test class for Training.

public class TestTraining {

	public static void main(String[] args) {

		PublicTraining publictraining = new PublicTraining("01", "Java", 50, 5000);
		publictraining.getOrderValue();
		publictraining.display(); //Displaying the cost of public training.

		CorporateTraining corporatetraining = new CorporateTraining("02", "Big Data", 4, 35000);
		corporatetraining.getOrderValue();
		corporatetraining.display(); //Displaying the cost of corporate training.
	}

}
