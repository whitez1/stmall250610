package stmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "MyPage_table")
@Data
public class MyPage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;

    private String customerId;
    private String itemId;
    private Integer qty;
    private String address;
    private String orderStatus;
    private String deliveryStatus;
}
