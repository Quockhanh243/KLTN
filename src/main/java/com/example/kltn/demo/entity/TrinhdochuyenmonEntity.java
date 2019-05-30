package com.example.kltn.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "trinhdochuyenmon", schema = "employeemanager", catalog = "")
public class TrinhdochuyenmonEntity {
    private Integer idTdcm;
    private String tenHocVan;

    @Id
    @Column(name = "id_tdcm", nullable = false)
    public Integer getIdTdcm() {
        return idTdcm;
    }

    public void setIdTdcm(Integer idTdcm) {
        this.idTdcm = idTdcm;
    }

    @Basic
    @Column(name = "tenHocVan", nullable = true, length = 255)
    public String getTenHocVan() {
        return tenHocVan;
    }

    public void setTenHocVan(String tenHocVan) {
        this.tenHocVan = tenHocVan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrinhdochuyenmonEntity that = (TrinhdochuyenmonEntity) o;

        if (idTdcm != null ? !idTdcm.equals(that.idTdcm) : that.idTdcm != null) return false;
        if (tenHocVan != null ? !tenHocVan.equals(that.tenHocVan) : that.tenHocVan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTdcm != null ? idTdcm.hashCode() : 0;
        result = 31 * result + (tenHocVan != null ? tenHocVan.hashCode() : 0);
        return result;
    }
}
