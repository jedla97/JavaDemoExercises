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


        //Vytvořit 1 objekt FullTimeEmploye, 1 PartTimeEmploye a 1 Manager


        // vložit 1 kolo a jednu mikinu do pole goodsList


        // part-time zaměstnanec přidá položku do goodList


        // fulltime zaměstanec vypíše cenu a a odstraní všechny položky  z goodList


        // vypsat jedno zboží pomocí toString


        // změnit jméno toho zboží a znovu si to vypsat


        // vypsat kolik je daň na nějaké zboží (metoda je v abstratní tříde Good)


        // možnost si prozkoušet ještě gettery a settery


        // Vytvořit si ještě jednoho zaměstance a zavolat na oba metodu whoAmI (je jedno jaký typ zamestnance to bude)

    }
}
