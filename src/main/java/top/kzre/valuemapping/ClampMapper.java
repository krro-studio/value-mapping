package top.kzre.valuemapping;

/**
 * 钳位映射器：将另一个映射器的输出限制在 [min, max] 范围内。
 */
public final class ClampMapper implements ValueMapper {
    private final ValueMapper delegate;
    private final double min, max;

    public ClampMapper(ValueMapper delegate, double min, double max) {
        this.delegate = delegate;
        this.min = min;
        this.max = max;
    }

    @Override
    public double map(double x) {
        double y = delegate.map(x);
        return Math.max(min, Math.min(max, y));
    }
}