package it.epicode.pizzeria_davide.common;


import it.epicode.pizzeria_davide.bevande.Bevanda;
import it.epicode.pizzeria_davide.menu.ElementoMenuRepository;
import it.epicode.pizzeria_davide.menu.MenuRepository;
import it.epicode.pizzeria_davide.pizze.Pizza;
import it.epicode.pizzeria_davide.topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommonRunner implements CommandLineRunner {

   @Autowired
   private ElementoMenuRepository elementoMenuRepository;

   @Autowired
   private MenuRepository menuRepository;

    @Override
    public void run(String... args) throws Exception {
        Topping topping = new Topping();

        topping.setNome("Mozzarella");
        topping.setPrezzo(5.0);
        topping.setCalorie(100);

        Topping topping1 = new Topping();
        topping1.setNome("Pomodoro");
        topping1.setPrezzo(3.0);
        topping1.setCalorie(50);

        Topping topping2 = new Topping();
        topping2.setNome("Peperone");
        topping2.setPrezzo(2.0);
        topping2.setCalorie(30);


        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setPrezzo(10.0);
        pizza.setCalorie(500);

        pizza.getToppings().add(topping);
        pizza.getToppings().add(topping1);


        Pizza pizza1 = new Pizza();
        pizza1.setNome("Pepperon");
        pizza1.setPrezzo(12.0);
        pizza1.setCalorie(600);

        pizza1.getToppings().add(topping);
        pizza1.getToppings().add(topping2);

        pizza1.setToppings(List.of(topping1,topping,topping2));//modo alternativo al salvataggio dei topping

        Bevanda bevanda = new Bevanda();
        bevanda.setNome("Coca Cola");
        bevanda.setPrezzo(3.0);
        bevanda.setCalorie(150);

        Bevanda bevanda1 = new Bevanda();
        bevanda1.setNome("Fanta");
        bevanda1.setPrezzo(3.0);
        bevanda1.setCalorie(150);



        elementoMenuRepository.saveAll(List.of(topping,topping2,topping1,pizza,pizza1,bevanda,bevanda1));


    }
}
