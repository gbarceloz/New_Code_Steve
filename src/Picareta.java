public class Picareta {

    private String material;
    private int durabilidade;
    private int forca;

    public String getMaterial() {
        return material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public int getForca() {
        return forca;
    }

    public Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
    }

    public int minerar (int blocos){
        if (durabilidade <= 0){
            System.out.println("Picareta quebrada! Não é possível minerar.");
            return 0;
        }
        int minerados = 0;
        for (int i = 0; i < blocos; i++) {
            if (durabilidade > 0) {
                durabilidade--;
                minerados++;
            } else {
                System.out.println("Picareta quebrada! Não é possível minerar mais blocos.");
                break;
            }
        }
        return minerados;
    }

    public void exibirStatus() {
        System.out.println("Material: " + material);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Força: " + forca);
    }
}
