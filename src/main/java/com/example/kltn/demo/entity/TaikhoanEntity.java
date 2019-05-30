package com.example.kltn.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "taikhoan", schema = "employeemanager", catalog = "")
public class TaikhoanEntity {
    private Integer id;
    private String matKhau;
    private Integer quyen;
    private String tenDangNhap;
    private String email;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mat_khau", nullable = true, length = 255)
    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Basic
    @Column(name = "quyen", nullable = true)
    public Integer getQuyen() {
        return quyen;
    }

    public void setQuyen(Integer quyen) {
        this.quyen = quyen;
    }

    @Basic
    @Column(name = "ten_dang_nhap", nullable = true, length = 255)
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 250)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaikhoanEntity that = (TaikhoanEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (matKhau != null ? !matKhau.equals(that.matKhau) : that.matKhau != null) return false;
        if (quyen != null ? !quyen.equals(that.quyen) : that.quyen != null) return false;
        if (tenDangNhap != null ? !tenDangNhap.equals(that.tenDangNhap) : that.tenDangNhap != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (matKhau != null ? matKhau.hashCode() : 0);
        result = 31 * result + (quyen != null ? quyen.hashCode() : 0);
        result = 31 * result + (tenDangNhap != null ? tenDangNhap.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
