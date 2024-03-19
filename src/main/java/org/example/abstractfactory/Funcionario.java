package org.example.abstractfactory;

public class Funcionario {

    private Salario salario;
    private Competencia competencia;

    public Funcionario (FuncionarioAbstrato fabrica) {
        this.salario = fabrica.createSalario();
        this.competencia = fabrica.createCompetencia();
    }
    public String emitirSalario() {
        return this.salario.emitir();
    }

    public String emitirCompetencia() {
        return this.competencia.emitir();
    }
}
