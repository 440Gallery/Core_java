class LampRunner{
    public static void main(String[] args) {
        Lamp L = new Lamp();
        L.brand="Philips"; 
		L.model="LP100"; 
		L.color="White";
        L.size="20cm"; 
		L.weight="0.5kg"; 
		L.price="$10";
        L.voltage="230V"; 
		L.material="Plastic";
		L.serial="L001"; 
		L.country="India";
        System.out.println("Lamp 1: "+L.brand);
		System.out.println("Lamp 1: "+L.model);
		System.out.println("Lamp 1: "+L.color);
		System.out.println("Lamp 1: "+L.size);
		System.out.println("Lamp 1: "+L.weight);
		System.out.println("Lamp 1: "+L.price);
		System.out.println("Lamp 1: "+L.voltage);
		System.out.println("Lamp 1: "+L.material);
		System.out.println("Lamp 1: "+L.serial);
		System.out.println("Lamp 1: "+L.country);
		
	
        Lamp L2 = new Lamp();
        L2.brand="Osram"; 
		L2.model="OS55"; 
		L2.color="Yellow";
        L2.size="22cm"; 
		L2.weight="0.6kg"; 
		L2.price="$12";
        L2.voltage="230V";
		L2.material="Metal";
		L2.serial="L002"; 
		L2.country="Germany";
        System.out.println("Lamp 2: "+L2.model);
		System.out.println("Lamp 2: "+L2.brand);
		System.out.println("Lamp 2: "+L2.color);
		System.out.println("Lamp 2: "+L2.size);
		System.out.println("Lamp 2: "+L2.weight);
		System.out.println("Lamp 2: "+L2.price);
		System.out.println("Lamp 2: "+L2.voltage);
		System.out.println("Lamp 2: "+L2.material);
		System.out.println("Lamp 2: "+L2.serial);
		System.out.println("Lamp 2: "+L2.country);
    }
}