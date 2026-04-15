class SpaceShipStore {
    SpaceShip[] ships = new SpaceShip[20];
    int index = 0;

    void store(SpaceShip s) {
        if (s != null) {
            if (index < ships.length) {
                ships[index] = s;
                System.out.println("Stored spaceship at index: " + index);
                index++;
            }
        } else {
            System.out.println("SpaceShip is null, cannot store.");
        }
    }

    void display() {
        boolean found = false;
        for (SpaceShip s : ships) {
            if (s != null) { 
			s.display(); 
			found = true;
			}
        }
        if (!found) System.out.println("No spaceships stored.");
    }
}