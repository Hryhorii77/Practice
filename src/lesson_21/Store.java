package lesson_21;

import java.util.ArrayList;
import java.util.List;

public class Store {
   private List<Seller> sellers = new ArrayList<>();
   public void addSeller(Seller s1){
       sellers.add(s1);
   }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }
}
