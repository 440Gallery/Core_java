class CricketStore {
    Cricket[] players = new Cricket[20];
    int index = 0;

    void store(Cricket c) {
        if (c != null) {
            if (index < players.length) {
                players[index] = c;
                System.out.println("Stored player at index: " + index);
                index++;
            }
        } else {
            System.out.println("Cricket object is null, cannot store.");
        }
    }

    void display() {
        boolean found = false;
        for (Cricket c : players) {
            if (c != null) 
			{ 
			c.display();
			found = true; 
			}
        }
        if (!found) System.out.println("No players stored.");
    }
}