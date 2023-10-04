package game;

public class Position {
    private int position;
    private static final int INIT_POSITION = 0;

    public Position() {
        this(INIT_POSITION);
    }

    public Position(int position) {
        this.position = position;
    }

    public String getPosition() {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<this.position; i++) {
            result.append('-');
        }
        return result.toString();
    }

    public void move() {
        this.position += 1;
    }
}
