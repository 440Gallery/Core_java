class ComputerSetupRunner{
	public static void main(String[] args){
		Monitor monitor=new Monitor(15000,"Dell",32.0);
		ComputerSetup setup=new ComputerSetup(16,"i7","Windows 11",monitor);
		setup.checkinfo();
	}
}