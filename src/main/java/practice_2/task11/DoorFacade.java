package practice_2.task11;

public class DoorFacade {
    private DoorOperations doorOpen;
    private DoorOperations doorClose;
    private DoorOperations doorLock;

    public DoorFacade() {
        this.doorOpen = new DoorOpen();
        this.doorClose = new DoorClose();
        this.doorLock = new DoorLock();
    }

    public void openDoor() {
        doorOpen.doorOperation();
            System.out.println("Дверь открыта");
        }

    public void closeDoor() {
        doorClose.doorOperation();
        System.out.println("Дверь закрыта");
    }

    public void lockDoor() {
        doorClose.doorOperation();
        System.out.println("Дверь закрыта");
        doorLock.doorOperation();
        System.out.println("Дверь заблокирована");
    }
}
