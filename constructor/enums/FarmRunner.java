class FarmRunner{
	public static void main(String[] args){
		SugarCane sugarCane=new SugarCane(3200,Region.MANDYA,12.3);
		Farm farm=new Farm("Deva",10,"rainy season",sugarCane);
		farm.farminfo();
	}
}