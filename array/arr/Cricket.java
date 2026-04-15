class Cricket {
    String teamName;
    String playerName;
    String role;
    String battingStyle;
    String bowlingStyle;
    int matchesPlayed;
    int runsScored;
    int wicketsTaken;
    double battingAverage;
    double price;

    Cricket(String teamName, String playerName, String role,String battingStyle, String bowlingStyle,int matchesPlayed, int runsScored, int wicketsTaken,double battingAverage, double price) {
        this.teamName = teamName;
        this.playerName = playerName;
        this.role = role;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.battingAverage = battingAverage;
        this.price = price;
    }

    void display() {
        System.out.println("..................");
        System.out.println("Team           = " + teamName);
        System.out.println("Player         = " + playerName);
        System.out.println("Role           = " + role);
        System.out.println("BattingStyle   = " + battingStyle);
        System.out.println("BowlingStyle   = " + bowlingStyle);
        System.out.println("Matches        = " + matchesPlayed);
        System.out.println("Runs           = " + runsScored);
        System.out.println("Wickets        = " + wicketsTaken);
        System.out.println("BattingAverage = " + battingAverage);
        System.out.println("Price (CR)     = " + price);
    }
}


