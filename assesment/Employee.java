package assesment;

public abstract class Employee extends Customer{
    private final double discount;


    public Employee(String name, Clothing[] clothingItems, char size, double discount) {
        super(name, clothingItems, size);
        this.discount = discount;
    }




    public double getDiscount() {
        return discount;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);
}

