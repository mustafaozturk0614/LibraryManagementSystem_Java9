package com.bilgeadam.repository.entity;


import com.bilgeadam.repository.enums.EBookType;
import com.bilgeadam.repository.enums.EStatus;
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
    private EBookType bookType;
    @Builder.Default
    private EStatus status=EStatus.AVAILABLE;
    private int pageCount;
    @ManyToOne(cascade = CascadeType.ALL)
    private  Author author;

}
