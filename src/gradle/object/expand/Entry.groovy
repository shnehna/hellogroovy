package gradle.object.expand

/**
 * @author shenhan* @create 2019/10/23 10:21
 * @description
 */
class Entry {
    static void main(def atgs) {
        println '应用程序正在启动'
        // 初始化
        ApplicationManager.init()
        println "初始化完成"
        def person = PersonManager.createPerson("shen", 19)
        println "name is ${person.name}, age is ${person.age}"
    }
}
