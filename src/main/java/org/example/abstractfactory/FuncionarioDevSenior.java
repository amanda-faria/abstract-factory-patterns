package org.example.abstractfactory;

public class FuncionarioDevSenior implements  FuncionarioAbstrato{
    @Override
    public Salario createSalario() {
        return new SalarioDevSenior();
    }

    @Override
    public Competencia createCompetencia() {
        return new CompetenciaDevSenior();
    }
}
