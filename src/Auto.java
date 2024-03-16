public class Auto {
    /**
     * SPZ
     */
    private String spz;
    /**
     * Barva
     */
    private String barva;

    /**
     * Inicializuje novou instanci
     *
     * @param spz   SPZ
     * @param barva Barva
     */
    public Auto(String spz, String barva) {
        this.spz = spz;
        this.barva = barva;
    }

    /**
     * Vrátí SPZ auta
     *
     * @return SPZ auta
     */
    public String vratSpz() {
        return spz;
    }

    /**
     * Zaparkuje auto do garáže
     *
     * @param garaz Garáž
     */
    public void zaparkuj(Garaz garaz) {
        garaz.vloz(this);
    }
}