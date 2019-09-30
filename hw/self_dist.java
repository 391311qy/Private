/** This is for calculating the distance between points (X0,Y0) 
and (X1,Y1). */
class self_dist {
    public static double dist (double x0, double y0, double x1, double y1) {
        return Math.sqrt(square_self(x1-x0) + square_self(y1-y0));
    }
}
