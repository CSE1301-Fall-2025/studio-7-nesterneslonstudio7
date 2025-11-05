public class HockeyPlayer {

    public String name;
    public String jerseyNumber;
    public String handed;
    public String shoots;
    public int goals;
    public int assists;
    public int gamesPlayed;

    public HockeyPlayer(String name, String jerseyNumber, String handed, String shoots, int goals, int assists,
            int gamesPlayed) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.handed = handed;
        this.shoots = shoots;
        this.goals = goals;
        this.assists = assists;
        this.gamesPlayed = gamesPlayed;

    }

    public int getPoints() {
        return this.goals + this.assists;
    }

    public void addGame(int goalsThisGame, int assistsThisGame) {
        this.goals += goalsThisGame;
        this.assists += assistsThisGame;
        this.gamesPlayed++;
    }

    public static void main(String[] args) {

        HockeyPlayer player1 = new HockeyPlayer("Derek", "9", "Left", "Left", 10, 5, 70);

        System.out.println("--- Initial Player Stats ---");
        System.out.println("Player: " + player1.name);
        System.out.println("Jersey Number: " + player1.jerseyNumber);
        System.out.println("Handed: " + player1.handed);
        System.out.println("Shoots: " + player1.shoots);
        System.out.println("Games Played: " + player1.gamesPlayed);
        System.out.println("Total Goals: " + player1.goals);
        System.out.println("Total Assists: " + player1.assists);
        System.out.println("Total Points: " + player1.getPoints());

        System.out.println("\n--- Player completes a game (scores 2 goals, 1 assist) ---");
        player1.addGame(2, 1);

        System.out.println("\n--- Updated Player Stats ---");
        System.out.println("New Games Played: " + player1.gamesPlayed);
        System.out.println("New Total Goals: " + player1.goals);
        System.out.println("New Total Assists: " + player1.assists);
        System.out.println("New Total Points: " + player1.getPoints());
    }
}