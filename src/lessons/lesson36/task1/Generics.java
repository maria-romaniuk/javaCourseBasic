package lessons.lesson36.task1;

public class Generics <T, N>{

    private T var1;
    private N var2;

    public Generics(T var1, N var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public N getVar2() {
        return var2;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public void setVar2(N var2) {
        this.var2 = var2;
    }
}
