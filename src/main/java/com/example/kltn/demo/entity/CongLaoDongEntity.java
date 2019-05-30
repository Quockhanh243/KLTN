package com.example.kltn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cong_lao_dong", schema = "employeemanager", catalog = "")
public class CongLaoDongEntity {
    private Integer idCong;

    @Id
    @Column(name = "id_cong", nullable = false)
    public Integer getIdCong() {
        return idCong;
    }

    public void setIdCong(Integer idCong) {
        this.idCong = idCong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CongLaoDongEntity that = (CongLaoDongEntity) o;

        if (idCong != null ? !idCong.equals(that.idCong) : that.idCong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idCong != null ? idCong.hashCode() : 0;
    }
}
