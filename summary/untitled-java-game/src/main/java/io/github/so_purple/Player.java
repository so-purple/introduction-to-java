package io.github.so_purple;

public class Player extends Mob {
    public String playerName;
    public Player(
            Vector3 position,
            int health,
            int attackDamage,
            String playerName
    ) {
        super(position, health, attackDamage);
        this.playerName = playerName;
    }
}
