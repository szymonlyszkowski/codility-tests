package prefix_sums.countDiv
import spock.lang.Specification


/**
 * Created by lyszkows on 16/10/2016.
 */
class CountDivSpec extends Specification {

    def "Test from example"(){
        expect:
        new Solution().solution(6,11,2) == 3
        new Solution().solution(0,0,2) == 1
        new Solution().solution(0,1,2) == 1
        new Solution().solution(0,2,2) == 2
        new Solution().solution(2,2,2) == 1
        new Solution().solution(1,3,2) == 1
        new Solution().solution(1,4,2) == 2
        new Solution().solution(2,4,2) == 2
        new Solution().solution(2,5,2) == 2
     }

}