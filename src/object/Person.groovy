package object

/**
 * @Author shenhan
 * @Date: 2019/10/22 23:14
 * @Description:
 */
class Person implements DefualtAction{
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }

    @Override
    void eat() {

    }

    static defaultPlay() {
        println "default playing"
    }
}
