public class Quicksort {
    public void ordenar(int[] matriz) {
        ordenar(matriz, 0, matriz.length - 1);
    }
    //metodo de ordenação, ordenará os numeros entre menores que o pivo de um lado e maiores que o pivo do outro
    private void ordenar(int[] matriz, int baixo, int alto) {
        if (baixo < alto) {
            //o pivo é o indice, e os numeros serão ordenados de cada lado dele
            int particaoIndice = particao(matriz, baixo, alto);
            //numeros menores que o pivo
            ordenar(matriz, baixo, particaoIndice - 1);
            //numeors maiores que o pivo
            ordenar(matriz, particaoIndice + 1, alto);
        }
    }
    //
    private int particao(int[] matriz, int baixo, int alto) {
        //o elemento mais alto sera o pivo, um metodo melhor seria usar a mediana dos elementos mas pra q complicar a vida
        int pivo = matriz[alto];
        int i = baixo - 1;
        for (int j = baixo; j < alto; j++) {
            //se o elemento atual for menor que o pivô
            if (matriz[j] < pivo) {
                i++;
                //troca os elementos para colocar os menores antes do , além de aumentar o indice (i)
                swap(matriz, i, j);
            }
        }
        swap(matriz, i + 1, alto);
        return i + 1;
    }
    //metodo de trocar dois valores usados em partição, deixado no fim do código para reusabilidade
    private void swap(int[] matriz, int i, int j) {
        int temp = matriz[i];
        matriz[i] = matriz[j];
        matriz[j] = temp;
    }
}