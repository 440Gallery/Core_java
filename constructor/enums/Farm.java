class Farm{
    String Name;
    int acres;
    String Season;
    SugarCane sugarCane;
    Farm(String Name, int acres, String Season, SugarCane sugarCane){
        this.Name=Name;
        this.acres=acres;
        this.Season=Season;
        this.sugarCane=sugarCane;
    }
    void farminfo() {
        System.out.println("Farm Details");
        System.out.println("Farmer: " + this.Name);
        System.out.println("Acres: " + this.acres);
        System.out.println("Season: " + this.Season);
        if (sugarCane != null) {
            sugarCane.display();
        } else {
            System.out.println("invalid");
        }
    }
}
