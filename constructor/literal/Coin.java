class Coin{
	
	int price;
	String type;
	
	Coin(int price,String type){
		System.out.println("running");
		this.price=price;
		this.type=type;
	}

	void info(){
		System.out.println("...................");
		System.out.println("price:"+this.price);
		System.out.println("material:"+this.type);
	}
}