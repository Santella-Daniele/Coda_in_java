class Coda {
    private Nodo testa;
    private Nodo coda;
    private int cont;

    public Coda() {
        this.cont = 0;
        this.testa = null;
        this.coda = null;
    }

    public boolean verifica() {
        return this.cont == 0;
    }

    public void stampa()
    {
        Nodo c = this.testa;

        System.out.printf("[%d] ",this.cont);

        while (c != null) {
            System.out.printf("%d ---> ", c.valore);
            c = c.next;
        }
        System.out.printf("NULL\n");
    }

    public void aggiungi(int valore)
    {
        Nodo c = new Nodo(valore);

        this.cont++;

        if (this.testa == null) {
            this.testa = c;
        } else {
            this.coda.next = c;
        }

        this.coda = c;
    }

   
    public int clear()
    {
        int tmp;

        tmp = this.testa.valore;

        this.testa = this.testa.next;

        if (this.testa == null) {
            this.coda = null;
        }

        this.cont--;

        return tmp;
    }
};