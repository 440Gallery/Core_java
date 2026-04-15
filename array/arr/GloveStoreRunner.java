class GloveStoreRunner {
    public static void main(String[] args) {
        GloveStore gloveStore = new GloveStore();

        Glove glove1 = new Glove("Nike", "Academy GK", "Latex", "Goalkeeper", "L", "Black", false, false, "Unisex", 2500.0);
        gloveStore.store(glove1);
        Glove glove2 = new Glove("Adidas", "Predator GL", "Latex", "Goalkeeper", "M", "Red", false, false, "Male", 3000.0);
        gloveStore.store(glove2);
        Glove glove3 = new Glove("Under Armour", "Tactical", "Leather", "Tactical", "XL", "Tan", true, false, "Male", 4000.0);
        gloveStore.store(glove3);
        Glove glove4 = new Glove("The North Face", "Etip", "Fleece", "Hiking", "S", "Grey", true, true, "Female", 3500.0);
        gloveStore.store(glove4);
        Glove glove5 = new Glove("Mechanix", "Original", "TrekDry", "Work", "L", "Black", false, false, "Male", 1800.0);
        gloveStore.store(glove5);
        Glove glove6 = new Glove("Sealskinz", "Waterproof All Season", "Merino", "Cycling", "M", "Blue", true, true, "Unisex", 5000.0);
        gloveStore.store(glove6);
        Glove glove7 = new Glove("Ansell", "HyFlex 11-800", "Nylon", "Safety", "XL", "Grey", false, false, "Unisex", 900.0);
        gloveStore.store(glove7);
        Glove glove8 = new Glove("Rawlings", "Heart of the Hide", "Leather", "Baseball", "L", "Tan", false, false, "Male", 8000.0);
        gloveStore.store(glove8);
        Glove glove9 = new Glove("Everlast", "Pro Style", "Leather", "Boxing", "M", "Red", false, false, "Unisex", 3200.0);
        gloveStore.store(glove9);
        Glove glove10 = new Glove("Black Diamond", "Mercury Mitt", "Gore-Tex", "Ski", "S", "Black", true, true, "Female", 6500.0);
        gloveStore.store(glove10);
        Glove glove11 = new Glove("Puma", "Future Grip", "Latex", "Goalkeeper", "L", "Yellow", false, false, "Male", 2800.0);
        gloveStore.store(glove11);
        Glove glove12 = new Glove("Wilson", "A2000", "Leather", "Baseball", "M", "Brown", false, false, "Male", 9000.0);
        gloveStore.store(glove12);
        Glove glove13 = new Glove("Mammut", "Astro Guide", "Gore-Tex", "Mountaineering", "L", "Red", true, true, "Unisex", 7500.0);
        gloveStore.store(glove13);
        Glove glove14 = new Glove("Fox Racing", "Ranger", "Synthetic", "Cycling", "M", "Black", false, false, "Male", 2200.0);
        gloveStore.store(glove14);
        Glove glove15 = new Glove("Hestra", "Army Leather", "Leather", "Ski", "L", "Brown", true, true, "Unisex", 8500.0);
        gloveStore.store(glove15);
        Glove glove16 = new Glove("Portwest", "A140", "Latex", "Safety", "XL", "Yellow", false, false, "Unisex", 600.0);
        gloveStore.store(glove16);
        Glove glove17 = new Glove("Reusch", "Attrakt Grip", "Latex", "Goalkeeper", "M", "Blue", false, false, "Male", 3100.0);
        gloveStore.store(glove17);
        Glove glove18 = new Glove("Patagonia", "R1 Daily", "Fleece", "Hiking", "S", "Green", false, true, "Female", 4200.0);
        gloveStore.store(glove18);
        Glove glove19 = new Glove("Ringers Western", "Original", "Leather", "Work", "L", "Brown", false, false, "Male", 1500.0);
        gloveStore.store(glove19);
        Glove glove20 = new Glove("Spyder", "Conduct", "Nylon", "Ski", "M", "Black", true, true, "Male", 5500.0);
        gloveStore.store(glove20);

        gloveStore.display();
    }
}