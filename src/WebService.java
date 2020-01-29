
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
//http://localhost:8081/rest/studentJson/save?a=sina&b=18&c=971113045

/**
 * @author sina
 */
@Path("/studentJson")
public class WebService {
    @Path("/save")
    @GET
    @Produces("text/plain")
    public String save (@QueryParam("studentName") String a ,@QueryParam("grade") String b,@QueryParam("id") String c)
    {
        System.out.println("student saved");
        JSONObject student = new JSONObject();
        student.put("studentName",a);
        student.put("grade",b);
        student.put("id",c);
        return "Student name : "+a+"\n"+"grade : "+b+"\n"+"student id :"+c;
    }
}