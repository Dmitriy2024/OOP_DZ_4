import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();
    private float fruct;
    private float otherBox;


    public Box(ArrayList<T> fruits, float fruct, float otherBox) {
        this.fruits = fruits;
        this.fruct = fruct;
        this.otherBox = otherBox;
    }


    public Box() {

    }

    public float getWeight() {
        if (fruits.size() == 0) {
            return 0.0f;
        }

        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) {
            return; //
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

}

