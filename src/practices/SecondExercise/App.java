package practices.SecondExercise;

public class App {

    public static void main(String[] args) {

        Match match = new Match();

        match.homeTeam = "Liverpool";
        match.homeTeamScore = 2;
        match.awayTeam = "Leicester";
        match.awayTeamScore = 1;
        match.isMatchCompleted = true;

        System.out.println("Home Team: " + match.homeTeam);
        System.out.println("Home Team Score: " + match.homeTeamScore);
        System.out.println("Away Team: " + match.awayTeam);
        System.out.println("Away Team Score: " + match.awayTeamScore);
        System.out.println("Match complete: " + match.isMatchCompleted);
    }
}
