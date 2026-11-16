package top.kzre.valuemapping;

/**
 * 平方根映射：y = sqrt(x)。
 * 对负输入返回 0。
 */
public final class SqrtMapper implements ValueMapper {
    private static final SqrtMapper INSTANCE = new SqrtMapper();

    private SqrtMapper() {}

    public static SqrtMapper instance() {
        return INSTANCE;
    }

    @Override
    public double map(double x) {
        return x <= 0.0 ? 0.0 : Math.sqrt(x);
    }
}