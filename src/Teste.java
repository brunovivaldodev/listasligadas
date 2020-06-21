import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ListaLigada lista;
        lista = new ListaLigada();


        lista.adicionaNoComeco("pedro");
        lista.adicionaNoComeco("joao");
        lista.adiciona("Ricardo");
        lista.adiciona(2,"Bruno");

        System.out.println(lista);
        System.out.println(lista.contem("Ricardo"));
        System.out.println(lista.pega(2));
        lista.removeDoComeco();
        System.out.println(lista);
        lista.removeDoFim();
        System.out.println(lista);
        System.out.println(lista.tamanho());
        lista.remove(1);
        System.out.println(lista);




    }

}
