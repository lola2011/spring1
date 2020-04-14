package kg.itacademy.firstapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="food")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",nullable=false)
    private String name;
    @Column(name="cuisine",nullable = false)
    private String cuisine;
    @Column(name="price",nullable = false)
    private Integer price;
}
