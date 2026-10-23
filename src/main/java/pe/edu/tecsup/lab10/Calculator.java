package pe.edu.tecsup.lab10;
public class Calculator {
    public int sub(int i, int j) {
        return i - j;
    }
    public int add(int i, int j) {
        return i + j;
    }
    public int mul(int i, int j) {
        return i * j;
    }
    public int div(int i, int j) {
        if (j == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return i / j;
    }
}
