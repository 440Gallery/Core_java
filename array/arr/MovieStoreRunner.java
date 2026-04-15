class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Movie movie1 = new Movie("Inception", "Christopher Nolan", "Sci-Fi", "English", 2010, 8.8, 148, "Warner Bros", true, 199.0);
        movieStore.store(movie1);
        Movie movie2 = new Movie("The Dark Knight", "Christopher Nolan", "Action", "English", 2008, 9.0, 152, "Warner Bros", true, 249.0);
        movieStore.store(movie2);
        Movie movie3 = new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", "English", 2014, 8.6, 169, "Paramount", true, 199.0);
        movieStore.store(movie3);
        Movie movie4 = new Movie("Parasite", "Bong Joon-ho", "Thriller", "Korean", 2019, 8.5, 132, "CJ ENM", true, 299.0);
        movieStore.store(movie4);
        Movie movie5 = new Movie("Avengers Endgame", "Russo Brothers", "Action", "English", 2019, 8.4, 181, "Marvel Studios", false, 349.0);
        movieStore.store(movie5);
        Movie movie6 = new Movie("RRR", "SS Rajamouli", "Action", "Telugu", 2022, 7.8, 182, "DVV Ent", true, 149.0);
        movieStore.store(movie6);
        Movie movie7 = new Movie("3 Idiots", "Rajkumar Hirani", "Comedy", "Hindi", 2009, 8.4, 170, "Vinod Chopra", true, 99.0);
        movieStore.store(movie7);
        Movie movie8 = new Movie("Dangal", "Nitesh Tiwari", "Drama", "Hindi", 2016, 8.3, 161, "UTV", true, 99.0);
        movieStore.store(movie8);
        Movie movie9 = new Movie("The Godfather", "Francis Ford Coppola", "Crime", "English", 1972, 9.2, 175, "Paramount", true, 199.0);
        movieStore.store(movie9);
        Movie movie10 = new Movie("Spirited Away", "Hayao Miyazaki", "Animation", "Japanese", 2001, 8.6, 125, "Studio Ghibli", true, 249.0);
        movieStore.store(movie10);
        Movie movie11 = new Movie("The Shawshank Redemption", "Frank Darabont", "Drama", "English", 1994, 9.3, 142, "Columbia Pictures", true, 179.0);
        movieStore.store(movie11);
        Movie movie12 = new Movie("Schindlers List", "Steven Spielberg", "History", "English", 1993, 9.0, 195, "Universal", true, 189.0);
        movieStore.store(movie12);
        Movie movie13 = new Movie("Pulp Fiction", "Quentin Tarantino", "Crime", "English", 1994, 8.9, 154, "Miramax", true, 199.0);
        movieStore.store(movie13);
        Movie movie14 = new Movie("Baahubali 2", "SS Rajamouli", "Action", "Telugu", 2017, 8.2, 167, "Arka Media", false, 129.0);
        movieStore.store(movie14);
        Movie movie15 = new Movie("PK", "Rajkumar Hirani", "Comedy", "Hindi", 2014, 8.1, 153, "Vinod Chopra", false, 89.0);
        movieStore.store(movie15);
        Movie movie16 = new Movie("Forrest Gump", "Robert Zemeckis", "Drama", "English", 1994, 8.8, 142, "Paramount", true, 179.0);
        movieStore.store(movie16);
        Movie movie17 = new Movie("Joker", "Todd Phillips", "Thriller", "English", 2019, 8.4, 122, "Warner Bros", true, 219.0);
        movieStore.store(movie17);
        Movie movie18 = new Movie("Your Name", "Makoto Shinkai", "Animation", "Japanese", 2016, 8.4, 106, "CoMix Wave", true, 229.0);
        movieStore.store(movie18);
        Movie movie19 = new Movie("Dune", "Denis Villeneuve", "Sci-Fi", "English", 2021, 8.0, 155, "Warner Bros", true, 259.0);
        movieStore.store(movie19);
        Movie movie20 = new Movie("KGF Chapter 2", "Prashanth Neel", "Action", "Kannada", 2022, 8.2, 168, "Hombale Films", false, 139.0);
        movieStore.store(movie20);

        movieStore.display();
    }
}