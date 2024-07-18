package model.entities;

import java.util.List;

public class Player {
    private int id;
    private String name;
    private String username;
    private List<String> positions;

    public Player(int id, String name, String username, List<String> positions) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.positions = positions;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getPositions() {
		return positions;
	}

	public void setPositions(List<String> positions) {
		this.positions = positions;
	}

}
