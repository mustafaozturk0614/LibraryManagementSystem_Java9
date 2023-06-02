package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String about;
    private  String address;
    @ManyToMany(cascade =CascadeType.ALL)
//    @JoinTable(
//            name = "user_address",
//            joinColumns = @JoinColumn(name = "u_i_id"),
//            inverseJoinColumns = @JoinColumn(name = "address_id")
//    )
    private List<Address> addresses;

}
