class DumbBells {
    double weight;        
    String material;      
    String shape;        
    String color;
    boolean isAdjustable;
    double price;        
    String brand;
    String gripType;      
    boolean isPair;       
    String usageType;    
    DumbBells(double weight,String material,String shape,String color,boolean isAdjustable,double price,String brand,String gripType,boolean isPair,String usageType) {
        System.out.println("weight: " + this.weight + " kg");
        System.out.println("material: " + this.material);
        System.out.println("shape: " + this.shape);
        System.out.println("color: " + this.color);
        System.out.println("isAdjustable: " + this.isAdjustable);
        System.out.println("price: " + this.price + " INR");
        System.out.println("brand: " + this.brand);
        System.out.println("gripType: " + this.gripType);
        System.out.println("isPair: " + this.isPair);
        System.out.println("usageType: " + this.usageType);

        this.weight = weight;
        this.material = material;
        this.shape = shape;
        this.color = color;
        this.isAdjustable = isAdjustable;
        this.price = price;
        this.brand = brand;
        this.gripType = gripType;
        this.isPair = isPair;
        this.usageType = usageType;
		System.out.println("............");
        System.out.println("weight: " + weight + " kg");
        System.out.println("material: " + material);
        System.out.println("shape: " + shape);
        System.out.println("color: " + color);
        System.out.println("isAdjustable: " + isAdjustable);
        System.out.println("price: " + price + " INR");
        System.out.println("brand: " + brand);
        System.out.println("gripType: " + gripType);
        System.out.println("isPair: " + isPair);
        System.out.println("usageType: " + usageType);
    }
}