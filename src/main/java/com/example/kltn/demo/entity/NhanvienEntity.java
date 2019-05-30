package com.example.kltn.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "nhanvien", schema = "employeemanager", catalog = "")
public class NhanvienEntity {
    private Integer idNv;
    private String danToc;
    private Integer gioiTinh;
    private String hoTen;
    private Timestamp ngaySinh;
    private Timestamp ngayktthuViec;
    private Timestamp ngayVaoLam;
    private String noiCap;
    private String queQuan;
    private String sdt;
    private String socmt;
    private PhongbanEntity phongbanByIdPb;
    private TrinhdochuyenmonEntity trinhdochuyenmonByIdHv;
    private ChucvuEntity chucvuByIdCv;

    @Id
    @Column(name = "id_nv", nullable = false)
    public Integer getIdNv() {
        return idNv;
    }

    public void setIdNv(Integer idNv) {
        this.idNv = idNv;
    }

    @Basic
    @Column(name = "dan_toc", nullable = true, length = 255)
    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    @Basic
    @Column(name = "gioi_tinh", nullable = true)
    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Basic
    @Column(name = "ho_ten", nullable = true, length = 255)
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Basic
    @Column(name = "ngay_sinh", nullable = true)
    public Timestamp getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Timestamp ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Basic
    @Column(name = "ngayktthu_viec", nullable = true)
    public Timestamp getNgayktthuViec() {
        return ngayktthuViec;
    }

    public void setNgayktthuViec(Timestamp ngayktthuViec) {
        this.ngayktthuViec = ngayktthuViec;
    }

    @Basic
    @Column(name = "ngay_vao_lam", nullable = true)
    public Timestamp getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Timestamp ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    @Basic
    @Column(name = "noi_cap", nullable = true, length = 255)
    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    @Basic
    @Column(name = "que_quan", nullable = true, length = 255)
    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
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
    @Column(name = "socmt", nullable = true, length = 255)
    public String getSocmt() {
        return socmt;
    }

    public void setSocmt(String socmt) {
        this.socmt = socmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NhanvienEntity that = (NhanvienEntity) o;

        if (idNv != null ? !idNv.equals(that.idNv) : that.idNv != null) return false;
        if (danToc != null ? !danToc.equals(that.danToc) : that.danToc != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(that.gioiTinh) : that.gioiTinh != null) return false;
        if (hoTen != null ? !hoTen.equals(that.hoTen) : that.hoTen != null) return false;
        if (ngaySinh != null ? !ngaySinh.equals(that.ngaySinh) : that.ngaySinh != null) return false;
        if (ngayktthuViec != null ? !ngayktthuViec.equals(that.ngayktthuViec) : that.ngayktthuViec != null)
            return false;
        if (ngayVaoLam != null ? !ngayVaoLam.equals(that.ngayVaoLam) : that.ngayVaoLam != null) return false;
        if (noiCap != null ? !noiCap.equals(that.noiCap) : that.noiCap != null) return false;
        if (queQuan != null ? !queQuan.equals(that.queQuan) : that.queQuan != null) return false;
        if (sdt != null ? !sdt.equals(that.sdt) : that.sdt != null) return false;
        if (socmt != null ? !socmt.equals(that.socmt) : that.socmt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNv != null ? idNv.hashCode() : 0;
        result = 31 * result + (danToc != null ? danToc.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (ngaySinh != null ? ngaySinh.hashCode() : 0);
        result = 31 * result + (ngayktthuViec != null ? ngayktthuViec.hashCode() : 0);
        result = 31 * result + (ngayVaoLam != null ? ngayVaoLam.hashCode() : 0);
        result = 31 * result + (noiCap != null ? noiCap.hashCode() : 0);
        result = 31 * result + (queQuan != null ? queQuan.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        result = 31 * result + (socmt != null ? socmt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_pb", referencedColumnName = "id_pb")
    public PhongbanEntity getPhongbanByIdPb() {
        return phongbanByIdPb;
    }

    public void setPhongbanByIdPb(PhongbanEntity phongbanByIdPb) {
        this.phongbanByIdPb = phongbanByIdPb;
    }

    @ManyToOne
    @JoinColumn(name = "id_hv", referencedColumnName = "id_tdcm")
    public TrinhdochuyenmonEntity getTrinhdochuyenmonByIdHv() {
        return trinhdochuyenmonByIdHv;
    }

    public void setTrinhdochuyenmonByIdHv(TrinhdochuyenmonEntity trinhdochuyenmonByIdHv) {
        this.trinhdochuyenmonByIdHv = trinhdochuyenmonByIdHv;
    }

    @ManyToOne
    @JoinColumn(name = "id_cv", referencedColumnName = "id_cv")
    public ChucvuEntity getChucvuByIdCv() {
        return chucvuByIdCv;
    }

    public void setChucvuByIdCv(ChucvuEntity chucvuByIdCv) {
        this.chucvuByIdCv = chucvuByIdCv;
    }
}
