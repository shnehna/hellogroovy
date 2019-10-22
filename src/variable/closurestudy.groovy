package variable

//def closure = {println "Hello groovy ${it}" }
//closure.call()
//println(closure(123))
//
//int fab(int number) {
//    int result = 1
//    1.upto(number, { num -> result *= num })
//    result result
//}
//println fab(5)
//
//int cal(int number) {
//    def result = 0
//    number.times { i -> result += i }
//    return result
//}
//println cal(101)
//
//// 字符串和闭包的使用
//String str = 'the 2 and 3 is 5'
//str.each {i -> print i.multiply(2)}
//println str.find {i->i.isNumber()}
//println str.findAll {i->i.isNumber()}.toListString()
//println str.any {i->i.isNumber()}

// 闭包的重要变量：this owner delegate
/*def scriptClosure = {
    println "scriptClosure this: " + this // 代表闭包定义处的类
    println "scriptClosure owner: " + owner // 代表闭包定义处的类或者对象（闭包嵌套）
    println "scriptClosure delegate: " + delegate // 代表任意对象，默认值与owner指向的一致
}*/
//scriptClosure.call()
// 内部类
class Person {
    def classClosure = {
        println "classClosure this: " + this
        println "classClosure owner: " + owner
        println "classClosure delegate: " + delegate
    }

    def static say() {
        def classClosure = {
            println "methodClosure this: " + this
            println "methodClosure owner: " + owner
            println "methodClosure delegate: " + delegate
        }
        classClosure.call()
    }
}

Person p = new Person()
//new Person().classClosure.call()
//Person.say()

//闭包中定义闭包

def nextClosure = {
    def innerClosure = {
        println "innerClosure this: " + this
        println "innerClosure owner: " + owner
        println "innerClosure delegate: " + delegate
    }
    innerClosure.delegate = p
    innerClosure.call()
}

//nextClosure.call()
//委托策略
class Student {
    String name
    def pretty = {"my name is ${name}"}

    String toString() {
        pretty.call()
    }
}

class Teacher {
    String name
}

def stu = new Student(name: 'Sarash')
def tea = new Teacher(name: 'Shenhan')
//println stu.toString()
stu.pretty.delegate = tea
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()
