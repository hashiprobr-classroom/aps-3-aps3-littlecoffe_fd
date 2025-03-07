package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central(){
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida){
        this.corridas.add(corrida);
    }


    public double mediaPassageiros(String cpfPassageiro){
        double mediaP = 0;
        int somaP = 0;
        int countcP = 0;
        for(Corrida corrida : corridas){
            if (corrida.getPassageiro().getCpf().equals(cpfPassageiro)) {
                int nota = corrida.getNotaP();

                somaP +=  nota;
                countcP +=1;
            }
        }
        mediaP = (double) somaP/countcP;
        return mediaP;
    }

    public double mediaMotoristas(String cpfMotorista){
        double mediaM = 0;
        int somaM = 0;
        int countcM = 0;

        for(Corrida corrida : corridas){
            if (corrida.getMotorista().getCpf().equals(cpfMotorista)) {
                int nota = corrida.getNotaM();
                somaM+= nota;
                countcM += 1;

            }
        }
        mediaM += (double) somaM / countcM;
        return mediaM;
    }
}