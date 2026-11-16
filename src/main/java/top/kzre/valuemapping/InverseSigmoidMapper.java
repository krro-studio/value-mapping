package top.kzre.valuemapping;

/**
 * 反 Sigmoid：y = 1 - sigmoid(x) = exp(-x) / (1 + exp(-x))。
 */
public final class InverseSigmoidMapper implements ValueMapper {
    private static final InverseSigmoidMapper INSTANCE = new InverseSigmoidMapper();

    private InverseSigmoidMapper() {}

    public static InverseSigmoidMapper instance() {
        return INSTANCE;
    }

    @Override
    public double map(double x) {
        return 1.0 - 1.0 / (1.0 + Math.exp(-x));
    }
}