package ApiTesting.Jyothi;

import java.io.File;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class AppTest {
	
	    File file_loc = new File("C:\\Users\\apple\\eclipse-workspace\\Jyothi\\src\\test\\java\\ApiTesting\\Jyothi\\SampleData.json");
	    String uri="https://jsonplaceholder.typicode.com/posts/1";

	    @Test
	    public void Parameterization() {

	        Response resp = given().body(file_loc).with()
	                .contentType(ContentType.JSON).accept("application/json").post(uri);

	        System.out.println(resp.asString());
	        JsonPath jp = new JsonPath(resp.asString());
	        String id = jp.get("id ").toString();
	        System.out.println(id);
	  /*  Response resps = get("http://dummy.restapiexample.com/api/v1/employees");
	    int code = resps.getStatusCode();
	    System.out.println(code);
	    System.out.println(resps.getTime());
	    System.out.println(resps.asString());*/

	    }
	}
	



