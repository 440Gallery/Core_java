class EnergySystemRunner{
	public static void main(String[] args){
		SolarPanel solar=new SolarPanel(25000,PanelType.MONOCRYSTALLINE,5.0);
		EnergySystem energy=new EnergySystem("HomeSysem","tumkur","hybrid",solar);
		energy.systeminfo();
	}
}