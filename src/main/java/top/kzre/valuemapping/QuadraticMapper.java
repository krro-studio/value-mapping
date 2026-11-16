package top.kzre.valuemapping;

/**
 * 二次方映射：y = x²。
 */
public final class QuadraticMapper implements ValueMapper {
    private static final QuadraticMapper INSTANCE = new QuadraticMapper();

    private QuadraticMapper() {}

    public static QuadraticMapper instance() {
        return INSTANCE;
    }

    @Override
    public double map(double x) {
        return x * x;
    }
}