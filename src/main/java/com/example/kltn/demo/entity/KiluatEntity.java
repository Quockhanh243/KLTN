package com.example.kltn.demo.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "kiluat", schema = "employeemanager", catalog = "")
public class KiluatEntity {
    private Integer idKl;
    private Date ngayKl;
    private Double soTien;
    private String ghiChu;
    private NhanvienEntity nhanvienByIdNv;
    private LoaikiluatEntity loaikiluatByIdHtkl;

    @Id
    @Column(name = "id_kl", nullable = false)
    public Integer getIdKl() {
        return idKl;
    }

    public void setIdKl(Integer idKl) {
        this.idKl = idKl;
    }

    @Basic
    @Column(name = "ngayKL", nullable = true)
    public Date getNgayKl() {
        return ngayKl;
    }

    public void setNgayKl(Date ngayKl) {
        this.ngayKl = ngayKl;
    }

    @Basic
    @Column(name = "soTien", nullable = true, precision = 0)
    public Double getSoTien() {
        return soTien;
    }

    public void setSoTien(Double soTien) {
        this.soTien = soTien;
    }

    @Basic
    @Column(name = "ghiChu", nullable = true, length = 250)
    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KiluatEntity that = (KiluatEntity) o;

        if (idKl != null ? !idKl.equals(that.idKl) : that.idKl != null) return false;
        if (ngayKl != null ? !ngayKl.equals(that.ngayKl) : that.ngayKl != null) return false;
        if (soTien != null ? !soTien.equals(that.soTien) : that.soTien != null) return false;
        if (ghiChu != null ? !ghiChu.equals(that.ghiChu) : that.ghiChu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idKl != null ? idKl.hashCode() : 0;
        result = 31 * result + (ngayKl != null ? ngayKl.hashCode() : 0);
        result = 31 * result + (soTien != null ? soTien.hashCode() : 0);
        result = 31 * result + (ghiChu != null ? ghiChu.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_nv", referencedColumnName = "id_nv")
    public NhanvienEntity getNhanvienByIdNv() {
        return nhanvienByIdNv;
    }

    public void setNhanvienByIdNv(NhanvienEntity nhanvienByIdNv) {
        this.nhanvienByIdNv = nhanvienByIdNv;
    }

    @ManyToOne
    @JoinColumn(name = "id_HTKL", referencedColumnName = "id", nullable = false)
    public LoaikiluatEntity getLoaikiluatByIdHtkl() {
        return loaikiluatByIdHtkl;
    }

    public void setLoaikiluatByIdHtkl(LoaikiluatEntity loaikiluatByIdHtkl) {
        this.loaikiluatByIdHtkl = loaikiluatByIdHtkl;
    }
}
