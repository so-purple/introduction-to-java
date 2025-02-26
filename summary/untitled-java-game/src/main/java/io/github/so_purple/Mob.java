package io.github.so_purple;

public class Mob extends Entity {
    public int health;
    public int attackDamage;
    public Mob(Vector3 position, int health, int attackDamage) {
        super(position);
        this.health = health;
        this.attackDamage = attackDamage;
    }
}
