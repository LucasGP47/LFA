package lfa;

public class Pilha {
    private Nodo topo;
    private int tamanho = 0;
    private int limite = 0;

    public Pilha(int limite) {
        this.limite = limite;
    }

    public char getTopo() {
        return topo.getDado();
    }

    public void setTopo(Nodo topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public boolean temEspaço() {
        return limite > tamanho;
    }

    public void push(char dado) {
        if (temEspaço()) {
            Nodo novo = new Nodo(dado);
            novo.setProx(topo);
            topo = novo;
            tamanho++;
            System.out.println(dado + " adicionado!");
        } else {
            System.out.println("Pilha cheia!!!");
        }
    }

    public char pop() {
    	if (!estaVazio()) {
            System.out.println(topo.getDado() + " retirado!");
            char a = topo.getDado();
            topo = topo.getProx();
            tamanho--;
            return a;
        } else {
            System.out.println("Pilha está vazia!");
            return 'z';
        }
    }

    String mostrarPilha() {
    	if (estaVazio()) {
            return "nulo";
        }
        StringBuilder sb = new StringBuilder();
        Nodo atual = topo;
        while (atual != null) {
            sb.append(atual.getDado());
            atual = atual.getProx();
        }
        return sb.toString();
    }
    
    String mostrarPilhaInversa() {
        if (estaVazio()) {
            return "nulo";
        }
        StringBuilder sb = new StringBuilder();
        Nodo atual = topo;
        while (atual != null) {
            sb.insert(0, atual.getDado());
            atual = atual.getProx();
        }
        return sb.toString();
    }
}


