package com.example.kltn.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "loaikiluat", schema = "employeemanager", catalog = "")
public class LoaikiluatEntity {
    private Integer id;
    private String ten;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 255)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoaikiluatEntity that = (LoaikiluatEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        return result;
    }
}
