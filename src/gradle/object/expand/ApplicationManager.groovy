package gradle.object.expand

import object.Person

/**
 * @author shenhan* @create 2019/10/23 10:23
 * @description 模拟应用管理类
 */
class ApplicationManager {
    static void init() {
        ExpandoMetaClass.enableGlobally()
        Person.metaClass.static.createPerson = { name, age -> new Person(name: name, age: age) }
    }
}
