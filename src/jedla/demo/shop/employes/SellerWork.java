package jedla.demo.shop.employes;

import jedla.demo.shop.goods.Good;

import java.util.List;

/**
 * Každá metoda obsažená v rozhraní musí být implementována ve třídě, které toto rozhraní implementuje.
 */
public interface SellerWork {
    public void sellGoods(List<Good> sellList, List<Good> goodList);
}
