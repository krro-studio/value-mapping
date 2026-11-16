package top.kzre.valuemapping;

/**
 * 查找表映射器：使用一组键值对进行分段线性插值。
 * 键数组必须严格递增，值数组长度与键相同。
 */
public final class LookupTableMapper implements ValueMapper {
    private final double[] keys;
    private final double[] values;
    private final int n;

    public LookupTableMapper(double[] keys, double[] values) {
        if (keys.length != values.length || keys.length == 0) {
            throw new IllegalArgumentException("keys and values must have same non-zero length");
        }
        this.keys = keys.clone();
        this.values = values.clone();
        this.n = keys.length;
    }

    @Override
    public double map(double x) {
        if (x <= keys[0]) return values[0];
        if (x >= keys[n - 1]) return values[n - 1];

        // 二分查找区间
        int lo = 0, hi = n - 1;
        while (lo < hi - 1) {
            int mid = (lo + hi) >>> 1;
            if (keys[mid] <= x) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        double t = (x - keys[lo]) / (keys[hi] - keys[lo]);
        return values[lo] + t * (values[hi] - values[lo]);
    }
}