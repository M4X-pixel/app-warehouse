package uz.pdp.warehouse.entity.output;

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
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @ManyToOne
    Warehouse warehouse;

    @OneToOne
    Currency currency;

    private Integer factureNumber;
    private String code;

    @ManyToOne
    Client client;



}
