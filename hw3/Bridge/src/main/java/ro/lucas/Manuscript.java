package ro.lucas;

abstract class Manuscript {

    private Modifier mod;

    Manuscript(Modifier mod){
        this.mod = mod;
    }
    abstract public void print();
}
