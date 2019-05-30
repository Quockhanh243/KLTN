package com.example.kltn.demo.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "khenthuong", schema = "employeemanager", catalog = "")
public class KhenthuongEntity {
    private Integer idKt;
    private Date ngayKt;
    private Double soTien;
    private String ghiChu;
    private NhanvienEntity nhanvienByIdNv;
    private LoaikhenthuongEntity loaikhenthuongByIdHtkt;

    @Id
    @Column(name = "id_kt", nullable = false)
    public Integer getIdKt() {
        return idKt;
    }

    public void setIdKt(Integer idKt) {
        this.idKt = idKt;
    }

    @Basic
    @Column(name = "ngayKT", nullable = true)
    public Date getNgayKt() {
        return ngayKt;
    }

    public void setNgayKt(Date ngayKt) {
        this.ngayKt = ngayKt;
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
    @Column(name = "ghiChu", nullable = true, length = -1)
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

        KhenthuongEntity that = (KhenthuongEntity) o;

        if (idKt != null ? !idKt.equals(that.idKt) : that.idKt != null) return false;
        if (ngayKt != null ? !ngayKt.equals(that.ngayKt) : that.ngayKt != null) return false;
        if (soTien != null ? !soTien.equals(that.soTien) : that.soTien != null) return false;
        if (ghiChu != null ? !ghiChu.equals(that.ghiChu) : that.ghiChu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idKt != null ? idKt.hashCode() : 0;
        result = 31 * result + (ngayKt != null ? ngayKt.hashCode() : 0);
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
    @JoinColumn(name = "id_HTKT", referencedColumnName = "id")
    public LoaikhenthuongEntity getLoaikhenthuongByIdHtkt() {
        return loaikhenthuongByIdHtkt;
    }

    public void setLoaikhenthuongByIdHtkt(LoaikhenthuongEntity loaikhenthuongByIdHtkt) {
        this.loaikhenthuongByIdHtkt = loaikhenthuongByIdHtkt;
    }
}
