class EnergySystem{
    String Name;
    String location;
    SolarPanel solarPanel;
    String inverterType;

    EnergySystem(String Name, String location,String inverterType,SolarPanel solarPanel){
        this.Name=Name;
        this.location = location;
		this.inverterType = inverterType;
        this.solarPanel=solarPanel;
    }
    void systeminfo()
	{
        System.out.println("details");
        System.out.println("System: " + this.Name);
        System.out.println("Location: " + this.location);
		System.out.println("inverterType: " + this.inverterType);
        if (solarPanel!= null)
		{
            solarPanel.display();
        } else 
		
		{
            System.out.println("invalid");
        }
    }
}
