package it.epicode.pizzeria_davide.menu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "elementi_menu")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ElementoMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false)
    private Double prezzo;

    @Column(nullable = false)
    private Integer calorie;

    public String stampaRiga() {
        return getNome() + " - Prezzo: " + getPrezzo() + " - Calorie: " + getCalorie();
    }
}
