package org.example;

import java.util.List;

public class CLBAmNhac extends CLB{
    private static final List<String> cacKyNang = List.of("Hat", "Dan Guitar", "Dan Piano", "Trong");
    @Override
    public List<String> getCacKyNang() {
        return cacKyNang;
    }

    @Override
    public String toString() {
        return "CLBAmNhac{" +
                "dsThanhVien=" + getDsThanhVien() +
                '}';
    }
}
