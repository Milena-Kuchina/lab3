package lab3;

public class Cat extends Animal{
    public Cat(String food, String location, boolean isKnowWhereWc) {
        super(food, location);
        this.isKnowWhereWc=isKnowWhereWc;
        animalType="�����";
    }
    boolean isKnowWhereWc;
}