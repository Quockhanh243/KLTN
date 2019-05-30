package com.example.kltn.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "phongban", schema = "employeemanager", catalog = "")
public class PhongbanEntity {
    private Integer idPb;
    private String diaChi;
    private String sdt;
    private String tenPhongBan;

    @Id
    @Column(name = "id_pb", nullable = false)
    public Integer getIdPb() {
        return idPb;
    }

    public void setIdPb(Integer idPb) {
        this.idPb = idPb;
    }

    @Basic
    @Column(name = "dia_chi", nullable = true, length = 255)
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Basic
    @Column(name = "sdt", nullable = true, length = 255)
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "ten_phong_ban", nullable = true, length = 255)
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhongbanEntity that = (PhongbanEntity) o;

        if (idPb != null ? !idPb.equals(that.idPb) : that.idPb != null) return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;
        if (sdt != null ? !sdt.equals(that.sdt) : that.sdt != null) return false;
        if (tenPhongBan != null ? !tenPhongBan.equals(that.tenPhongBan) : that.tenPhongBan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPb != null ? idPb.hashCode() : 0;
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        result = 31 * result + (tenPhongBan != null ? tenPhongBan.hashCode() : 0);
        return result;
    }
}
