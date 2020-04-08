package javaapplication20;

public class JavaApplication20 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gabriel", "CC");
        c1.abrirConta();
        c1.status();

        Cliente c2 = new Cliente("Jose", "CP");
        c2.abrirConta();
        c2.status();

    }

}
