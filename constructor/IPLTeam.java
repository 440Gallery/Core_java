class IPLTeam{
    String teamName;
    String homeGround;
    String city;
    String captain;
    String coach;
    int foundedYear;
    int trophiesWon;
    String jerseyColor;
    boolean hasOverseasPlayers;
    double teamValue; 

    IPLTeam(String teamName,String homeGround,String city,String captain,String coach,int foundedYear,int trophiesWon,String jerseyColor,boolean hasOverseasPlayers,double teamValue) {

        System.out.println("teamName: " + this.teamName);
        System.out.println("homeGround: " + this.homeGround);
        System.out.println("city: " + this.city);
        System.out.println("captain: " + this.captain);
        System.out.println("coach: " + this.coach);
        System.out.println("foundedYear: " + this.foundedYear);
        System.out.println("trophiesWon: " + this.trophiesWon);
        System.out.println("jerseyColor: " + this.jerseyColor);
        System.out.println("hasOverseasPlayers: " + this.hasOverseasPlayers);
        System.out.println("teamValue: " + this.teamValue + " crores");

        this.teamName = teamName;
        this.homeGround = homeGround;
        this.city = city;
        this.captain = captain;
        this.coach = coach;
        this.foundedYear = foundedYear;
        this.trophiesWon = trophiesWon;
        this.jerseyColor = jerseyColor;
        this.hasOverseasPlayers = hasOverseasPlayers;
        this.teamValue = teamValue;
		System.out.println("----------------");
        System.out.println("teamName: " + teamName);
        System.out.println("homeGround: " + homeGround);
        System.out.println("city: " + city);
        System.out.println("captain: " + captain);
        System.out.println("coach: " + coach);
        System.out.println("foundedYear: " + foundedYear);
        System.out.println("trophiesWon: " + trophiesWon);
        System.out.println("jerseyColor: " + jerseyColor);
        System.out.println("hasOverseasPlayers: " + hasOverseasPlayers);
        System.out.println("teamValue: " + teamValue + " crores");
    }
}