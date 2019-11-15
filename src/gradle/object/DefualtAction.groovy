package gradle.object

/**
 * @Author shenhan* @Date: 2019/10/22 23:25
 * @Description:
 */
trait DefualtAction {
    abstract void eat()

    void play() {
        println "playing"
    }
}
