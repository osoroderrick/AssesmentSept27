package assesment;

import java.util.Arrays;

public class HourlyEmployee extends Employee implements IDiscountable{


    public HourlyEmployee(String name, Clothing[] clothingItems, char size, double discount) {
        super(name, clothingItems, size, discount);
    }

    @Override
    public double getDiscount() {
        return 0.10;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double priceAfterEmpDisc = clothing.getPrice() - calcDiscount(clothing);
        System.out.println(priceAfterEmpDisc);
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        double discount = clothing.getPrice() * getDiscount();
        return discount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
