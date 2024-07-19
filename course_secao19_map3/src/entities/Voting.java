package entities;

import java.util.Objects;

public class Voting{
	private String name;

	public Voting(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voting other = (Voting) obj;
		return Objects.equals(name, other.name);
	}
}

/*public class Voting {
	private String name;
	private Integer totalVoting;
	
	public Voting(String name, Integer totalVoting) {
		this.name = name;
		this.totalVoting = totalVoting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalVoting() {
		return totalVoting;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voting other = (Voting) obj;
		return Objects.equals(name, other.name);
	}
	
	public void addVoting(int voting) {
		totalVoting += voting;
	}
	
	public void removeVoting(int voting) {
		totalVoting -= voting;
	}
}*/
