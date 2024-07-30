package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class CLB {
    private List<ThanhVienCLB> dsThanhVien = new ArrayList<>();
    private static final List<CLB> dsCLB = List.of(new CLBAmNhac(), new CLBTiengAnh());

    /**
     *
     * @return cac ky nang can co de tham gia CLB
     */
    public abstract List<String> getCacKyNang();
    public boolean ktSinhVienDatYeuCau(SinhVien sv){
        List<String> cacKyNang = getCacKyNang();
        return sv.getDsKyNang().stream()
                .filter(kn -> cacKyNang.contains(kn.getTenKyNang()) && kn.getTrinhDo() >= 5).findFirst().orElse(null)!=null;
    }

    public List<ThanhVienCLB> getDsThanhVien() {
        return dsThanhVien;
    }

    public void themThanhVien(SinhVien sv){
        ThanhVienCLB tv = new ThanhVienCLB(sv);
        dsThanhVien.add(tv);
    }

    public static List<CLB> getDsCLB() {
        return dsCLB;
    }

    @Override
    public String toString() {
        return "CLB{" +
                "dsThanhVien=" + dsThanhVien +
                '}';
    }
}
