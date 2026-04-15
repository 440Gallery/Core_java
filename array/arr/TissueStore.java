class TissueStore {
    Tissue[] tissues = new Tissue[20];
    int index = 0;

    void store(Tissue t) {
        if (t != null) {
            if (index < tissues.length) {
                tissues[index] = t;
                System.out.println("Stored tissue at index: " + index);
                index++;
            }
        } else {
            System.out.println("Tissue is null, cannot store.");
        }
    }

    void display() {
        boolean found = false;
        for (Tissue t : tissues) {
            if (t != null) 
			{ 
			t.display(); 
			found = true; 
			}
        }
        if (!found) System.out.println("No tissues stored.");
    }
}