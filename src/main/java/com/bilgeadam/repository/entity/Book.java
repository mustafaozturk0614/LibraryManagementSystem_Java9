package com.bilgeadam.repository.entity;


import com.bilgeadam.repository.enums.EBookType;
import com.bilgeadam.repository.enums.EStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private EBookType bookType;
    @Builder.Default
    @Enumerated(EnumType.STRING)
    private EStatus status=EStatus.AVAILABLE;
    private int pageCount;
    @ManyToOne(cascade = CascadeType.ALL)
    // kendimiz bir ara tabolo olusturup ozelliklerini veriyoruz
//    @JoinTable(
//              name="yazar_kitap",
//            joinColumns = @JoinColumn(name = "kitap_id"),
//            inverseJoinColumns = @JoinColumn(name = "yazar_id")
//    )
    //otomatik olsuan ara tablodaki colon uzerinde değişiklik yapmak için
    //@JoinColumn(name = "my_author_id",referencedColumnName = "id")

    private  Author author;

}
