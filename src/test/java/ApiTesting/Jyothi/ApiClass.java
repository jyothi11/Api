package ApiTesting.Jyothi;

import io.restassured.RestAssured;

public class ApiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("http://dummy.restapiexample.com/api/v1/employees")
		  .get()
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Postman-Token", "fef6ff93-8ad6-46aa-9195-e1b5ba0f823c")
		  .build();

		Response response = client.newCall(request).execute();*/
		
		RestAssured.get(""); 
	}

}
