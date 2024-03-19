import org.example.abstractfactory.Funcionario;
import org.example.abstractfactory.FuncionarioAbstrato;
import org.example.abstractfactory.FuncionarioDevPleno;
import org.example.abstractfactory.FuncionarioDevSenior;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;



class FuncionarioTest {
    @Test
    void deveEmitirCompetenciaDevPleno() {
        FuncionarioAbstrato abstrato = (FuncionarioAbstrato) new FuncionarioDevPleno();
        Funcionario funcionario = new Funcionario(abstrato);
        assertEquals("Competência Dev Pleno", funcionario.emitirCompetencia());
    }

    @Test
    void deveEmitirCompetenciaDevSenior() {
        FuncionarioAbstrato abstrato = new FuncionarioDevSenior();
        Funcionario funcionario = new Funcionario(abstrato);
        assertEquals("Competência Dev Senior", funcionario.emitirCompetencia());
    }

    @Test
    void deveEmitirSalarioDevPleno() {
        FuncionarioAbstrato abstrato = new FuncionarioDevPleno();
        Funcionario funcionario = new Funcionario(abstrato);
        assertEquals("Salário Dev Pleno", funcionario.emitirSalario());
    }

    @Test
    void deveEmitirSalarioDevSenior() {
        FuncionarioAbstrato abstrato = new FuncionarioDevSenior();
        Funcionario funcionario = new Funcionario(abstrato);
        assertEquals("Salário Dev Pleno", funcionario.emitirSalario());
    }
}