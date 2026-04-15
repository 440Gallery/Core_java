class SilencerStore {
    Silencer[] silencers = new Silencer[20];
    int index = 0;

    void store(Silencer s) {
        if (s != null) {
            if (index < silencers.length) {
                silencers[index] = s;
                System.out.println("Stored silencer at index: " + index);
                index++;
            }
        } else {
            System.out.println("Silencer is null, cannot store.");
        }
    }

    void display() {
        boolean found = false;
        for (Silencer s : silencers) {
            if (s != null) {
                s.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No silencers stored.");
        }
    }
}