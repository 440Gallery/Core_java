class CountryStoreRunner{
	public static void main(String[] args) {
		Collector collector=new Collector("Ravi",101);
		
		District district=new District("Tumkur",collector);
		District district1=new District("bengaluru",collector);
		District[] districts={district};
		
		City city =new City("Tumkur",2,districts);
		
		State s1=new State("Karnataka",10000000L,city);
		State s2=new State("goa",10000000L,city);
		State s3=new State("kerala",10000000L,city);
		State[] state={s1,s2,s3};
		
		Address address=new Address("12A",572137,s1);
		President president=new President("virat",30,address);
		
		Country country =new Country("india",president,state);
		Country country1 =new Country("usa",president,state);
		Country country2 =new Country("america",president,state);
		Country country3 =new Country("country3",president,state);
		Country country4 =new Country("country4",president,state);
		Country country5 =new Country("country5",president,state);
		Country country6 =new Country("country6",president,state);
		Country country7 =new Country("country7",president,state);
		Country country8 =new Country("country8",president,state);
		Country country9=new Country("country9",president,state);
		Country country10=new Country("country10",president,state);
		Country[] countrys={country,country1,country3,country4,country5,country6,country7,country8,country9,country10};
		/*for(Country c : countrys) {
			c.countryDisplay();
			}
		*/
		CountryStore store=new CountryStore();
		store.save(country);
		store.save(country1);
		store.save(country2);
		store.save(country3);
		store.save(country4);
		store.save(country5);
		store.save(country6);
		store.save(country7);
		store.save(country8);
		store.save(country9);
		store.save(country10);
		
		store.findByName("america");
		store.findByName("country10");
		store.findStateByStateName("Karnataka");
	}
}