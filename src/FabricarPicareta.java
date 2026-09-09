public class FabricarPicareta {
    public static Picareta fabricarPicareta(String material) {
        switch (material.toLowerCase()) {
            case "madeira":
                return new Picareta("Madeira", 59, 2);
            case "pedra":
                return new Picareta("Pedra", 131, 4);
            case "ferro":
                return new Picareta("Ferro", 250, 6);
            case "ouro":
                return new Picareta("Ouro", 32, 12);
            case "diamante":
                return new Picareta("Diamante", 1561, 8);
            default:
                System.out.println("Material inválido! Escolha entre: madeira, pedra, ferro, ouro ou diamante.");
                return null;
        }
    }
}
