package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    Central c;
    Passageiro p;
    Passageiro p1;
    Motorista m;
    Motorista m1;
    Corrida co;
    Corrida co1;
    Corrida co2;
    Corrida co3;
    Corrida co4;
    Corrida co5;

    @BeforeEach
    void setUp() {
        c = new Central();
    }

    @Test
    void nenhumaAvaliacaoPassageiro() {
        assertEquals(0,c.mediaPassageiros("12345678900"));
    }
    @Test
    void nenhumaAvaliacaoMotorista() {
        assertEquals(0,c.mediaMotoristas("12345678900"));
    }
    @Test
    void avaliacoesPassageiro() {
        p = new Passageiro("12345678900", "Rafael");
        p1 = new Passageiro("23456789011", "Stefane");
        co = new Corrida(p);
        co1 = new Corrida(p);
        co2 = new Corrida(p);
        co3 = new Corrida(p1);
        co1.avaliaPassageiro(4);
        c.adiciona(co1);
        co2.avaliaPassageiro(5);
        c.adiciona(co2);
        co3.avaliaPassageiro(3);
        c.adiciona(co3);

        assertEquals(4.5,c.mediaPassageiros("12345678900"));
    }
}
