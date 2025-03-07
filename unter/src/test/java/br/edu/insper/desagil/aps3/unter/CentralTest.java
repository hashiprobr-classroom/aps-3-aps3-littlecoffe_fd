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
    @Test
    void avaliacoesMotorista() {
        m = new Motorista("12345678900", "Rafael");
        m1 = new Motorista("23456789011", "Stefane");
        co = new Corrida(p);
        co1 = new Corrida(p);
        co2 = new Corrida(p1);
        co3 = new Corrida(p1);
        co4 = new Corrida(p1);
        co.setMotorista(m);
        co1.setMotorista(m);
        co2.setMotorista(m1);
        co3.setMotorista(m1);
        co.avaliaMotorista(2);
        c.adiciona(co);
        co1.avaliaMotorista(3);
        c.adiciona(co1);
        co2.avaliaMotorista(1);
        c.adiciona(co2);
        co3.avaliaMotorista(1);
        c.adiciona(co3);
        co4.avaliaMotorista(1);
        assertEquals(2.5,c.mediaMotoristas("12345678900"));
    }
}
