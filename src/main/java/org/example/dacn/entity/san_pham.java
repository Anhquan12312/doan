package org.example.dacn.entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class san_pham {  // Sửa thành CamelCase
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Đổi tên thành "id" (CamelCase) theo chuẩn

    private String ten;
    private String hinh_anh;
    private float danh_gia;
    private int da_dat;
    private String vi_tri;
    private String diem_noi_bat;
    private BigDecimal gia;
    private String thong_tin;
    private String loai;

    @ManyToOne
    @JoinColumn(name = "id_thanh_pho", referencedColumnName = "id")
    private thanh_pho thanhPho;  // Tên biến thành thanhPho (số ít và CamelCase)

    @ManyToOne
    @JoinColumn(name = "id_quoc_gia", referencedColumnName = "id")
    private quoc_gia quocGia;  // Tên biến thành quocGia (số ít và CamelCase)
}
