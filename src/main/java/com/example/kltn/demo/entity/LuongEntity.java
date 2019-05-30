package com.example.kltn.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "luong", schema = "employeemanager", catalog = "")
public class LuongEntity {
    private Integer idLuong;
    private Integer soCong;
    private Double phuCap;
    private Double tong;
    private NhanvienEntity nhanvienByIdNv;

    @Id
    @Column(name = "id_luong", nullable = false)
    public Integer getIdLuong() {
        return idLuong;
    }

    public void setIdLuong(Integer idLuong) {
        this.idLuong = idLuong;
    }

    @Basic
    @Column(name = "soCong", nullable = true)
    public Integer getSoCong() {
        return soCong;
    }

    public void setSoCong(Integer soCong) {
        this.soCong = soCong;
    }

    @Basic
    @Column(name = "phuCap", nullable = true, precision = 0)
    public Double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(Double phuCap) {
        this.phuCap = phuCap;
    }

    @Basic
    @Column(name = "tong", nullable = true, precision = 0)
    public Double getTong() {
        return tong;
    }

    public void setTong(Double tong) {
        this.tong = tong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LuongEntity that = (LuongEntity) o;

        if (idLuong != null ? !idLuong.equals(that.idLuong) : that.idLuong != null) return false;
        if (soCong != null ? !soCong.equals(that.soCong) : that.soCong != null) return false;
        if (phuCap != null ? !phuCap.equals(that.phuCap) : that.phuCap != null) return false;
        if (tong != null ? !tong.equals(that.tong) : that.tong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLuong != null ? idLuong.hashCode() : 0;
        result = 31 * result + (soCong != null ? soCong.hashCode() : 0);
        result = 31 * result + (phuCap != null ? phuCap.hashCode() : 0);
        result = 31 * result + (tong != null ? tong.hashCode() : 0);
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
}
