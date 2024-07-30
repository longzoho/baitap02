package org.example;

import java.util.List;

public class CLBTiengAnh extends CLB{
    private static final List<String> cacKyNang = List.of("Nghe", "Noi", "Doc", "Viet");
    @Override
    public List<String> getCacKyNang() {
        return cacKyNang;
    }

    @Override
    public String toString() {
        return "CLBTiengAnh{" +
                "dsThanhVien=" + getDsThanhVien() +
                '}';
    }
}
