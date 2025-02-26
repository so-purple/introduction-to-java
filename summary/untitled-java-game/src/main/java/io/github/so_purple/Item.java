package io.github.so_purple;

public class Item extends Entity {
    public String typeName;
    public Item(Vector3 position, String typeName) {
        // 부모 클래스의 생성자는 다른 값의 초기화보다 먼저 호출되어야 한다.
        super(position);
        this.typeName = typeName;
    }
}
