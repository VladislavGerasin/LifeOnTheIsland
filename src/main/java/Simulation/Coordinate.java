package Simulation;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Перемещает координаты на заданную величину по оси X и Y.
     *
     * @param dx изменение по оси X
     * @param dy изменение по оси Y
     */
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Проверяет, находятся ли две точки на одном месте.
     *
     * @param other другая точка для сравнения
     * @return true, если обе точки имеют одинаковые координаты
     */
    public boolean isSameLocation(Coordinate other) {
        if (other == null) {
            return false;
        }
        return this.x == other.getX() && this.y == other.getY();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
