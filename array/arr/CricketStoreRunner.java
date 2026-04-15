class CricketStoreRunner {
    public static void main(String[] args) {
        CricketStore cricketStore = new CricketStore();

        Cricket cricket1 = new Cricket("India", "Virat Kohli", "Batsman", "Right-hand", "Right-arm Medium", 111, 8848, 4, 48.7, 15.0);
        cricketStore.store(cricket1);
        Cricket cricket2 = new Cricket("India", "Rohit Sharma", "Batsman", "Right-hand", "Right-arm Off", 151, 9205, 8, 45.4, 16.0);
        cricketStore.store(cricket2);
        Cricket cricket3 = new Cricket("Australia", "Pat Cummins", "Bowler", "Right-hand", "Right-arm Fast", 80, 890, 210, 17.5, 18.5);
        cricketStore.store(cricket3);
        Cricket cricket4 = new Cricket("England", "Ben Stokes", "All-Rounder", "Left-hand", "Right-arm Fast", 105, 6000, 195, 35.0, 14.0);
        cricketStore.store(cricket4);
        Cricket cricket5 = new Cricket("Pakistan", "Babar Azam", "Batsman", "Right-hand", "Right-arm Medium", 90, 4686, 0, 56.6, 13.0);
        cricketStore.store(cricket5);
        Cricket cricket6 = new Cricket("India", "Jasprit Bumrah", "Bowler", "Right-hand", "Right-arm Fast", 35, 100, 149, 5.5, 12.0);
        cricketStore.store(cricket6);
        Cricket cricket7 = new Cricket("West Indies", "Kieron Pollard", "All-Rounder", "Right-hand", "Right-arm Medium", 123, 3412, 58, 26.5, 7.5);
        cricketStore.store(cricket7);
        Cricket cricket8 = new Cricket("Sri Lanka", "Angelo Mathews", "All-Rounder", "Right-hand", "Right-arm Medium", 100, 5100, 85, 46.2, 6.0);
        cricketStore.store(cricket8);
        Cricket cricket9 = new Cricket("New Zealand", "Kane Williamson", "Batsman", "Right-hand", "Right-arm Off", 95, 7173, 37, 54.9, 14.5);
        cricketStore.store(cricket9);
        Cricket cricket10 = new Cricket("South Africa", "Kagiso Rabada", "Bowler", "Right-hand", "Right-arm Fast", 55, 230, 220, 8.0, 11.0);
        cricketStore.store(cricket10);
        Cricket cricket11 = new Cricket("Australia", "Steve Smith", "Batsman", "Right-hand", "Right-arm Leg", 92, 7227, 17, 61.8, 15.5);
        cricketStore.store(cricket11);
        Cricket cricket12 = new Cricket("India", "Ravindra Jadeja", "All-Rounder", "Left-hand", "Left-arm Spin", 68, 2624, 242, 36.5, 14.0);
        cricketStore.store(cricket12);
        Cricket cricket13 = new Cricket("England", "Joe Root", "Batsman", "Right-hand", "Right-arm Off", 134, 11338, 42, 50.4, 13.5);
        cricketStore.store(cricket13);
        Cricket cricket14 = new Cricket("West Indies", "Jason Holder", "All-Rounder", "Right-hand", "Right-arm Fast", 60, 2652, 147, 36.5, 6.5);
        cricketStore.store(cricket14);
        Cricket cricket15 = new Cricket("Bangladesh", "Shakib Al Hasan", "All-Rounder", "Left-hand", "Left-arm Spin", 131, 7114, 246, 37.5, 9.0);
        cricketStore.store(cricket15);
        Cricket cricket16 = new Cricket("Afghanistan", "Rashid Khan", "Bowler", "Right-hand", "Right-arm Leg", 74, 560, 301, 12.5, 10.0);
        cricketStore.store(cricket16);
        Cricket cricket17 = new Cricket("South Africa", "Quinton de Kock", "Wicketkeeper", "Left-hand", "Right-arm Medium", 78, 5433, 0, 44.5, 8.5);
        cricketStore.store(cricket17);
        Cricket cricket18 = new Cricket("New Zealand", "Trent Boult", "Bowler", "Right-hand", "Left-arm Fast", 69, 542, 185, 11.0, 9.5);
        cricketStore.store(cricket18);
        Cricket cricket19 = new Cricket("Pakistan", "Shaheen Afridi", "Bowler", "Left-hand", "Left-arm Fast", 42, 220, 170, 7.5, 11.5);
        cricketStore.store(cricket19);
        Cricket cricket20 = new Cricket("India", "MS Dhoni", "Wicketkeeper", "Right-hand", "Right-arm Medium", 90, 4876, 1, 50.6, 20.0);
        cricketStore.store(cricket20);

        cricketStore.display();
    }
}