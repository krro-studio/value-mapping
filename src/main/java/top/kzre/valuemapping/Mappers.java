package top.kzre.valuemapping;

import top.kzre.curve.bezier2d.Curve;

/**
 * 静态工厂方法，方便创建各种映射器。
 */
public final class Mappers {
    private Mappers() {}

    public static ValueMapper linear()               { return LinearMapper.instance(); }
    public static ValueMapper sigmoid()              { return SigmoidMapper.instance(); }
    public static ValueMapper quadratic()            { return QuadraticMapper.instance(); }
    public static ValueMapper cubic()                { return CubicMapper.instance(); }
    public static ValueMapper sqrt()                 { return SqrtMapper.instance(); }
    public static ValueMapper inverseSigmoid()       { return InverseSigmoidMapper.instance(); }

    public static ValueMapper bezier(Curve curve) {
        return new BezierMapper(curve);
    }

    public static ValueMapper lookupTable(double[] keys, double[] values) {
        return new LookupTableMapper(keys, values);
    }

    public static ValueMapper range(double inMin, double inMax, double outMin, double outMax) {
        return new RangeMapper(inMin, inMax, outMin, outMax);
    }

    public static ValueMapper clamp(ValueMapper mapper, double min, double max) {
        return new ClampMapper(mapper, min, max);
    }

    public static ValueMapper compose(ValueMapper first, ValueMapper second) {
        return new CompositeMapper(first, second);
    }
}