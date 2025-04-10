package it.epicode.pizzeria_davide.bevande;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BevandaRepository extends JpaRepository<Bevanda, Long> {

    Bevanda findByNome(String nome);
    boolean existsByNome(String nome);

    boolean existsByCalorieBetween(int minCalorie, int maxCalorie);

    List<Bevanda> findByCalorieGreaterThan(int calorie);
}
