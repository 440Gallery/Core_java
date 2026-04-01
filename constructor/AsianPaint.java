class AsianPaint{
    String colorName;
    String finishType;     
    String baseType;      
    double pricePerLiter;
    int quantity;         
    String applicationArea; 
    boolean isWashable;
    boolean isEcoFriendly;
    String brand;
    int durabilityYears;

    AsianPaint(String colorName,String finishType,String baseType,double pricePerLiter,int quantity,String applicationArea,boolean isWashable,boolean isEcoFriendly,String brand,int durabilityYears) {
        System.out.println("colorName:" + this.colorName);
        System.out.println("finishType:" + this.finishType);
        System.out.println("baseType: " + this.baseType);
        System.out.println("pricePerLiter:" + this.pricePerLiter);
        System.out.println("quantity:" + this.quantity + " liters");
        System.out.println("applicationArea: " + this.applicationArea);
        System.out.println("isWashable: " + this.isWashable);
        System.out.println("isEcoFriendly: " + this.isEcoFriendly);
        System.out.println("brand: " + this.brand);
        System.out.println("durabilityYears: " + this.durabilityYears);

        this.colorName = colorName;
        this.finishType = finishType;
        this.baseType = baseType;
        this.pricePerLiter = pricePerLiter;
        this.quantity = quantity;
        this.applicationArea = applicationArea;
        this.isWashable = isWashable;
        this.isEcoFriendly = isEcoFriendly;
        this.brand = brand;
        this.durabilityYears = durabilityYears;
		System.out.println("............");
        System.out.println("colorName: " + colorName);
        System.out.println("finishType: " + finishType);
        System.out.println("baseType: " + baseType);
        System.out.println("pricePerLiter: " + pricePerLiter);
        System.out.println("quantity: " + quantity + " liters");
        System.out.println("applicationArea: " + applicationArea);
        System.out.println("isWashable: " + isWashable);
        System.out.println("isEcoFriendly: " + isEcoFriendly);
        System.out.println("brand: " + brand);
        System.out.println("durabilityYears: " + durabilityYears);
    }
}