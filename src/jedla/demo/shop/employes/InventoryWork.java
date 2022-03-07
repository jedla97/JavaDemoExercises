package jedla.demo.shop.employes;

//import abstraktní třídy Good
import jedla.demo.shop.goods.Good;

import java.util.List;

/**
 * Každá metoda obsažená v rozhraní musí být implementována ve třídě, které toto rozhraní implementuje.
 */
public interface InventoryWork {
    public void addGood(Good inventory, List<Good> goodList);

}
