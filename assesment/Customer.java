package assesment;

import java.util.Arrays;

public abstract class Customer extends Person {

  private Clothing [] clothingItems;
  private char size;


    public Customer(String name, Clothing[] clothingItems, char size) {
        super(name);
        this.clothingItems = clothingItems;
        this.size = size;
    }




    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
