package time.complexity.tape.equilibrium.frog.jump;

/**
 * 100%
 */
public class Solution {

    public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }
        if ((Y - X) % D == 0) {
            return (Y - X) / D;
        }
        return (Y - X) / D + 1;
    }
}
