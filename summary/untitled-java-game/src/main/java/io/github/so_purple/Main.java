package io.github.so_purple;

public class Main {
    public static void main(String[] args) {
        /**
         * EntityGenerator.generate() 메서드는 EntityType 값에 따라 서로 다른 Entity를 생성한다.
         * 이 메서드는 Entity를 반환하므로, 반환된 Entity를 적절한 타입으로 캐스팅해야 한다.
         */
        // newItemEntity는 Entity 타입으로 선언하여 Entity Generator로 생성된 Entity를 받는다.
        Entity newItemEntity = EntityGenerator.generate(EntityType.Item);
        // newItemEntity를 Item 타입으로 캐스팅하여 Item 타입의 newItem으로 저장한다.
        Item newItem = (Item)newItemEntity;
        newItem.typeName = "Awesome Item";

        // Entity newItemEntity와 같이 Entity 타입 변수 선언을 생략하고 generate() 메서드의 반환값을
        // 바로 적절한 타입으로 캐스팅하여 저장할 수도 있다.
        Player player = (Player) EntityGenerator.generate(EntityType.Player);

        System.out.println(newItem.typeName);
        System.out.println(player.playerName);
    }
}
