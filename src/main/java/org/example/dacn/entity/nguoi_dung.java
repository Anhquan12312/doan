package org.example.dacn.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Entity
@Getter
@Setter

public class nguoi_dung {
        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private int Id;
        private String ten;
        private String email;
        private String matkhau;
        @OneToMany(mappedBy = "nguoi_dung", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        private Set<nguoi_dung> nguoi_dungs;
    }


