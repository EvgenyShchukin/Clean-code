package practice_1.task7;

class Programmer implements Worker, Eat {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }

    @Override
    public void eat() {
        System.out.println("Программист кушает");
    }
}
