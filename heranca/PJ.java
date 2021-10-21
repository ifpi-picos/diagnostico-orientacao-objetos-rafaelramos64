package com.company;


import java.util.List;

public class PJ extends Nurse {
    private String cnpj;

    public PJ(String cnpj) {
        this.cnpj = cnpj;
        this.setBenefits(List.of("Vale Refeição"));
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public float getLiquidSalario() {
        return super.getLiquidSalario() - super.getLiquidSalario() * 0.05f;
    }
}
