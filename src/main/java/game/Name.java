package game;

public class Name {
    private final String name;

    public Name(String name) {
        if(name.length() > 5) throw new IllegalArgumentException("자동차의 이름은 5글자를 초과할 수 없습니다 : " + name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
