/*
 * This source file was generated by the Gradle 'init' task
 */
package taller2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    
    @Test
    void t1_calcular_saldo() {
        App classUnderTest = new App();
        assertEquals(1500000, classUnderTest.Calcular_saldo(2000000, 500000, 1000000),
                "El saldo final debe ser 1500000 para una base de 2000000, recaudos de 500000 y retiros de 1000000");
        assertEquals(-1, classUnderTest.Calcular_saldo(1500000, 500000, 1000000),
                "Debe retornar -1 si la base no es 2000000");
    }

    @Test
    void t1_calcular_tip() {
        App classUnderTest = new App();
        assertEquals("valor comida: $100.0 - valor propina $10.0 - valor impoconsumo $8.0 - total a pagar $118.0",
                classUnderTest.Calcular_tip(100),
                "El resultado debe ser 'valor comida: $100.0 - valor propina $10.0 - valor impoconsumo $8.0 - total a pagar $118.0'");
        assertEquals("Error calculando consumo", classUnderTest.Calcular_tip(-50),
                "Debe retornar 'Error calculando consumo' si el valor del consumo es menor o igual a 0");
    }

    @Test
    void t1_obtener_puntos() {
        App classUnderTest = new App();
        assertEquals(10, classUnderTest.Obtener_puntos(3, 2, 1),
                "El total de puntos debe ser 10 para 3 ganados, 2 perdidos y 1 empatado");
        assertEquals(-1, classUnderTest.Obtener_puntos(-1, 2, 1),
                "Debe retornar -1 si alguno de los valores de partidos es negativo");
    }

    @Test
    void t1_calcular_definitiva() {
        App classUnderTest = new App();
        assertEquals(4.0, classUnderTest.Calcular_definitiva(4, 4, 4, 4, 4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f),
                0.0001, "La nota definitiva debe ser 4.0 con notas 4 y porcentajes 0.2");
        assertEquals(-1, classUnderTest.Calcular_definitiva(4, 4, 4, 4, 4, 0.3f, 0.3f, 0.3f, 0.1f, 0.3f),
                "Debe retornar -1 si los porcentajes no suman 1");
    }

    @Test
    void t1_calcular_para_ganar() {
        App classUnderTest = new App();
        assertEquals(3.0, classUnderTest.Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f),
                0.0001, "La nota necesaria para ganar debe ser 3.0");
        assertEquals(-1, classUnderTest.Calcular_para_ganar(3, 3, 3, 3, 0.3f, 0.3f, 0.3f, 0.1f, 0.3f),
                "Debe retornar -1 si los porcentajes no suman 1");
    }

    @Test
    void t1_calcular_salario() {
        App classUnderTest = new App();
        assertEquals(865000.0, classUnderTest.Calcular_salario(40, 10, 5, 20000),
                0.0001,
                "El salario total debe ser 40000.0 para 200 horas normales, 50 extras diurnas y 30 extras nocturnas a 150.0 por hora");
        assertEquals(-1, classUnderTest.Calcular_salario(200, 50, 30, -150.0f),
                "Debe retornar -1 si el valor de la hora normal es menor o igual a 0");
    }

    @Test
    void t1_calcular_area_triangulo() {
        App classUnderTest = new App();
        assertEquals(25.0, classUnderTest.Calcular_area_triangulo(10, 5),
                0.0001, "El área del triángulo debe ser 25.0 para base 10 y altura 5");
        assertEquals(-1, classUnderTest.Calcular_area_triangulo(-10, 5),
                "Debe retornar -1 si la base o la altura son menores o iguales a 0");
    }

    @Test
    void t1_calcular_perimetro_cuadrado() {
        App classUnderTest = new App();
        assertEquals(20.0, classUnderTest.Calcular_perimetro_cuadrado(5),
                0.0001, "El perímetro del cuadrado debe ser 20.0 para lado 5");
        assertEquals(-1, classUnderTest.Calcular_perimetro_cuadrado(-5),
                "Debe retornar -1 si el lado es menor o igual a 0");
    }

    @Test
    void t1_calcular_volumen_cilindro() {
        App classUnderTest = new App();
        assertEquals(785.3982, classUnderTest.Calcular_volumen_cilindro(5, 10),
                0.0001, "El volumen del cilindro debe ser 785.3982 para radio 5 y altura 10");
        assertEquals(-1, classUnderTest.Calcular_volumen_cilindro(5, -10),
                "Debe retornar -1 si el radio o la altura son menores o iguales a 0");
    }

    @Test
    void t1_calcular_area_circulo() {
        App classUnderTest = new App();
        assertEquals(78.5398, classUnderTest.Calcular_area_circulo(5),
                0.0001, "El área del círculo debe ser 78.5398 para radio 5");
        assertEquals(-1, classUnderTest.Calcular_area_circulo(-5),
                "Debe retornar -1 si el radio es menor o igual a 0");
    }



}
