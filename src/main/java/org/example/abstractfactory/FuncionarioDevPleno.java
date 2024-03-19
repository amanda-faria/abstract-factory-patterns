package org.example.abstractfactory;

public class FuncionarioDevPleno implements  FuncionarioAbstrato{
    @Override
    public Salario createSalario() {
        return new SalarioDevPleno();
    }

    @Override
    public Competencia createCompetencia() {
        return new CompetenciaDevPleno();
    }
}