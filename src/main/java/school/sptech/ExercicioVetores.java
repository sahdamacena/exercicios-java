package school.sptech;

public class ExercicioVetores {

    Integer somar(Integer[] vetor) {

        Integer soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    Double calcularMedia(Double[] notas) {

        Double soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    Integer buscarMaiorNumero(Integer[] vetor) {

        Integer maior = vetor[0];

        for(int i = 1; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
}
