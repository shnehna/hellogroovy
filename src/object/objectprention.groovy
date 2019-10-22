package object

/**
 * @Author shenhan
 * @Date: 2019/10/22 23:17
 * @Description:
 */
def person = new Person(name: 'Shenhan',age: 27)
println "the name is ${person.name} , the age is ${person.age}"

person.increaseAge(10)

println person.age
person.defaultPlay()