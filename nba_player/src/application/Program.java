package application;

import java.util.Arrays;
import java.util.Date;

import model.entities.Game;
import model.entities.Player;
import model.entities.PlayerStats;

public class Program {

	public static void main(String[] args) {

		Player player1 = new Player(1, "LeBron James", "kingjames", Arrays.asList("SF", "PF"));
        Player player2 = new Player(2, "Stephen Curry", "steph", Arrays.asList("PG"));

        PlayerStats stats1 = new PlayerStats(player1, 30, 10, 5, 2, 1, 3, 4, 10, 20, 5, 10);
        PlayerStats stats2 = new PlayerStats(player2, 25, 4, 7, 1, 0, 2, 3, 9, 18, 6, 12);

        Game game = new Game(1, new Date(), Arrays.asList(stats1, stats2));

        System.out.println("Game ID: " + game.getId());
        System.out.println("Game Date: " + game.getDate());
        for (PlayerStats ps : game.getPlayerStatsList()) {
            System.out.println("Player: " + ps.getPlayer().getName());
            System.out.println("Points: " + ps.getPoints());
            // Adicione outros prints conforme necessário
        }
	}

}
