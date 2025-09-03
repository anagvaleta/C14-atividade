
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculadoraTeste {

    private final Calculator calc = new Calculator();

    // ---- Testes Positivos (10) ----
    @Test void deveSomarDoisNumeros() { assertEquals(5, calc.somar(2, 3)); }
    @Test void deveSubtrairDoisNumeros() { assertEquals(1, calc.subtrair(3, 2)); }
    @Test void deveMultiplicarDoisNumeros() { assertEquals(6, calc.multiplicar(2, 3)); }
    @Test void deveDividirDoisNumeros() { assertEquals(2, calc.dividir(6, 3)); }
    @Test void deveSomarComZero() { assertEquals(4, calc.somar(4, 0)); }
    @Test void deveSubtrairComZero() { assertEquals(4, calc.subtrair(4, 0)); }
    @Test void deveMultiplicarPorZero() { assertEquals(0, calc.multiplicar(10, 0)); }
    @Test void deveDividirNumeroPorUm() { assertEquals(10, calc.dividir(10, 1)); }
    @Test void deveSomarNegativos() { assertEquals(-5, calc.somar(-2, -3)); }
    @Test void deveSubtrairNegativos() { assertEquals(1, calc.subtrair(-2, -3)); }

    // ---- Testes Negativos (10) ----
    @Test void naoDeveSomarErrado() { assertNotEquals(10, calc.somar(2, 3)); }
    @Test void naoDeveSubtrairErrado() { assertNotEquals(5, calc.subtrair(3, 2)); }
    @Test void naoDeveMultiplicarErrado() { assertNotEquals(5, calc.multiplicar(2, 3)); }
    @Test void naoDeveDividirErrado() { assertNotEquals(3, calc.dividir(6, 3)); }
    @Test void deveLancarExcecaoNaDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
    @Test void somaNaoPodeSerZeroAqui() { assertNotEquals(0, calc.somar(2, 3)); }
    @Test void subtracaoNaoPodeSerZeroAqui() { assertNotEquals(0, calc.subtrair(5, 3)); }
    @Test void multiplicacaoNaoPodeSerZeroAqui() { assertNotEquals(0, calc.multiplicar(2, 3)); }
    @Test void divisaoNaoPodeSerZeroAqui() { assertNotEquals(0, calc.dividir(6, 3)); }
    @Test void naoPodeDarResultadoInesperado() { assertNotEquals(100, calc.somar(40, 50)); }

}
