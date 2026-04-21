//declare 5 instance variables 
class Hospital{
	String name;
	String location;
	int noDoctor;
	int noPatient;
	int capacity;
	}

//2 classes show this chaining 
class Hospital{
	String name;
	String location;
	int noDoctor;
	int noPatient;
	int capacity;
	
	Hospital(){
		this("City Hospital", "bengaluru", 50, 120, 200);
	}
	Hospital(String name,String location,int noDoctor,int noPatient,int capacity){
		this.name=name;
		this.location=location;
		this.noDoctor=noDoctor;
		this.noPatient=noPatient;
		this.capacity=capacity;
	}
}


