package jedla.demo.shop;

import jedla.demo.shop.employes.FullTimeEmploye;
import jedla.demo.shop.employes.Manager;
import jedla.demo.shop.employes.PartTimeEmploye;
import jedla.demo.shop.goods.Bicycle;
import jedla.demo.shop.goods.Good;
import jedla.demo.shop.goods.Hoodie;

import java.util.ArrayList;
import java.util.List;

public class MyShop {

    public static void main(String[] args) {
        /*
         * Před implementací přečíst
         * metoda toString slouží pro převedení objektu na text, jak ho chceme vypisovat na výstup,
         * každá třída obsahuje konstruktor a gettery a settery, kdy v některých případech nebudou ani potřeba
         * Třídy jsou vrozdělieny do balíčků tak aby každý obsahoval jen věci co mají něco společného (zaměstnanci, zboží)
         *
         * Pro zaměstance by bylo vhodnější využít ještě nějaké abstraktní třídy Employe, která by obsahovala vše co mají společného,
         * ale zaměstanci slouží spíše pro ukázku jak funguje interface
         *
         * Všechny TODO budou implementovány pouze v této main metodě, nikde jinde není potřeba něco upravovat.
         */

        // vytvořit 3 objekty Bicycle, 3 Hoodie a 1 Good
        Bicycle bicycle1 = new Bicycle(10, "Kolo1", "Black");
        Bicycle bicycle2 = new Bicycle(15, "Kolo2", "Pink");
        Bicycle bicycle3 = new Bicycle(20, "Kolo3", "Black");

        Hoodie hoodie1 = new Hoodie(50, "Miku x Pusheen" , "XXL");
        Hoodie hoodie2 = new Hoodie(50, "Miku black" , "XXL");
        Hoodie hoodie3 = new Hoodie(50, "no text" , "XXL");

        //Vytvořit 1 objekt FullTimeEmploye, 1 PartTimeEmploye a 1 Manager

        FullTimeEmploye fullTimeEmploye = new FullTimeEmploye("nevim", 39, 35000);
        PartTimeEmploye partTimeEmploye = new PartTimeEmploye("nemam", 18, 20000);
        Manager manager = new Manager("Jedla", 39, 39000);

        // vložit 1 kolo a jednu mikinu do pole goodsList
        List<Good> goodList = new ArrayList<>();

        goodList.add(bicycle1);
        goodList.add(hoodie1);

        // part-time zaměstnanec přidá položku do goodList
        partTimeEmploye.addGood(bicycle2, goodList);

        // fulltime zaměstanec vypíše cenu a a odstraní všechny položky  z goodList
        System.out.println(FullTimeEmploye.askEmployeForTotalInBasket(goodList));
        List<Good> remove = new ArrayList<Good>(goodList);
        fullTimeEmploye.sellGoods(remove, goodList);
        System.out.println(goodList.size());

        // vypsat jedno zboží pomocí toString
        System.out.println(hoodie1);
        // změnit jméno toho zboží a znovu si to vypsat
        hoodie1.setName("Miku x Pusheen kawaii");
        System.out.println(hoodie1);

        // vypsat kolik je daň na nějaké zboží (metoda je v abstratní tříde Good)
        System.out.println(hoodie1.taxValue());

        // možnost si prozkoušet ještě gettery a settery

        // Vytvořit si ještě jednoho zaměstance a zavolat na oba metodu whoAmI (je jedno jaký typ zamestnance to bude)
        FullTimeEmploye fullTimeEmploye2 = new FullTimeEmploye("nevim", 39, 35000);
        fullTimeEmploye.whoAmI();
        fullTimeEmploye2.whoAmI();
        FullTimeEmploye.positon = "test";
        fullTimeEmploye.whoAmI();
        fullTimeEmploye2.whoAmI();

    }
}
