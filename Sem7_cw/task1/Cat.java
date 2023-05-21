package Sem7_cw.task1;

public class Cat {

    // public - все
    // protected - внутри пакета + наследники
    // (default) - внутри пакета
    // private - никто за пределами класса

    private String name;
    private int satiety; // аппетит
    protected boolean hungry; // голодный кот или нет

    public Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
        hungry = true;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        hungry = !plate.decreaseFood(satiety);
    }

}
