package org.example.dacn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class comment {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int Id;
    private String ten;
    private LocalDateTime thoi_gian;
    private float danh_gia;
    private String noi_dung;
}
