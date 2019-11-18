package gradle.object.expand

import gradle.object.Person

/**
 * @author shenhan* @create 2019/10/23 10:24
 * @description Person管理类
 */
class PersonManager {
    static Person createPerson(String name, int age) {
        return Person.createPerson(name, age)
    }
}
