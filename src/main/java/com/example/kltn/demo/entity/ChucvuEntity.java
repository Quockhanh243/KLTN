package com.example.kltn.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "chucvu", schema = "employeemanager", catalog = "")
public class ChucvuEntity {
    private Integer idCv;
    private String tenChucVu;

    @Id
    @Column(name = "id_cv", nullable = false)
    public Integer getIdCv() {
        return idCv;
    }

    public void setIdCv(Integer idCv) {
        this.idCv = idCv;
    }

    @Basic
    @Column(name = "ten_chuc_vu", nullable = true, length = 255)
    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChucvuEntity that = (ChucvuEntity) o;

        if (idCv != null ? !idCv.equals(that.idCv) : that.idCv != null) return false;
        if (tenChucVu != null ? !tenChucVu.equals(that.tenChucVu) : that.tenChucVu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCv != null ? idCv.hashCode() : 0;
        result = 31 * result + (tenChucVu != null ? tenChucVu.hashCode() : 0);
        return result;
    }
}
