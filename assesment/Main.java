package assesment;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Clothing clothing1 = new Clothing("Blue Jeans", 20.00, 'M');
        Clothing clothing2 = new Clothing("White T Shirt", 5.00, 'S');
        Clothing clothing3 = new Clothing("Button Up Shirt", 30.00, 'L');



        Clothing [] mangerCart = {clothing1,clothing2,clothing3};
        Manager manager = new Manager("John", mangerCart,'M', 0.25);

        Clothing [] employeeCart = {clothing1,clothing2,clothing3};
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jacob", employeeCart,'L',0.10);

        // print the total of your manager's cart
        System.out.println("Manger Cart Total:");
        System.out.println(ShopApp.calcTotal(mangerCart));

        //Check if one of the clothing items fits
        System.out.println("\n Does it Fit?:");
        System.out.println(ShopApp.isAFit(hourlyEmployee , clothing1));


        //Print the hourlyEmployee's price after discounts
        System.out.println("\n Hourly Employee price after discount:");
        hourlyEmployee.printEmpPriceAfterDisc(clothing1);
        hourlyEmployee.printEmpPriceAfterDisc(clothing2);

        //Print the Managers price after discounts
        System.out.println("Manager price after discount:");
        manager.printEmpPriceAfterDisc(clothing1);
        manager.printEmpPriceAfterDisc(clothing2);

        //Create an ArrayList of clothing items, add some clothing items to the list and print each item with a for each loop
        ArrayList<Clothing> clothingArrayList = new ArrayList<>();
        clothingArrayList.add(clothing1);
        clothingArrayList.add(clothing2);
        clothingArrayList.add(clothing3);

        System.out.println("\n Items of Clothing:");

        for (Clothing peiceOfClothing : clothingArrayList) {
            System.out.println(peiceOfClothing);
        }

        //Sort and Print
        System.out.println("\n Sort And Print by Price: ");
        ShopApp.sortAndPrintClothingByPrice(clothingArrayList);



        //Invoke the printEmployeeName method on each employee object
        System.out.println("\n Employee Names:");
        ShopApp.printEmployeeName(manager);
        ShopApp.printEmployeeName(hourlyEmployee);

        //PrintDiscAMtOff
        IDiscountable [] discountable = {manager,hourlyEmployee};
        System.out.println("\n Discount Amount Off:");
        ShopApp.printDiscAmtOff(discountable,clothing1);














































    }
}
