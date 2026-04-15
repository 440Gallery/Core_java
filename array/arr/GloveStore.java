class GloveStore {
    Glove[] gloves = new Glove[20];
    int index = 0;

    void store(Glove g) {
        if (g != null) {
            if (index < gloves.length) {
                gloves[index] = g;
                System.out.println("Stored glove at index: " + index);
                index++;
            }
        } else {
            System.out.println("Glove is null, cannot store.");
        }
    }

    void display() {
        boolean found = false;
        for (Glove g : gloves) {
            if (g != null) 
			{ 
			g.display(); 
			found = true;
			}
        }
        if (!found) System.out.println("No gloves stored.");
    }
}
