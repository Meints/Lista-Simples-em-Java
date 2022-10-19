public class ListaSimples {
    No inicio = null;
    int tamanho = 0;


    public void inserirInicio(String integrante) {
        No no = new No();
        no.integrante = integrante;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public String retirarInicio(){
        if (listaVazia()) {
            return null;
        }
        else{
            String integranteRemovido = inicio.integrante;
            inicio = inicio.proximo;
            tamanho--;
            return integranteRemovido;
        }
    }

    public void inserirFinal(String integrante){
        No no = new No();
        no.integrante = integrante;
        if (listaVazia()) {
            no.proximo = null;
            inicio = no;
        }
        else{
            No aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = no;
            no.proximo = null;
            tamanho++;
        }
    }

    public String retirarFinal(){
        if (listaVazia()) {
            return null;
        }
        else{
            No aux = inicio;
            while (aux.proximo != null) {
                No local = aux;
                aux = aux.proximo;
                if (aux.proximo == null) {
                    local.proximo = null;
                    tamanho--;
                return aux.integrante;
                }
            }
            inicio = null;
            tamanho--;
            return aux.integrante;
            
        }
    }

    public void inserirIndice(int indice, String integrante){
        if (indice <= 0) {
            inserirInicio(integrante);
        }
        else if (indice > tamanho) {
            inserirFinal(integrante);
        }
        else{
            No aux = inicio;
            for (int i = 0; i < indice-1; i++) {
                aux = aux.proximo;
            }
            No no = new No();
            no.integrante = integrante;
            no.proximo = aux.proximo;
            aux.proximo = no;
            tamanho++;
        }
    }

    public String retirarIndice(int indice){
        if (indice < 0 || listaVazia() || indice > tamanho) {
            return null;
        }
        else if (indice == 0) {
            return retirarInicio();
        }
        else if (indice == tamanho) {
            return retirarFinal();
        }
        else{
            No aux = inicio;
            for (int i = 0; i < indice-1; i++) {
                aux = aux.proximo; 
            }
            String integranteRemovido = aux.proximo.integrante;
            aux.proximo = aux.proximo.proximo;
            tamanho--;
            return integranteRemovido;
        }
    }

    public boolean listaVazia(){
        return inicio == null;
    }

    public String toString(){
        String str = "(" + tamanho + ") ";
        No aux = inicio;
        while (aux != null) {
            str += aux.integrante + "  ";
            aux = aux.proximo;
        }
        return str;
    }
}
