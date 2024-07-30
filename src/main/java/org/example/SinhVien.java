package org.example;

import java.util.ArrayList;
import java.util.List;

public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private List<KyNang> dsKyNang;

    public SinhVien(String maSinhVien, String tenSinhVien) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.dsKyNang = new ArrayList<>();
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public List<KyNang> getDsKyNang() {
        return dsKyNang;
    }

    public void themKyNang(KyNang kyNang) {
        /**
         * Duyệt qua các phần tử của dsKyNang
         * với mỗi phần tử tim phan tu co tenKyNang = kyNang.getTenKyNang()
         * neu tim thay thì lay phantu do ra
         */

        KyNang item = dsKyNang.stream()
                .filter(kn -> kn.getTenKyNang().equals(kyNang.getTenKyNang()))
                .findFirst().orElse(null);

        KyNang item2 = null;
        for (int i = 0; i < dsKyNang.size(); i++) {
            KyNang kn = dsKyNang.get(i);
            if (kn.getTenKyNang().equals(kyNang.getTenKyNang())) {
                item2 = kn;
                break;
            }
        }

        if (item!=null){
            item.setTrinhDo(kyNang.getTrinhDo());
        } else {
            dsKyNang.add(kyNang);
        }
        if (kyNang.getTrinhDo()>=5){
            CLB.getDsCLB() // Danh sach cac cau lac bo cua truong
                    .stream()
                    .forEach(clb -> {
                        // Kiem tra sinh vien co dat yeu cau tham gia CLB khong, neu dat them sinh vien vao cau lac bo
                        if (clb.ktSinhVienDatYeuCau(this)){
                            clb.themThanhVien(this);
                        }
                    });
        }
    }
}
