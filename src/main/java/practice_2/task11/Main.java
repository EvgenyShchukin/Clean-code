package practice_2.task11;

public class Main {
    public static void main(String[] args) {
        DoorFacade door = new DoorFacade();

        door.openDoor();
        System.out.println("------------------------------------------------");
        door.closeDoor();
        System.out.println("------------------------------------------------");
        door.lockDoor();
    }
}
