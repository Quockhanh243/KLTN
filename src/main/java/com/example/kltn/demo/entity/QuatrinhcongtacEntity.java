package com.example.kltn.demo.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "quatrinhcongtac", schema = "employeemanager", catalog = "")
public class QuatrinhcongtacEntity {
    private Integer idQt;
    private Date tuNgay;
    private Date denNgay;
    private Integer idCv;
    private Integer idPb;
    private Integer idCvNew;
    private Integer idPbNew;
    private Date ngayBatDau;
    private NhanvienEntity nhanvienByIdNv;

    @Id
    @Column(name = "id_qt", nullable = false)
    public Integer getIdQt() {
        return idQt;
    }

    public void setIdQt(Integer idQt) {
        this.idQt = idQt;
    }

    @Basic
    @Column(name = "tuNgay", nullable = true)
    public Date getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    @Basic
    @Column(name = "denNgay", nullable = true)
    public Date getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

    @Basic
    @Column(name = "id_cv", nullable = true)
    public Integer getIdCv() {
        return idCv;
    }

    public void setIdCv(Integer idCv) {
        this.idCv = idCv;
    }

    @Basic
    @Column(name = "id_pb", nullable = true)
    public Integer getIdPb() {
        return idPb;
    }

    public void setIdPb(Integer idPb) {
        this.idPb = idPb;
    }

    @Basic
    @Column(name = "id_cvNew", nullable = true)
    public Integer getIdCvNew() {
        return idCvNew;
    }

    public void setIdCvNew(Integer idCvNew) {
        this.idCvNew = idCvNew;
    }

    @Basic
    @Column(name = "id_pbNew", nullable = true)
    public Integer getIdPbNew() {
        return idPbNew;
    }

    public void setIdPbNew(Integer idPbNew) {
        this.idPbNew = idPbNew;
    }

    @Basic
    @Column(name = "ngayBatDau", nullable = true)
    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuatrinhcongtacEntity that = (QuatrinhcongtacEntity) o;

        if (idQt != null ? !idQt.equals(that.idQt) : that.idQt != null) return false;
        if (tuNgay != null ? !tuNgay.equals(that.tuNgay) : that.tuNgay != null) return false;
        if (denNgay != null ? !denNgay.equals(that.denNgay) : that.denNgay != null) return false;
        if (idCv != null ? !idCv.equals(that.idCv) : that.idCv != null) return false;
        if (idPb != null ? !idPb.equals(that.idPb) : that.idPb != null) return false;
        if (idCvNew != null ? !idCvNew.equals(that.idCvNew) : that.idCvNew != null) return false;
        if (idPbNew != null ? !idPbNew.equals(that.idPbNew) : that.idPbNew != null) return false;
        if (ngayBatDau != null ? !ngayBatDau.equals(that.ngayBatDau) : that.ngayBatDau != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idQt != null ? idQt.hashCode() : 0;
        result = 31 * result + (tuNgay != null ? tuNgay.hashCode() : 0);
        result = 31 * result + (denNgay != null ? denNgay.hashCode() : 0);
        result = 31 * result + (idCv != null ? idCv.hashCode() : 0);
        result = 31 * result + (idPb != null ? idPb.hashCode() : 0);
        result = 31 * result + (idCvNew != null ? idCvNew.hashCode() : 0);
        result = 31 * result + (idPbNew != null ? idPbNew.hashCode() : 0);
        result = 31 * result + (ngayBatDau != null ? ngayBatDau.hashCode() : 0);
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
