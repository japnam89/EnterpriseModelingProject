package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private static Model model = new Model();
	
	public List<Batches> batches= new ArrayList<Batches>();
	public List<Student> students= new ArrayList<Student>();
private Model(){}
	
	public static Model getModel() {
		
		return model;
	}
	
	//model.getModel();
	
}
