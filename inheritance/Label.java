class Label extends Tag {
    String material;
	String brand;

    Label() {
        super();
		material ="paper"; 
        brand = "zudio";
    }

    Label(String material) {
        this.material = material;
		this.brand=brand;
    }
	void display(){
		System.out.println("material:"+material);
		System.out.println("brand:"+brand);
		System.out.println("label:"+label);
		System.out.println("size:"+size);
	}
}