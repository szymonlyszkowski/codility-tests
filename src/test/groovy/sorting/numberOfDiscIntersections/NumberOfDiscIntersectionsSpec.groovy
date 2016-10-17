package sorting.numberOfDiscIntersections

import spock.lang.Ignore
import spock.lang.Specification


/**
 * Created by szymonidas on 10/17/16.
 */

class NumberOfDiscIntersectionsSpec extends Specification {
    @Ignore
    def "Test from example"(){
        expect:
        new Solution().solution([1, 5, 2, 1, 4, 0] as int []) == 11
    }

}