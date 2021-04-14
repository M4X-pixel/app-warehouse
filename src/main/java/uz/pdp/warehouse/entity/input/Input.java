package uz.pdp.warehouse.entity.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.warehouse.entity.Currency;
import uz.pdp.warehouse.entity.Warehouse;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @ManyToOne
    Warehouse warehouse;

    @ManyToOne
    Supplier supplier;

    @ManyToOne
    Currency currency;

    private Integer factureNumber;
    private String code;

}
