package org.example;

import java.util.Date;

public class ThanhVienCLB {
    private SinhVien sinhVien;
    private Date ngayThamGia;

    public ThanhVienCLB(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
        this.ngayThamGia = new Date();
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public Date getNgayThamGia() {
        return ngayThamGia;
    }

    @Override
    public String toString() {
        return "ThanhVienCLB{" +
                "sinhVien=" + sinhVien.getTenSinhVien() +
                ", ngayThamGia=" + ngayThamGia +
                '}';
    }
}
