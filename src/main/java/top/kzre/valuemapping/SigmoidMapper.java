package top.kzre.valuemapping;

/**
 * 标准 Logistic Sigmoid：y = 1 / (1 + exp(-x))。
 * 输入通常在 0..1，但公式本身接受任意实数。
 */
public final class SigmoidMapper implements ValueMapper {
    private static final SigmoidMapper INSTANCE = new SigmoidMapper();

    private SigmoidMapper() {}

    public static SigmoidMapper instance() {
        return INSTANCE;
    }

    @Override
    public double map(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }
}