package object

/**
 * @Author shenhan* @Date: 2019/10/22 23:14
 * @Description:
 */
class Person {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }

    /*@Override
    void eat() {

    }

    static defaultPlay() {
        println "default playing"
    }*/

    def invokeMethod(String name, Object args) {
        return "the method is ${name},the params is ${args}"
    }

    def methodMissing(String name, Object args) {
        return "Method ${name} is missing"
    }


}
