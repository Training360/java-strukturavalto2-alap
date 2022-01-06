package nestedclasses.soccer;

public class TeamStatistics {

    private String teamName;
    private Games games;
    private int goalsFor;
    private int goalsAgainst;
    private int points;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.games = new Games();
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        this.games.played++;
        if (plusGoalsFor > plusGoalsAgainst) {
            this.games.won++;
        } else if (plusGoalsAgainst > plusGoalsFor) {
            this.games.lost++;
        } else {
            this.games.tied++;
        }
        this.goalsFor += plusGoalsFor;
        this.goalsAgainst += plusGoalsAgainst;
        this.points = this.games.won * 3 + this.games.tied;
    }

    @Override
    public String toString() {
        return teamName + " " + games + " " + games.won + " " + games.tied + " " + games.lost
                + " " + goalsFor + " - " + goalsAgainst + ", " + points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamStatistics that = (TeamStatistics) o;

        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return teamName.hashCode();
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return games.played;
    }

    public int getWon() {
        return games.won;
    }

    public int getTied() {
        return games.tied;
    }

    public int getLost() {
        return games.lost;
    }

    public int getGoalsfor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    public static class Games {

        private int played;
        private int won;
        private int tied;
        private int lost;
    }
}

