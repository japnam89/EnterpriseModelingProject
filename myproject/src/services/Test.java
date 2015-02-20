package services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Model;
import model.Student;
@Path("/")
public class Test {
	/*
	static {
		Model m = Model.getModel();
		m.students.add(new Student("abc"));
		m.students.add(new Student("aashish"));
		
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/studentBybatches")
	public Response studentsBybatches(){ //@PathParam("batch")String batchName){
		//all the students whose first name starts with "a" in the batch "java"
		List<Student> result = new ArrayList<Student>();
		
		
		
		
		
		Model m = Model.getModel();
		/*for (Batches b:m.batches){
			if(b.ccode==batchName)
				for(Student s:b.students){
					if (s.sname.toString() =="abc"){
						result.add(s);
					}
				}
		}*/
		result = m.students;
		
		return Response.ok(result,"application/xml").build();
	}
}

	

