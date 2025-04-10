package it.epicode.pizzeria_davide.pizze;

import it.epicode.pizzeria_davide.menu.ElementoMenu;
import it.epicode.pizzeria_davide.topping.Topping;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity

public class Pizza extends ElementoMenu {

   @ManyToMany
   private  List<Topping> toppings= new ArrayList<>();

   public Double getPrezzo() {
      Double prezzoBase = super.getPrezzo();
      Double prezzoToppings = toppings.stream().mapToDouble(Topping::getPrezzo).sum();
      return prezzoBase + prezzoToppings;
   }
}
