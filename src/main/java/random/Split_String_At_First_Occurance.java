package random;

public class Split_String_At_First_Occurance {

	public static void main(String[] args) {

		String test_object = "jdbc:host:8080";
		String[] output_objects = test_object.split(":", 2);

		for (String output_object : output_objects)
			System.out.println(output_object);
	}

}
