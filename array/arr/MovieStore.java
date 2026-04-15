class MovieStore {
    Movie[] movies = new Movie[20];
    int index = 0;

    void store(Movie m) {
        if (m != null) {
            if (index < movies.length) {
                movies[index] = m;
                System.out.println("Stored movie at index: " + index);
                index++;
            }
        } else {
            System.out.println("Movie is null, cannot store.");
        }
    }

    void display() {
        boolean found = false;
        for (Movie m : movies) {
            if (m != null) 
			{ 
			m.display(); 
			found = true;
			}
        }
        if (!found) System.out.println("No movies stored.");
    }
}