import java.util.*;

// Comparator class
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // Sort by score descending
        if (a.score != b.score) {
            return b.score - a.score;
        }
        // If scores same, sort by name ascending
        return a.name.compareTo(b.name);
    }
}

// Player class
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// Main class
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Player[] player = new Player[n];

        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }

        scan.close();

        Arrays.sort(player, checker);

        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i].name + " " + player[i].score);
        }
    }
}
