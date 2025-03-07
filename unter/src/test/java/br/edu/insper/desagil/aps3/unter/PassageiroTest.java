package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private static final double DELTA = 0.000001;
    @Test
    void constroi(){
        Passageiro p = new Passageiro("1234567", "Rafael");
        assertEquals("1234567",p.getCpf());
        assertEquals("Rafael", p.getNome());
    };




}

