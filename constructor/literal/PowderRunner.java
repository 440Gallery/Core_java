class PowderRunner{
	public static void main(String[] args){
		Powder powder1=new Powder("Washing", 500);
		powder1.info();
		
		PowderR powderr =new PowderR();
		powderr.PowderR(powder1);
		
		powderr.PowderR(null);
		
	}
}