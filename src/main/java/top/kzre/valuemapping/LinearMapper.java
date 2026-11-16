package top.kzre.valuemapping;

/**
 * 线性映射：y = x。
 */
public final class LinearMapper implements ValueMapper {
    private static final LinearMapper INSTANCE = new LinearMapper();

    private LinearMapper() {}

    public static LinearMapper instance() {
        return INSTANCE;
    }

    @Override
    public double map(double x) {
        return x;
    }
}