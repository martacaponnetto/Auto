public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1600, "AA222BB", "BMW", "X4");


        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());

    }
}

