//Sqrt(x)

import java.math.*;
import java.lang.Math;
class Solution {
    public int mySqrt(int x) {
        double sqroot= Math.pow(x, 0.5);
        int rounded = (int)Math.floor(sqroot);
        return rounded;
    }
}