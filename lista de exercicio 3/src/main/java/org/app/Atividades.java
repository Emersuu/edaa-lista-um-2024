package org.app;

import java.util.*;

import org.app.Entities.Pessoa;

class Atividades {
    Atividades() {
    }

    public static void Atividade1() {
        String[] nomes = new String[]{"Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio", "Breno Vinicius", "Vinícius Raphael", "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios", "Felipe dos Santos", "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva", "Henrique Cezar", "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira", "Marcus Paulo", "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino", "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique", "Vinicius Garcia", "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves", "Lucas Marques", "Marcela Maria"};
        Pessoa[] listaPessoas = new Pessoa[nomes.length];

        int cont;
        int j;
        for(cont = 0; cont < nomes.length - 1; ++cont) {
            for(j = 0; j < nomes.length - 1 - cont; ++j) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }

        for(cont = 0; cont <= nomes.length - 1; ++cont) {
            j = (new Random()).nextInt(1, 70);
            listaPessoas[cont] = new Pessoa(nomes[cont], j);
            System.out.println(listaPessoas[cont].getNome());
        }

    }

    // Insertion Sort
    @SuppressWarnings("resource")
    public static void Atividade2() {
        Scanner scanner = new Scanner(System.in);
        @SuppressWarnings({ "rawtypes", "unchecked" })
        final List<String> nomes = new ArrayList();
        boolean parar = false;

        while(!parar) {
            System.out.println("Nome pessoa:");
            String nome = scanner.nextLine();
            nomes.add(nome);
            System.out.println("Deseja parar? (y/n)");
            String escolha = scanner.nextLine();
            if (escolha.equals("y")) {
                parar = true;
            }
        }

        for (int i = 0; i < nomes.size() - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < nomes.size(); j++) {
                if (nomes.get(j).compareTo(nomes.get(indiceMenor)) < 0) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                String temp = nomes.get(i);
                nomes.set(i, nomes.get(indiceMenor));
                nomes.set(indiceMenor, temp);
            }
        }

        nomes.forEach(item -> System.out.println(item));
    }


    // Bubble Sort
    @SuppressWarnings("resource")
    public static void Atividade3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra qualquer: ");
        String palavra = scanner.nextLine();

        char[] letras = palavra.toCharArray();
        for(int i = 0; i < letras.length - 1; i++){
            for(int j = 0; j < letras.length - 1 - i; j++){
                if(letras[j] > letras[j + 1]){
                    char temp = letras[j];
                    letras[j] = letras[j + 1];
                    letras[j + 1] = temp;
                }
            }
        }

        System.out.println("Palavra ordenada: " + new String(letras));
    }


    //Selection Sort
    @SuppressWarnings("resource")
    public static void Atividade4() {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();

        boolean digitarNomes = true;
        while (digitarNomes){
            System.out.println("Digite um nome:");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.println("Deseja adicionar mais nomes? (s/n)");
            String escolha = scanner.nextLine();

            if(escolha.equals("n")){
                digitarNomes = false;
            }
        }

        int menorIndex;
        String aux;
        for(int i = 0; i < nomes.size() - 1; i++){
            menorIndex = i;
            for (int j = i + 1; j < nomes.size(); j++){
                if(nomes.get(j).length() < nomes.get(menorIndex).length()){
                    menorIndex = j;
                }
            }
            aux = nomes.get(menorIndex);
            nomes.set(menorIndex, nomes.get(i));
            nomes.set(i, aux);
        }

        nomes.forEach(item -> System.out.println(item));
    }

    // Quick Sort
    @SuppressWarnings("resource")
    public static void Atividade5() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String word = scanner.nextLine();


        char[] array = word.toCharArray();
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(char[] array, int startIndex, int endIndex) {

        char pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left <= right){
            while (array[left] < pivot){
                left++;
            }

            while (array[right] > pivot){
                right--;
            }

            if(left <= right){
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }

        }

        if(startIndex < right){
            quickSort(array, startIndex, right);
        }

        if(left < endIndex){
            quickSort(array, left, endIndex);
        }

    }
}
