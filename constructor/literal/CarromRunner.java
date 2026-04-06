class CarromRunner{
	public static void main(String[] args){
		Carrom carrom1=new Carrom("Wooden", 32);
		carrom1.info();
		
		CarromR carromr=new CarromR();
		carromr.CarromR(carrom1);
		
		carromr.CarromR(null);
		
	}
}