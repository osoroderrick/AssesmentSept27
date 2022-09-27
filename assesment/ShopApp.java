package assesment;

import java.util.ArrayList;
import java.util.Collections;


public class ShopApp {

    public static double calcTotal(Clothing [] clothing){
        double totalPrice = 0;
        double currentPrice = 0;
        for (Clothing clothing1 : clothing) {
           currentPrice = clothing1.getPrice();
           totalPrice += currentPrice;
      }
      return totalPrice;
    }

    public static boolean isAFit(Customer customer,Clothing clothing) {
        boolean results = false;
        if (customer.getSize() == clothing.getSize()) {
            results = true;
            System.out.println("\nIt's a Fit!");
        } else if (customer.getSize() != clothing.getSize()){
            results = false;
            System.out.println("\nIt doesn't fit");
        }
        return results;
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingArrayList) {
        double result = 0;
        ArrayList<Double> clothingPricesList = new ArrayList<>();
        for (Clothing pieceOfClothing : clothingArrayList) {
          clothingPricesList.add(pieceOfClothing.getPrice());
          Collections.sort(clothingPricesList);
           for (int i = 0; i < clothingPricesList.size(); i++) {
               System.out.println(clothingPricesList.get(i) + String.valueOf(pieceOfClothing));
           }

        }
    }

    public static void printEmployeeName(Employee employee) {
        System.out.println(employee.getName());
    }

    public static void printDiscAmtOff(IDiscountable [] discountables, Clothing clothing ) {
        for(IDiscountable discountableEmp: discountables) {
            System.out.println(clothing+ "is $" + discountableEmp.calcDiscount(clothing) + " dollars off.");

        }
    }
}
