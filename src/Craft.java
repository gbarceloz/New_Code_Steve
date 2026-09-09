public class Craft implements Picareta {

    @Override
    public void fabricarPicareta(String material) {
        if ("MADEIRA".equals(material)) {
            System.out.println("Fabricando picareta de madeira...");
        } else if ("COBRE".equals(material)) {
            System.out.println("Fabricando picareta de cobre...");
        } else if ("FERRO".equals(material)) {
            System.out.println("Fabricando picareta de ferro...");
        } else if ("OURO".equals(material)) {
            System.out.println("Fabricando picareta de ouro...");
        } else if ("DIAMANTE".equals(material)) {
            System.out.println("Fabricando picareta de diamante...");
        } else if ("NETHERITE".equals(material)) {
            System.out.println("Fabricando picareta de netherite...");
        } else {
            System.out.println("Material inválido para fabricar picareta.");
        }
    }

    @Override
    public void minerar(String material) {

    }

    @Override
    public void repararPicareta(String material) {


    }
}
