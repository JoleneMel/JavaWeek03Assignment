import java.util.jar.Attributes.Name;

public class Application {

	public static void main(String[] args) {
		//1.)
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[] {
				3, 9, 23, 64, 2, 8, 28, 93	
		};
		
		//A.)Programmatically subtract the value of the first element in the array from the value in the last 
		//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		//B.)Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] newAges = new int[] {
				3, 9, 23, 64, 2, 8, 28, 93, 10	
		};
		
		System.out.println(newAges[newAges.length - 1] - newAges[0]);
		
		//C.)Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		int total = 0;
		
		for (int i = 0; i < ages.length; i++) {
			total += ages[i];
		} System.out.println(total / ages.length);
		//2.)
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//A.) Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sum = 0;
		for (String name : names) {
			sum += name.length();
			
		} System.out.println(sum / names.length);
		
		//B.) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result 
		//to the console.
		String space = "";
		for (String name : names) {
			space += name + " ";
		} System.out.println(space);
		
		//How do you access the last element of any array?
		System.out.println(newAges[newAges.length - 1]);
		
		//How do you access the first element of any array?
		System.out.println(newAges[0]);
		
		/*Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the 
		 * length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
			
		} 
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		//prints out line to seperate 
		System.out.println();
		for (int nameLength : nameLengths) {
			System.out.print(nameLength + " ");
		}
		
		
		/*
		Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		*/
		sum = 0;
		
		for (int nameLength : nameLengths) {
			sum += nameLength;
			
		} 
		
		System.out.println();
		System.out.println(sum);
		System.out.println("Test 1 for multipleConcatenated method, using my fluffy cats name and fave number " + ": \r\n" + multipleConcatenated("Cypher", 3));
		System.out.println("Test 2 for multipleConcatenated method, using my dramaqueen of a cat " + ": \r\n" + multipleConcatenated("Lola", 7));
		System.out.println("Test 1 for multipleConcatenated method, using my boyfriends tegu's name " + ": \r\n" + multipleConcatenated("Tiami", 8));
		System.out.println("Test 1 for createFullName using only string literals " + ": \r\n" + createFullName("Jojo", "Mel"));
		System.out.println("Test 2 for createFullName using 1 string literal and name " + ": \r\n" + createFullName(names[3], "Mel"));
		System.out.println("Test 1 for greaterThan100 using the ages array " + ": \r\n" + greaterThan100(ages));
		
		//testing out arrayAvgCompare array 
		double[] numArray = new double[] {
				2, 3, 5
		};
		
		double[] numArray2 = new double[] {
				3, 5, 6
		};
		
		System.out.println("The results areeeee: " + arrayAvgCompare(numArray, numArray2));
		//Yay w3schools rocks for showing me how to use a method within another method 
		
		//testing
		System.out.println(willBuyDrink(true, 20.50) + " ,I will buy a drink!");
		//should return true 
		System.out.println(willBuyDrink(true, 1.50) + " ,I not will buy a drink... but you can buy me one? :)");
		//should return false 

		//Tests
		musicWhileCoding(true, false, false, false);
		//videoNotes
		musicWhileCoding(false, true, false, false);
		//debugging
		musicWhileCoding(false, false, true, false);
		//feelingDumb
		musicWhileCoding(false, false, false, true);
		//burntOut
	}
	/*
	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	*/
	public static String multipleConcatenated(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		} return result;
	}
	/*
	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the 
	last name as a String separated by a space).
	*/
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		//since we have a data type it does need to return something 
		return fullName;
	}
	/*
	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	*/
	public static boolean greaterThan100(int[] numbers) {
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return (sum > 100);
	}
	/*
	Write a method that takes an array of double and returns the average of all the elements in the array.
	*/
	public static double calculateAverage(double[] array) {
			double sum = 0;
			for (double number : array) {
				sum += number;
			}
			return sum / array.length;
		}
	
	/*
	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than 
	the average of the elements in the second array.
	*/
	public static boolean arrayAvgCompare(double[] array, double[] array2) {
		if (calculateAverage(array) > calculateAverage(array2)) {
			return true;
		} else {
			return false;
		}
//w3schools helped me find out you can use methods within other methods
	}
	
	/*
	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is 
	hot outside and if moneyInPocket is greater than 10.50.
	*/
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	*/
	public static void musicWhileCoding(boolean videoNotes ,boolean debugging, boolean feelingDumb, boolean burntOut) {
		if (videoNotes) {
			System.out.println("No music yet, gotta pay attention remember to have cc on so you can pause and catch up on notes!");
		}else if (debugging) {
			System.out.println("Listen something that you can sing to, everyone knows program bugs can't resist a sirens call!");
		} else if (feelingDumb) {
			System.out.println("Listen to some sonic covers, they pump you up cause they are so happy!");
		} else {
			System.out.println("Listen to some heavy metal, maybe beartooth, bring me to the horizon, motionless in white, something to get out the rage");
		} 
	}


}