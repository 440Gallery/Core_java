class TissueStoreRunner {
    public static void main(String[] args) {
        TissueStore tissueStore = new TissueStore();

        Tissue tissue1 = new Tissue("Kleenex", "Ultra Soft", "Virgin Pulp", "Facial", 100, 3, "Unscented", true, "Standard", 250.0);
        tissueStore.store(tissue1);
        Tissue tissue2 = new Tissue("Puffs", "Plus Lotion", "Recycled Pulp", "Facial", 124, 2, "Aloe", true, "Standard", 200.0);
        tissueStore.store(tissue2);
        Tissue tissue3 = new Tissue("Scott", "Rapid Dissolve", "Bamboo", "Bath", 200, 1, "Unscented", false, "Large", 180.0);
        tissueStore.store(tissue3);
        Tissue tissue4 = new Tissue("Viva", "Choose-A-Sheet", "Virgin Pulp", "Kitchen", 150, 2, "Fresh", false, "XL", 220.0);
        tissueStore.store(tissue4);
        Tissue tissue5 = new Tissue("Himalaya", "Soft Care", "Bamboo", "Facial", 100, 3, "Rose", true, "Standard", 150.0);
        tissueStore.store(tissue5);
        Tissue tissue6 = new Tissue("TissuesCo", "Travel Pack", "Virgin Pulp", "Pocket", 50, 2, "Mint", false, "Small", 80.0);
        tissueStore.store(tissue6);
        Tissue tissue7 = new Tissue("Bounty", "Select Size", "Recycled Pulp", "Kitchen", 120, 2, "Lemon", false, "Large", 300.0);
        tissueStore.store(tissue7);
        Tissue tissue8 = new Tissue("Kleenex", "Balsam", "Virgin Pulp", "Facial", 80, 3, "Balsam", true, "Standard", 260.0);
        tissueStore.store(tissue8);
        Tissue tissue9 = new Tissue("Puffs", "Basic", "Recycled Pulp", "Facial", 180, 1, "Unscented", false, "Standard", 140.0);
        tissueStore.store(tissue9);
        Tissue tissue10 = new Tissue("GreenSoft", "Eco Wipe", "Bamboo", "Wet", 60, 1, "Lavender", true, "Small", 190.0);
        tissueStore.store(tissue10);
        Tissue tissue11 = new Tissue("Charmin", "Ultra Strong", "Virgin Pulp", "Bath", 250, 2, "Unscented", false, "XL", 310.0);
        tissueStore.store(tissue11);
        Tissue tissue12 = new Tissue("Angel Soft", "Double Roll", "Recycled Pulp", "Bath", 200, 2, "Unscented", false, "Large", 170.0);
        tissueStore.store(tissue12);
        Tissue tissue13 = new Tissue("Cottonelle", "Flushable Wipes", "Cotton", "Wet", 42, 1, "Fresh", true, "Small", 220.0);
        tissueStore.store(tissue13);
        Tissue tissue14 = new Tissue("Marcal", "Small Steps", "Recycled Pulp", "Kitchen", 100, 2, "Unscented", false, "Standard", 130.0);
        tissueStore.store(tissue14);
        Tissue tissue15 = new Tissue("Seventh Gen", "Unbleached", "Recycled Pulp", "Bath", 240, 2, "Unscented", false, "Large", 280.0);
        tissueStore.store(tissue15);
        Tissue tissue16 = new Tissue("Kirkland", "Signature", "Virgin Pulp", "Facial", 840, 2, "Unscented", false, "XL", 500.0);
        tissueStore.store(tissue16);
        Tissue tissue17 = new Tissue("Softex", "Premium Soft", "Cotton", "Facial", 90, 3, "Jasmine", true, "Standard", 270.0);
        tissueStore.store(tissue17);
        Tissue tissue18 = new Tissue("NatureCare", "Aloe Vera", "Bamboo", "Facial", 110, 2, "Aloe", true, "Standard", 240.0);
        tissueStore.store(tissue18);
        Tissue tissue19 = new Tissue("Pristine", "Pocket Pack", "Virgin Pulp", "Pocket", 30, 2, "Mint", false, "Small", 70.0);
        tissueStore.store(tissue19);
        Tissue tissue20 = new Tissue("Tempo", "Classic White", "Virgin Pulp", "Facial", 100, 3, "Unscented", false, "Standard", 160.0);
        tissueStore.store(tissue20);

        tissueStore.display();
    }
}