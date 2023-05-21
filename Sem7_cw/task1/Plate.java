package Sem7_cw.task1;


public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food -= foodToDecrease;
            return true;
        } else {
            food = 0;
            return false;
        }
    }

}
