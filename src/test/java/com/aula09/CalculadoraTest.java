package com.aula09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculadoraTest {
//Anotação para dizer que é uma funçao de teste
    @Test
    public void testarsoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 2);

        //Metodo para comparar o resultado esperado com o resultado obtido
    
    assertEquals(5, resultado);
    }
    }




