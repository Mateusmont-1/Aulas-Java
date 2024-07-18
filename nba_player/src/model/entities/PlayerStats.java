package model.entities;

public class PlayerStats {
    private Player player;
    private int points;
    private int rebounds;
    private int assists;
    private int steals;
    private int blocks;
    private int fouls;
    private int turnovers;
    private int fieldGoalsMade;
    private int fieldGoalsAttempted;
    private int threePointsMade;
    private int threePointsAttempted;

    public PlayerStats(Player player, int points, int rebounds, int assists, int steals, int blocks, int fouls, int turnovers, int fieldGoalsMade, int fieldGoalsAttempted, int threePointsMade, int threePointsAttempted) {
        this.player = player;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.fouls = fouls;
        this.turnovers = turnovers;
        this.fieldGoalsMade = fieldGoalsMade;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.threePointsMade = threePointsMade;
        this.threePointsAttempted = threePointsAttempted;
    }

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getRebounds() {
		return rebounds;
	}

	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getSteals() {
		return steals;
	}

	public void setSteals(int steals) {
		this.steals = steals;
	}

	public int getBlocks() {
		return blocks;
	}

	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}

	public int getFouls() {
		return fouls;
	}

	public void setFouls(int fouls) {
		this.fouls = fouls;
	}

	public int getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(int turnovers) {
		this.turnovers = turnovers;
	}

	public int getFieldGoalsMade() {
		return fieldGoalsMade;
	}

	public void setFieldGoalsMade(int fieldGoalsMade) {
		this.fieldGoalsMade = fieldGoalsMade;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}

	public int getThreePointsMade() {
		return threePointsMade;
	}

	public void setThreePointsMade(int threePointsMade) {
		this.threePointsMade = threePointsMade;
	}

	public int getThreePointsAttempted() {
		return threePointsAttempted;
	}

	public void setThreePointsAttempted(int threePointsAttempted) {
		this.threePointsAttempted = threePointsAttempted;
	}

    
}