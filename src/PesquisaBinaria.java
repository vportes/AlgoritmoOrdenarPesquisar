public class PesquisaBinaria {
    public int pesquisar(int[] arr, int alvo) {
        return pesquisaBinaria(arr, alvo, 0, arr.length - 1);
    }

    private int pesquisaBinaria(int[] arr, int alvo, int baixo, int alto) {
        if (baixo > alto) {
            // se o indice baixo é maior que o indice alto, o alvo não é encontrado
            return -1;
        }

        int meio = (baixo + alto) / 2;
        if (arr[meio] == alvo) {
            // se o elemento do meio é o alvo, retorna o indice
            return meio;
        } else if (arr[meio] < alvo) {
            // se o elemento do meio é menor que o alvo, pesquisa a metade da direita
            return pesquisaBinaria(arr, alvo, meio + 1, alto);
        } else {
            // se o elemento do meio é maior que o alvo, pesquisa a metade da esquerda
            return pesquisaBinaria(arr, alvo, baixo, meio - 1);
        }
    }
}