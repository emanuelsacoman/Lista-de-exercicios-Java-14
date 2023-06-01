public class Main {
    public static void main(String[] args) {
        Series maisDois = new MaisDois();
        
        System.out.println("Série MaisDois:");
        for (int i = 0; i < 5; i++) {
            int value = maisDois.getNext();
            System.out.println(value);
        }
        
        maisDois.reset();
        System.out.println("\nSérie MaisDois após reset:");
        for (int i = 0; i < 5; i++) {
            int value = maisDois.getNext();
            System.out.println(value);
        }
        
        maisDois.setStart(100);
        System.out.println("\nSérie MaisDois após setStart(100):");
        for (int i = 0; i < 5; i++) {
            int value = maisDois.getNext();
            System.out.println(value);
        }
        
        System.out.println("\nSérie MaisDois novamente:");
        for (int i = 0; i < 5; i++) {
            int value = maisDois.getNext();
            System.out.println(value);
        }
        
        Series maisTres = new MaisTres();
        
        System.out.println("\nSérie MaisTres:");
        for (int i = 0; i < 5; i++) {
            int value = maisTres.getNext();
            System.out.println(value);
        }
        
        maisTres.reset();
        System.out.println("\nSérie MaisTres após reset:");
        for (int i = 0; i < 5; i++) {
            int value = maisTres.getNext();
            System.out.println(value);
        }
        
        maisTres.setStart(100);
        System.out.println("\nSérie MaisTres após setStart(100):");
        for (int i = 0; i < 5; i++) {
            int value = maisTres.getNext();
            System.out.println(value);
        }
    }
}