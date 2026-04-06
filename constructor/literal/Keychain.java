class Keychain {
    String type;
    int quantity;
    
    Keychain(String type, int quantity) {
        System.out.println("running");
        this.type = type;
        this.quantity = quantity;
    }
    
    void info() {
        System.out.println("............");
        System.out.println("type:" + this.type);
        System.out.println("quantity:" + this.quantity);
    }
}