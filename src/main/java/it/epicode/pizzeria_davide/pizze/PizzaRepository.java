package it.epicode.pizzeria_davide.pizze;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    Pizza findByNome(String nome);

    boolean existsByNome(String nome);
    List<Pizza> findByCalorieBetween(int minCalorie, int maxCalorie);

    List<Pizza> findByToppings_Name(String name);
}
