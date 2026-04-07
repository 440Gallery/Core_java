class SugarCane{
    int PerTonprice;
    Region region;
    double height;
	
    SugarCane(int PerTonprice,Region region,double height){
        this.PerTonprice=PerTonprice;
        this.region=region;
        this.height=height;
    }
    void display(){
        System.out.println("................................");
		System.out.println("running sugarcane class");
        System.out.println("Price perton: "+this.PerTonprice);
        System.out.println("Region: "+this.region);
        System.out.println("Height: "+this.height);
    }
}
