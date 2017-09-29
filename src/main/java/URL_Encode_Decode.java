import java.io.UnsupportedEncodingException;

public class URL_Encode_Decode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String test_object = "jdbc_url=jdbc_urlkdf\nh2=%24%7Bjdbc_url%7D\nparam2=2";
		String output_object = java.net.URLDecoder.decode(test_object, "UTF-8");

		System.out.println(output_object);

	}

}
