package lists.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player("Boris", 50, 200));   // Обычный игрок
        players.add(new Player("Anton", 80, 500));   // Самый высокий уровень -> должен быть первым
        players.add(new Player("Charlie", 50, 400)); // Уровень как у Boris, но урон выше -> должен быть выше Boris
        players.add(new Player("Alex", 50, 200));    // Уровень и урон как у Boris, но имя по алфавиту выше -> перед Boris

        System.out.println("До сортировки");
        System.out.println(players);

        Collections.sort(players);

        System.out.println("После сортировки");
        System.out.println(players);
    }
}
