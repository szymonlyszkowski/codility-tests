package snail

import spock.lang.Specification


/**
 * Created by lyszkows on 18/10/2016.
 */
class SnailSpec extends Specification {

    def "Test debug"(){
        expect:
        new Snail().solution(13)
        new Snail().solution(13)
    }
}