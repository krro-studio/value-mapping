package top.kzre.valuemapping;

/**
 * 线性范围映射：y = (x - inMin) / (inMax - inMin) * (outMax - outMin) + outMin
 */
public final class RangeMapper implements ValueMapper {
    private final double inMin, inMax, outMin, outMax;
    private final double scale;

    public RangeMapper(double inMin, double inMax, double outMin, double outMax) {
        this.inMin = inMin;
        this.inMax = inMax;
        this.outMin = outMin;
        this.outMax = outMax;
        this.scale = (outMax - outMin) / (inMax - inMin);
    }

    @Override
    public double map(double x) {
        return (x - inMin) * scale + outMin;
    }
}