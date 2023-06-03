package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Borrow {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@ManyToOne
private User user;
@ManyToOne
private Book book;
@Builder.Default
private LocalDate  borrowDate=LocalDate.now();
@Transient
private  int period;
private  LocalDate  returnDate;

}
