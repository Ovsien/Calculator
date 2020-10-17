package new_Calcalator;

public enum RomanNumber {
    M(1000),
    D(500),
    C(100),
    L(50),
    X(10),
    V(5),
    I(1);

    private final int numArabic;

    RomanNumber(int numArabic) {
        this.numArabic = numArabic;
    }

    public int getNumArabic() {
        return numArabic;
    }

    public String getMultyName(int num) {
        return this.name().repeat(Math.max(0, num));
    }
}
