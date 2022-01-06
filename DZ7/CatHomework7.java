/**
* Java 1. Homework #7
*
* @author Andrey Chuprin
* @version 06.01.2022
*/

class CatHomework7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Max", 15), new Cat("Ice", 10)
        };
        Plate plate = new Plate(10, 40);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(15);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFull(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean full;
    Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
    full = false;
    }


    void setFull(boolean status) {
        full = status;
    }
    void eat(Plate plate) {
        if (!full) {
            full = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "(name- " + name +", appetite-"+
            appetite + ", full-" + full + " }";
    }
}
class Plate {
    private int food;

    Plate(int volume, int food) {
        this.food = food;
    }
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food >= food) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
    return "plate: " + food;
    }
}