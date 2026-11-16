package top.kzre.valuemapping;

import top.kzre.curve.bezier2d.Bezier2D;
import top.kzre.curve.bezier2d.Curve;
import top.kzre.curve.bezier2d.Pair;

/**
 * 贝塞尔曲线映射器：根据给定的 2D 贝塞尔曲线，将输入 t 映射到曲线上的 y 坐标。
 * 曲线应在 0 <= t <= 1 范围内定义，并且 x 坐标随 t 单调递增（通常用于 1D 映射）。
 */
public final class BezierMapper implements ValueMapper {
    private final Curve curve;

    public BezierMapper(Curve curve) {
        this.curve = curve;
    }

    @Override
    public double map(double x) {
        double t = Math.max(0.0, Math.min(1.0, x)); // 钳制到 [0,1]
        Pair p = Bezier2D.eval(curve, t);
        return p.getY(); // 注意：Pair 应该有 getY() 方法
    }
}