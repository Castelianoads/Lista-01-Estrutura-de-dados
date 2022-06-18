import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(5);
        Vetor vetorLastIndexOf  = new Vetor(5);
        Vetor vetorRemove = new Vetor(5);
        Vetor vetorClear = new Vetor(5);
        Numero1 numero1 = new Numero1();
        Numero2 numero2 = new Numero2();
        Livro livro = new Livro();
        Pilha<String> pilhaDeLivros = new Pilha<>(20);
        Stack<Object> stackLivros = new Stack<>();

        vetor.adiciona("Leandro");
        vetor.adiciona("Roberto");
        vetor.adiciona("Joaquim");
        vetor.adiciona("Fernando");

        // Implemente um método contém, semelhante ao método contains da classe ArrayList;
        System.out.println("\nExercício 1.\n ");

        vetor.contem("Leandro"); // True
        vetor.contem("Leandru"); // False
        vetor.contem("Fernando"); // True
        vetor.contem("Joaquim"); // True

        // Implemente um método semelhante ao método lastIndexOf da classe ArrayList;
        System.out.println("\nExercício 2.\n ");

        vetorLastIndexOf.adiciona("Leandro");       // 0
        vetorLastIndexOf.adiciona("Alessandro");    // 1
        vetorLastIndexOf.adiciona("Roberto");       // 2
        vetorLastIndexOf.adiciona("Fofão");         // 3

        vetorLastIndexOf.lastIndexOf("Fofão");       // Return 3
        vetorLastIndexOf.lastIndexOf("Leandro");     // Return 0
        vetorLastIndexOf.lastIndexOf("Fofinho");     // Return -1

        // Implemente na classe Lista o método removeLast(T elemento), onde será possível remover o último elemento da lista..
        System.out.println("\nExercício 3.\n ");

        vetorRemove.adiciona("Astolfo");
        vetorRemove.adiciona("Rodolfo");
        vetorRemove.adiciona("Maldolfo");
        vetorRemove.adiciona("Juliana");

        System.out.println("Vetor com Rodolfo: " + vetorRemove);        // Vetor completo
        vetorRemove.removeLast("Rodolfo");   // Removendo o ultimo
        System.out.println("Vetor sem Rodolfo: " + vetorRemove);        // Vetor sem Rodolfo
        vetorRemove.removeLast("Jaqueline"); // Elemento inválido
        vetorRemove.removeLast("Juliana");   // Removendo o ultimo
        System.out.println("Vetor sem Rodolfo e Juliana: " + vetorRemove);        // Vetor sem Rodolfo

        // Implemente na classe Lista o método removeFirst(T elemento), onde será possível remover o primeiro elemento da lista..
        System.out.println("\nExercício 4.\n ");

        vetorRemove.adiciona("Astolfo");
        vetorRemove.adiciona("Rodolfo");
        vetorRemove.adiciona("Maldolfo");
        vetorRemove.adiciona("Juliana");

        System.out.println("Vetor com Rodolfo: " + vetorRemove);        // Vetor completo
        vetorRemove.removeFirst("Rodolfo");   // Removendo o primeiro
        System.out.println("Vetor sem Rodolfo: " + vetorRemove);        // Vetor sem Rodolfo
        vetorRemove.removeFirst("Jaqueline"); // Elemento inválido
        vetorRemove.removeFirst("Juliana");   // Removendo o primeiro
        System.out.println("Vetor sem Rodolfo e Juliana: " + vetorRemove);        // Vetor sem Rodolfo


        // Implemente o método limpar, onde todos os elementos da lista são removidos. Esse método é semelhante ao método clear da classe ArrayList;
        System.out.println("\nExercício 5.\n ");

        vetorClear.adiciona("Joaquim");
        vetorClear.adiciona("Francisco");
        vetorClear.adiciona("Marcio");
        vetorClear.adiciona("Helena");

        System.out.println(vetorClear); // Vetor completo
        vetorClear.clear();             // Limpando todo o vetor
        System.out.println(vetorClear); // Vetor limpo

        //  Utilizando a classe Lista e a classe contato e desenvolva os seguintes itens abaixo:
        System.out.println("\nExercício 6.\n ");

        // Crie uma Lista com capacidade para 20 contatos;

        Lista<Contato> listaContatos = new Lista<>(20);

        //Insira 30 contatos na lista;
        Contato contato01 = new Contato("Contato 1", "19-01", "contato01@gmail.com");
        Contato contato02 = new Contato("Contato 2", "19-02", "contato02@gmail.com");
        Contato contato03 = new Contato("Contato 3", "19-03", "contato03@gmail.com");
        Contato contato04 = new Contato("Contato 4", "19-04", "contato04@gmail.com");
        Contato contato05 = new Contato("Contato 5", "19-05", "contato05@gmail.com");
        Contato contato06 = new Contato("Contato 6", "19-06", "contato06@gmail.com");
        Contato contato07 = new Contato("Contato 7", "19-07", "contato07@gmail.com");
        Contato contato08 = new Contato("Contato 8", "19-08", "contato08@gmail.com");
        Contato contato09 = new Contato("Contato 9", "19-09", "contato09@gmail.com");
        Contato contato10 = new Contato("Contato 10", "19-10", "contato10@gmail.com");
        Contato contato11 = new Contato("Contato 11", "19-11", "contato11@gmail.com");
        Contato contato12 = new Contato("Contato 12", "19-12", "contato12@gmail.com");
        Contato contato13 = new Contato("Contato 13", "19-13", "contato13@gmail.com");
        Contato contato14 = new Contato("Contato 14", "19-14", "contato14@gmail.com");
        Contato contato15 = new Contato("Contato 15", "19-15", "contato15@gmail.com");
        Contato contato16 = new Contato("Contato 16", "19-16", "contato16@gmail.com");
        Contato contato17 = new Contato("Contato 17", "19-17", "contato17@gmail.com");
        Contato contato18 = new Contato("Contato 18", "19-18", "contato18@gmail.com");
        Contato contato19 = new Contato("Contato 19", "19-19", "contato19@gmail.com");
        Contato contato20 = new Contato("Contato 20", "19-20", "contato20@gmail.com");
        Contato contato21 = new Contato("Contato 21", "19-21", "contato21@gmail.com");
        Contato contato22 = new Contato("Contato 22", "19-22", "contato22@gmail.com");
        Contato contato23 = new Contato("Contato 23", "19-23", "contato23@gmail.com");
        Contato contato24 = new Contato("Contato 24", "19-24", "contato24@gmail.com");
        Contato contato25 = new Contato("Contato 25", "19-25", "contato25@gmail.com");
        Contato contato26 = new Contato("Contato 26", "19-26", "contato26@gmail.com");
        Contato contato27 = new Contato("Contato 27", "19-27", "contato27@gmail.com");
        Contato contato28 = new Contato("Contato 28", "19-28", "contato28@gmail.com");
        Contato contato29 = new Contato("Contato 29", "19-29", "contato29@gmail.com");
        Contato contato30 = new Contato("Contato 30", "19-30", "contato30@gmail.com");

        //  imprima todos os elementos da lista;

        listaContatos.adiciona(contato01);
        listaContatos.adiciona(contato02);
        listaContatos.adiciona(contato03);
        listaContatos.adiciona(contato04);
        listaContatos.adiciona(contato05);
        listaContatos.adiciona(contato06);
        listaContatos.adiciona(contato07);
        listaContatos.adiciona(contato08);
        listaContatos.adiciona(contato09);
        listaContatos.adiciona(contato10);
        listaContatos.adiciona(contato11);
        listaContatos.adiciona(contato12);
        listaContatos.adiciona(contato13);
        listaContatos.adiciona(contato14);
        listaContatos.adiciona(contato15);
        listaContatos.adiciona(contato16);
        listaContatos.adiciona(contato17);
        listaContatos.adiciona(contato18);
        listaContatos.adiciona(contato19);
        listaContatos.adiciona(contato20);
        listaContatos.adiciona(contato21);
        listaContatos.adiciona(contato22);
        listaContatos.adiciona(contato23);
        listaContatos.adiciona(contato24);
        listaContatos.adiciona(contato25);
        listaContatos.adiciona(contato26);
        listaContatos.adiciona(contato27);
        listaContatos.adiciona(contato28);
        listaContatos.adiciona(contato29);
        listaContatos.adiciona(contato30);

        System.out.println(listaContatos);

        // Utilizando a classe LinkedList refaça todos os itens da questão 5;
        System.out.println("\nExercício 7.\n ");

        LinkedList<Contato> linkedListContatos = new LinkedList<>();

        linkedListContatos.add(contato01);
        linkedListContatos.add(contato02);
        linkedListContatos.add(contato03);
        linkedListContatos.add(contato04);
        linkedListContatos.add(contato05);
        linkedListContatos.add(contato06);
        linkedListContatos.add(contato07);
        linkedListContatos.add(contato08);
        linkedListContatos.add(contato09);
        linkedListContatos.add(contato10);
        linkedListContatos.add(contato11);
        linkedListContatos.add(contato12);
        linkedListContatos.add(contato13);
        linkedListContatos.add(contato14);
        linkedListContatos.add(contato15);
        linkedListContatos.add(contato16);
        linkedListContatos.add(contato17);
        linkedListContatos.add(contato18);
        linkedListContatos.add(contato19);
        linkedListContatos.add(contato20);
        linkedListContatos.add(contato21);
        linkedListContatos.add(contato22);
        linkedListContatos.add(contato23);
        linkedListContatos.add(contato24);
        linkedListContatos.add(contato25);
        linkedListContatos.add(contato26);
        linkedListContatos.add(contato27);
        linkedListContatos.add(contato28);
        linkedListContatos.add(contato29);
        linkedListContatos.add(contato30);

        System.out.println(linkedListContatos);

        // Escreva um programa que leia dez números. Para cada número lido, verifique e implemente de acordo com as regras a seguir:
        System.out.println("\nExercício 8.\n ");

        numero1.empilhaPar(2);
        numero1.empilhaPar(54);
        numero1.empilhaPar(4);
        numero1.empilhaPar(12);
        numero1.empilhaPar(314);
        numero1.empilhaPar(23); // Tirou o 314
        numero1.empilhaPar(19); // Tirou o 12
        numero1.empilhaPar(18);

        System.out.println("Elementos empilhados: " + numero1);
        System.out.println("Elementos desempilhados: " + numero1);

        numero1.empilhaPar(2);
        numero1.empilhaPar(54);
        numero1.empilhaPar(4);
        numero1.empilhaPar(12);
        numero1.empilhaPar(314);
        numero1.empilhaPar(23); // Tirou o 314
        numero1.empilhaPar(19); // Tirou o 12
        numero1.empilhaPar(18);

        System.out.println("Elementos empilhados: " + numero1);
        System.out.println("Elementos desempilhados: " + numero1);
        System.out.println("Elementos desempilhados: " + numero1);

        // Escreva um programa que leia 10 números. Para cada número lido, verifique e implemente de acordo com as regras a seguir:
        System.out.println("\nExercício 9.\n ");
        numero2.empilhaParOuImpar(5);
        numero2.empilhaParOuImpar(2);
        numero2.empilhaParOuImpar(4);
        numero2.empilhaParOuImpar(3);
        numero2.empilhaParOuImpar(0); // Adicionando o 0
        numero2.empilhaParOuImpar(1);
        numero2.empilhaParOuImpar(7);
        numero2.empilhaParOuImpar(8);

        System.out.println(numero2);
        System.out.println("\n"+numero2); // Desemplilhando os elementos

        numero2.empilhaParOuImpar(5);
        numero2.empilhaParOuImpar(2);
        numero2.empilhaParOuImpar(4);
        numero2.empilhaParOuImpar(3);
        numero2.empilhaParOuImpar(0); // Adicionando o 0
        numero2.empilhaParOuImpar(1);
        numero2.empilhaParOuImpar(7);
        numero2.empilhaParOuImpar(8);

        System.out.println("\n"+numero2);
        System.out.println("\n"+numero2); // Desemplilhando os elementos

        // Utilize a classe Pilha e desenvolva os seguintes itens:
        System.out.println("\nExercício 10.\n ");

        Livro livro1 = new Livro("A ordem", 102456, "18/02/2019", "Roberto Gil");
        Livro livro2 = new Livro("O livro", 202456, "24/05/2020", "Leandro Gil");
        Livro livro3 = new Livro("Terra Plana", 452456, "09/08/2000", "Carlos Gil");
        Livro livro4 = new Livro("Terra Quadrada", 252456, "02/06/1995", "Wilbert Gil");
        Livro livro5 = new Livro("Assassins Creed", 962456, "17/07/1998", "Erick Gil");
        Livro livro6 = new Livro("Gof of War", 785456, "25/01/2001", "Jo Soares");
        System.out.println("A pilha está vazia? "+ pilhaDeLivros.estaVazia()+"\n");
        pilhaDeLivros.empilha(livro1);
        pilhaDeLivros.empilha(livro2);
        pilhaDeLivros.empilha(livro3);
        pilhaDeLivros.empilha(livro4);
        pilhaDeLivros.empilha(livro5);
        pilhaDeLivros.empilha(livro6);
        System.out.println(pilhaDeLivros);
        System.out.println("\nTamanho da pilha: "+ pilhaDeLivros.tamanho()+ "\n");
        pilhaDeLivros.desempilha();
        System.out.println(pilhaDeLivros);
        System.out.println("\nTamanho da pilha: "+ pilhaDeLivros.tamanho());
        System.out.println("A pilha está vazia? "+ pilhaDeLivros.estaVazia());

        // Repita o mesmo processo do exercício anterior, porém utilizando a classe Stack da API Java.
        System.out.println("\nExercício 11.\n ");
        System.out.println("A pilha está vazia? "+ stackLivros.isEmpty()+"\n");

        stackLivros.push(livro1);
        stackLivros.push(livro2);
        stackLivros.push(livro3);
        stackLivros.push(livro4);
        stackLivros.push(livro5);
        stackLivros.push(livro6);

        System.out.println(stackLivros);
        System.out.println("\nTamanho da pilha: "+ stackLivros.size()+ "\n");

        stackLivros.pop();
        System.out.println(stackLivros);
        System.out.println("\nTamanho da pilha: "+ stackLivros.size());
        System.out.println("A pilha está vazia? "+ stackLivros.isEmpty());
    }
}
