package labs;

public class Lab1 {

	public static void main(String[] args) {
		
		int seatsOnPlane = 67;
		System.out.println(seatsOnPlane);
		
		double groceriesAtCheckOut = 99.86;
		System.out.println(groceriesAtCheckOut);
		
		char middleInitial = 'L';
		System.out.println(middleInitial);
		
		boolean isHotOutside = false;
		System.out.println(isHotOutside);
		
		String firstName = "Ben";
		System.out.println(firstName);
		
		String streetAddress = "101 Shetland Ct SE";
		System.out.println(streetAddress);
		
		seatsOnPlane = seatsOnPlane - 2;
		System.out.println(seatsOnPlane);
		
		groceriesAtCheckOut = groceriesAtCheckOut + 2.15;
		System.out.println(groceriesAtCheckOut);
		
		middleInitial = 'M';
		System.out.println(middleInitial);
		
		isHotOutside = true;
		System.out.println(isHotOutside);
		
		String fullName = "Amber" + " " + middleInitial + " " + "Brown";
		System.out.println(fullName);
		
		System.out.println("Please welcome " + fullName + "; she lives at: " + streetAddress + ".");
		
		
	}

}
