class Monitor{
	int price;
	String brand;
	double monitorSize;
	
	Monitor(int price,String brand,double monitorSize){
		this.price=price;
		this.brand=brand;
		this.monitorSize=monitorSize;
	}
	void display(){
		System.out.println("....................");
		System.out.println("running monitorclass");
		System.out.println("price:"+this.price);
		System.out.println("brand:"+this.brand);
		System.out.println("monitorSize:"+this.monitorSize);
	}
	
}