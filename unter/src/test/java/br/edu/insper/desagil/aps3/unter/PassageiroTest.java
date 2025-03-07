package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    Passageiro passageiro;
    Corrida corrida;

    @BeforeEach
    void setUp() {
        passageiro = new Passageiro("1234567", "Rafael");
        corrida = new Corrida(passageiro);
    }

    @Test
    void constroi() {
        assertEquals("1234567", passageiro.getCpf());
        assertEquals("Rafael", passageiro.getNome());
    }

    @Test
    void mudaNome() {
        passageiro.setNome("Menkola");
        assertEquals("Menkola", passageiro.getNome());
    }

    @Test
    void avalia() {
        corrida.avaliaMotorista(3);
        assertEquals(3, corrida.getNotaM());
    }

    @Test
    void avaliaBaixo() {
        corrida.avaliaMotorista(0);
        assertEquals(1, corrida.getNotaM());
    }

    @Test
    void avaliaAlto() {
        corrida.avaliaMotorista(6);
        assertEquals(5, corrida.getNotaM());
    }
}

