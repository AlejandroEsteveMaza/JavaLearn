package JuegoCartas;

public final class PrinterSingleton {

    private static PrinterSingleton instance;

    private PrinterSingleton() {
    }

    public static PrinterSingleton getInstance() {
        if (instance == null) {
            instance = new PrinterSingleton();
        }
        return instance;
    }

    public void printDebug(String text) {
        System.out.println("[DEBUG]: "+text);
    }

    public void print(String text) {
        System.out.println("[GAME]: "+text);
    }

}
