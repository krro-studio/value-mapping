package top.kzre.valuemapping;

/**
 * 三次方映射：y = x³。
 */
public final class CubicMapper implements ValueMapper {
    private static final CubicMapper INSTANCE = new CubicMapper();

    private CubicMapper() {}

    public static CubicMapper instance() {
        return INSTANCE;
    }

    @Override
    public double map(double x) {
        return x * x * x;
    }
}