package lk.ijse.computershop.dto.tm;

import lombok.*;

@Data
@AllArgsConstructor

public class CustomerTM {
    private String id;
    private String name;
    private String nic;
    private String email;
    private String contact;
    private String address;
}