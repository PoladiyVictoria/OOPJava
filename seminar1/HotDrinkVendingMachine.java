package seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinkList;

    public List<HotDrink> getHotDrinkList(){
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = new ArrayList<>(hotDrinkList);
    }

    public HotDrinkVendingMachine(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinkList.add(hotDrink);
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for (HotDrink hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinkList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
