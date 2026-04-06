class Carrom{
	String boardtype;
    int size;
	
	Carrom(String boardtype,int size){
		System.out.println("running");
		this.boardtype=boardtype;
		this.size=size;
	}
	void info(){
		System.out.println("..............");
		System.out.println("boardtype:"+this.boardtype);
		System.out.println("size:"+this.size);
		
	}
}