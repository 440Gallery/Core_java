class SpaceShipStoreRunner {
    public static void main(String[] args) {
        SpaceShipStore spaceShipStore = new SpaceShipStore();

        SpaceShip spaceShip1 = new SpaceShip("Falcon 9", "SpaceX", "Orbital", "RP-1/LOX", 2, 9.0, 550000, 22800, true, 0.062);
        spaceShipStore.store(spaceShip1);
        SpaceShip spaceShip2 = new SpaceShip("Starship", "SpaceX", "Super Heavy", "CH4/LOX", 100, 8.0, 1000000, 100000, true, 10.0);
        spaceShipStore.store(spaceShip2);
        SpaceShip spaceShip3 = new SpaceShip("Crew Dragon", "SpaceX", "Crew Capsule", "NTO/MMH", 7, 7.5, 400000, 3307, true, 0.55);
        spaceShipStore.store(spaceShip3);
        SpaceShip spaceShip4 = new SpaceShip("SLS", "NASA", "Super Heavy", "LH2/LOX", 4, 8.5, 800000, 95000, false, 4.1);
        spaceShipStore.store(spaceShip4);
        SpaceShip spaceShip5 = new SpaceShip("Orion", "NASA", "Crew Capsule", "MMH/NTO", 6, 9.8, 450000, 100, false, 3.7);
        spaceShipStore.store(spaceShip5);
        SpaceShip spaceShip6 = new SpaceShip("New Shepard", "Blue Origin", "Suborbital", "LH2/LOX", 6, 3.7, 100000, 0, true, 0.5);
        spaceShipStore.store(spaceShip6);
        SpaceShip spaceShip7 = new SpaceShip("New Glenn", "Blue Origin", "Orbital", "LH2/LOX", 0, 8.0, 600000, 45000, true, 0.3);
        spaceShipStore.store(spaceShip7);
        SpaceShip spaceShip8 = new SpaceShip("Vulcan Centaur", "ULA", "Orbital", "LH2/LOX", 0, 9.5, 700000, 27200, false, 0.2);
        spaceShipStore.store(spaceShip8);
        SpaceShip spaceShip9 = new SpaceShip("Soyuz MS", "Roscosmos", "Crew Capsule", "N2O4/UDMH", 3, 7.9, 300000, 100, false, 0.08);
        spaceShipStore.store(spaceShip9);
        SpaceShip spaceShip10 = new SpaceShip("Ariane 6", "ArianeGroup", "Orbital", "LH2/LOX", 0, 9.2, 650000, 21650, false, 0.18);
        spaceShipStore.store(spaceShip10);
        SpaceShip spaceShip11 = new SpaceShip("Vostok", "Roscosmos", "Crew Capsule", "LOX/Kerosene", 1, 7.8, 250000, 0, false, 0.05);
        spaceShipStore.store(spaceShip11);
        SpaceShip spaceShip12 = new SpaceShip("Titan IV", "USAF", "Orbital", "N2O4/UDMH", 0, 9.0, 900000, 21680, false, 0.43);
        spaceShipStore.store(spaceShip12);
        SpaceShip spaceShip13 = new SpaceShip("H3", "JAXA", "Orbital", "LH2/LOX", 0, 8.7, 700000, 6500, false, 0.15);
        spaceShipStore.store(spaceShip13);
        SpaceShip spaceShip14 = new SpaceShip("PSLV", "ISRO", "Orbital", "HTPB/N2O4", 0, 7.5, 500000, 3800, false, 0.03);
        spaceShipStore.store(spaceShip14);
        SpaceShip spaceShip15 = new SpaceShip("GSLV Mk III", "ISRO", "Orbital", "LH2/LOX", 0, 8.2, 600000, 10000, false, 0.05);
        spaceShipStore.store(spaceShip15);
        SpaceShip spaceShip16 = new SpaceShip("Long March 5", "CNSA", "Orbital", "LH2/LOX", 0, 9.1, 750000, 25000, false, 0.07);
        spaceShipStore.store(spaceShip16);
        SpaceShip spaceShip17 = new SpaceShip("Dream Chaser", "SNC", "Spaceplane", "MMH/NTO", 7, 7.8, 500000, 5000, true, 1.2);
        spaceShipStore.store(spaceShip17);
        SpaceShip spaceShip18 = new SpaceShip("Epsilon", "JAXA", "Orbital", "HTPB", 0, 7.0, 400000, 1500, false, 0.04);
        spaceShipStore.store(spaceShip18);
        SpaceShip spaceShip19 = new SpaceShip("Vega-C", "ESA", "Orbital", "HTPB/UDMH", 0, 7.3, 450000, 2200, false, 0.06);
        spaceShipStore.store(spaceShip19);
        SpaceShip spaceShip20 = new SpaceShip("Neutron", "Rocket Lab", "Orbital", "LOX/Methane", 0, 8.4, 600000, 13000, true, 0.09);
        spaceShipStore.store(spaceShip20);

        spaceShipStore.display();
    }
}