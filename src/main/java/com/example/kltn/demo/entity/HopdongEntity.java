package com.example.kltn.demo.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hopdong", schema = "employeemanager", catalog = "")
public class HopdongEntity {
    private Integer idHd;
    private Date ngayKi;
    private Date ngayBd;
    private Date ngayKt;
    private String soHd;
    private String loaiHd;
    private String ghiChu;
    private NhanvienEntity nhanvienByIdNv;

    @Id
    @Column(name = "id_hd", nullable = false)
    public Integer getIdHd() {
        return idHd;
    }

    public void setIdHd(Integer idHd) {
        this.idHd = idHd;
    }

    @Basic
    @Column(name = "ngayKi", nullable = true)
    public Date getNgayKi() {
        return ngayKi;
    }

    public void setNgayKi(Date ngayKi) {
        this.ngayKi = ngayKi;
    }

    @Basic
    @Column(name = "ngayBD", nullable = true)
    public Date getNgayBd() {
        return ngayBd;
    }

    public void setNgayBd(Date ngayBd) {
        this.ngayBd = ngayBd;
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
    @Column(name = "soHD", nullable = true, length = 50)
    public String getSoHd() {
        return soHd;
    }

    public void setSoHd(String soHd) {
        this.soHd = soHd;
    }

    @Basic
    @Column(name = "loaiHD", nullable = true, length = 50)
    public String getLoaiHd() {
        return loaiHd;
    }

    public void setLoaiHd(String loaiHd) {
        this.loaiHd = loaiHd;
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

        HopdongEntity that = (HopdongEntity) o;

        if (idHd != null ? !idHd.equals(that.idHd) : that.idHd != null) return false;
        if (ngayKi != null ? !ngayKi.equals(that.ngayKi) : that.ngayKi != null) return false;
        if (ngayBd != null ? !ngayBd.equals(that.ngayBd) : that.ngayBd != null) return false;
        if (ngayKt != null ? !ngayKt.equals(that.ngayKt) : that.ngayKt != null) return false;
        if (soHd != null ? !soHd.equals(that.soHd) : that.soHd != null) return false;
        if (loaiHd != null ? !loaiHd.equals(that.loaiHd) : that.loaiHd != null) return false;
        if (ghiChu != null ? !ghiChu.equals(that.ghiChu) : that.ghiChu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHd != null ? idHd.hashCode() : 0;
        result = 31 * result + (ngayKi != null ? ngayKi.hashCode() : 0);
        result = 31 * result + (ngayBd != null ? ngayBd.hashCode() : 0);
        result = 31 * result + (ngayKt != null ? ngayKt.hashCode() : 0);
        result = 31 * result + (soHd != null ? soHd.hashCode() : 0);
        result = 31 * result + (loaiHd != null ? loaiHd.hashCode() : 0);
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
}
