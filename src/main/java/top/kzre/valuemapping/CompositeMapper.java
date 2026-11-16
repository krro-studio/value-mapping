package top.kzre.valuemapping;

/**
 * 将两个映射器串联：y = mapper2.map(mapper1.map(x))
 */
public final class CompositeMapper implements ValueMapper {
    private final ValueMapper first;
    private final ValueMapper second;

    public CompositeMapper(ValueMapper first, ValueMapper second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public double map(double x) {
        return second.map(first.map(x));
    }
}