package org.example.dacn.entity;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Set;

@Entity
@Getter
@Setter
public class quoc_gia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int Id;
    private String ten;
    private String hinh_anh;
    @OneToMany(mappedBy = "quoc_gia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<thanh_pho> thanh_phos;
    @OneToMany(mappedBy = "quoc_gia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<san_pham> san_phams;
}
