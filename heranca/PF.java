package com.company;

import java.util.List;

public class PF extends Nurse {
    private String cpf;

    public PF(String cpf) {
        this.cpf = cpf;
        this.setBenefits(List.of("Vale Alimentação", "Férias", "Aumento a cada 6 meses"));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public float getLiquidSalary() {
        return super.getLiquidSalario() - super.getLiquidSalario() * 0.1f;
    }
}
