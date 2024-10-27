
import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class CalculatorTestCase {
    // Calculator object created
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5),
                "Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testConcat() {
        assertEquals("HolaMundo", calculator.concat("Hola", "Mundo"),
                "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testConcatWithNull() {
        assertEquals("Mundo", calculator.concat("", "Mundo"),
                "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testNull() {
        assertEquals("Hola", calculator.concat("Hola", null),
                "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testNull2() {
        assertEquals("Hola", calculator.concat(null, "Hola"),
                "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testConcat2() {
        assertEquals("HolaMundo", calculator.concat2("Hola", "Mundo"),
                "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple concatenation should work")
    void testNull3() {
        assertEquals(Calculator.EMPTY, calculator.concat2("Hola", null),
                "Regular concatenation should work");
    }

    @Test
    @DisplayName("Simple summatory should work")
    void testSummatory(){
        Double uno = new Double(1);
        Double cincuenta = new Double(50);
        Double cuarenta = new Double(40);
        List<Double> numeros = Arrays.asList(uno,cincuenta,cuarenta);
        double resultado = calculator.calcularSumatorio(numeros);
        assertEquals(91, resultado,"Sumatorio should work");
    }

    @Test
    @DisplayName("Simple summatory should work")
    void testSummatory2(){
        Double uno = new Double(1);
        Double dos=new Double(2);
        List<Double> numeros = Arrays.asList(uno,dos);
        double resultado = calculator.calcularSumatorio(numeros);
        assertEquals(3, resultado,"Sumatorio should work");
    }

    @Test
    @DisplayName("Simple summatory should work")
    void testSummatory3(){
        Double uno = null;
        Double dos=new Double(2);
        List<Double> numeros = Arrays.asList(uno,dos);
        double resultado = calculator.calcularSumatorio(numeros);
        assertEquals(2, resultado,"Sumatorio should work");
    }

    @Test
    @DisplayName("Simple summatory should work")
    void testSummatory4(){
        Double nan = Double.NaN;
        Double dos=new Double(2);
        List<Double> numeros = Arrays.asList(nan,dos);
        double resultado = calculator.calcularSumatorio(numeros);
        assertEquals(2, resultado,"Sumatorio should work");
    }

}