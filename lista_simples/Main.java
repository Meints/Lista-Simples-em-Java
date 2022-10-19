public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println(lista);
        lista.inserirFinal("Henrique");
        lista.inserirInicio("Luccaku");
        lista.inserirInicio("Carlão");
        lista.inserirInicio("Alek");
        System.out.println(lista);
        System.out.println("Integrante Removido: " + lista.retirarInicio());
        System.out.println("Integrante Removido: " + lista.retirarFinal());
        System.out.println(lista);
        lista.inserirIndice(1, "Thiago");
        System.out.println(lista);
        System.out.println(lista.retirarIndice(2)); 
        System.out.println(lista);

    }
}
