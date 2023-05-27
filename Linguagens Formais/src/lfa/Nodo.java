package lfa;

public class Nodo {
    private char dado;
    private Nodo prox;

    public Nodo(char dado) {
        this.dado = dado;
        this.prox = null;
    }

    public char getDado() {
        return dado;
    }

    public void setDado(char dado) {
        this.dado = dado;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }
}
