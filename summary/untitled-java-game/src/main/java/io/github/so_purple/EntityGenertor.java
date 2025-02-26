package io.github.so_purple;

public class EntityGenertor {
    public static Entity generate(EntityType type) {
        switch (type) {
            case EntityType.Item:
                return new Item(
                        new Vector3(0, 0, 1),
                        "New Item"
                );
            case EntityType.Player:
                return new Player(
                        new Vector3(0, 0, 1),
                        20,
                        4,
                        "New Player"
                );
            case EntityType.Monster:
                return new Monster(
                        new Vector3(0, 0, 1),
                        15,
                        5,
                        "New Monster"
                );
        }
        throw new IllegalArgumentException();
    }
}
