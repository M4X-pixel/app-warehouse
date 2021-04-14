package uz.pdp.warehouse.entity.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    Category category;

    @OneToMany
    List<Attachment> attachment;

    private String code;

    @OneToOne
    Measurement measurement;

    private boolean active;
}

