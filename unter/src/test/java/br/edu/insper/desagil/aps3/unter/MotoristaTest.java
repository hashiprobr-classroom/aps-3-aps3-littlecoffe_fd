package br.edu.insper.desagil.aps3.unter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MotoristaTest {

    Motorista motorista;
    Corrida corrida;

    @BeforeEach
    void setUp() {
        motorista = new Motorista("434353802", "Denis Alonso");
        corrida = new Corrida(mock(Passageiro.class));
    }

    @Test
    void control() {
        assertEquals("434353802", motorista.getCpf());
        assertEquals("Denis Alonso", motorista.getNome());
    }

    @Test
    void mudaNome() {
        motorista.setNome("Felipe Menke");
        assertEquals("Felipe Menke", motorista.getNome());
    }

    @Test
    void avalia() {
        corrida.avaliaPassageiro(3);
        assertEquals(3, corrida.getNotaP());
    }

    @Test
    void avaliaBaixo() {
        corrida.avaliaPassageiro(0);
        assertEquals(1, corrida.getNotaP());
    }

    @Test
    void avaliaAlto() {
        corrida.avaliaPassageiro(6);
        assertEquals(5, corrida.getNotaP());
    }
}