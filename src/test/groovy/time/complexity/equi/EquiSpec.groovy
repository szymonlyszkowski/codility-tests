package time.complexity.equi

import spock.lang.Specification



/**
 * Created by lyszkows on 15/10/2016.
 */
class EquiSpec extends Specification {

    def "Test"(){
        expect:
        new Solution().solution([-1, 3, -4, 5, 1, -6, 2, 1] as int[]) == 1
        new Solution().solution([1, 2, 3] as int[]) == 1
        new Solution().solution([1, 2, 4] as int[]) == -1
        new Solution().solution([1, 2, 1] as int []) == 1
    }

}