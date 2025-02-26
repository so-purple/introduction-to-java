package io.github.so_purple;

public class Monster extends Mob{
    public String monsterType;
    public Monster(
            Vector3 position,
            int health,
            int attackDamage,
            String monsterType
    ) {
        super(position, health, attackDamage);
        this.monsterType = monsterType;
    }
}
