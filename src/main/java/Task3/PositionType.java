package Task3;

public enum PositionType {
    WORKER,
    MANAGER,
    SALER,
    HEAD;

    private int multiplier;

    PositionType() {
    }

    public int getMultiplier() {
        return multiplier;
    }
}
