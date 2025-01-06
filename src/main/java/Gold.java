public final class Gold {

    private final String name;
    private final String symbol;
    private final int atomicNumber;
    private final double atomicWeight;

    public Gold(String name, String symbol, int atomicNumber, double atomicWeight) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicWeight=" + atomicWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gold gold = (Gold) o;

        if (atomicNumber != gold.atomicNumber) return false;
        if (Double.compare(gold.atomicWeight, atomicWeight) != 0) return false;
        if (!name.equals(gold.name)) return false;
        return symbol.equals(gold.symbol);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + symbol.hashCode();
        result = 31 * result + atomicNumber;
        temp = Double.doubleToLongBits(atomicWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}