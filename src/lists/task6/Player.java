package lists.task6;

public class Player implements Comparable<Player>{
    private final String name;
    private final int level;
    private final int damage;

    public Player(String name, int level, int damage) {
        this.name = name;
        this.level = level;
        this.damage = damage;
    }

    @Override
    public int compareTo(Player o) {
        if (this.level > o.level){
            return -1;
        } else if (this.level == o.level){
            if (this.damage > o.damage){
                return -1;
            } else if (this.damage < o.damage){
                return 1;
            }

            else {
                return String.CASE_INSENSITIVE_ORDER.compare(this.name, o.name);
            }
        } else {
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", damage=" + damage +
                '}';
    }
}
