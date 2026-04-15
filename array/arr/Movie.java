class Movie {
    String title;
    String director;
    String genre;
    String language;
    int releaseYear;
    double rating;
    int duration;
    String studio;
    boolean awarded;
    double price;

    Movie(String title, String director, String genre,String language, int releaseYear, double rating,int duration, String studio,boolean awarded, double price) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.language = language;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.studio = studio;
        this.awarded = awarded;
        this.price = price;
    }

    void display() {
        System.out.println("..................");
        System.out.println("Title ="+title);
        System.out.println("Director= " + director);
        System.out.println("Genre ="+genre);
        System.out.println("Language= " +language);
        System.out.println("Year  ="+releaseYear);
        System.out.println("Rating="+rating);
        System.out.println("Duration="+ duration);
        System.out.println("Studio="+studio);
        System.out.println("Awarded="+awarded);
        System.out.println("Price ="+price);
    }
}