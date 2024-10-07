package org.example.dacn.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class thanh_pho {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String ten;
    private String hinh_anh;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_quoc_gia")
    private quoc_gia quoc_gia;
    @OneToMany(mappedBy = "thanh_pho", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<san_pham> san_phams;
}