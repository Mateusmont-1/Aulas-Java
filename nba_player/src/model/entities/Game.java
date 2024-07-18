package model.entities;

import java.util.Date;
import java.util.List;

public class Game {
    private int id;
    private Date date;
    private List<PlayerStats> playerStatsList;

    public Game(int id, Date date, List<PlayerStats> playerStatsList) {
        this.id = id;
        this.date = date;
        this.playerStatsList = playerStatsList;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<PlayerStats> getPlayerStatsList() {
		return playerStatsList;
	}

	public void setPlayerStatsList(List<PlayerStats> playerStatsList) {
		this.playerStatsList = playerStatsList;
	}
    
}