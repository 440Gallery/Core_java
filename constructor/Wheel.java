class Wheel{
    int diameter;
    int width;
    String material;
    String type; 
    String color;
    boolean isTubeless;
    boolean isAlloy;
    double price;

    Wheel(int diameter,int width,String material,String type,String color,boolean isTubeless,boolean isAlloy,double price) {
        System.out.println("diameter: " + this.diameter);
        System.out.println("width: " + this.width);
        System.out.println("material: " + this.material);
        System.out.println("type: " + this.type);
        System.out.println("color: " + this.color);
        System.out.println("isTubeless: " + this.isTubeless);
        System.out.println("isAlloy: " + this.isAlloy);
        System.out.println("price: " + this.price);

        this.diameter = diameter;
        this.width = width;
        this.material = material;
        this.type = type;
        this.color = color;
        this.isTubeless = isTubeless;
        this.isAlloy = isAlloy;
        this.price = price;
		System.out.println("............");
        System.out.println("diameter: " + diameter);
        System.out.println("width: " + width);
        System.out.println("material: " + material);
        System.out.println("type: " + type);
        System.out.println("color: " + color);
        System.out.println("isTubeless: " + isTubeless);
        System.out.println("isAlloy: " + isAlloy);
        System.out.println("price: " + price);
    }
}