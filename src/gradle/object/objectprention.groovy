package gradle.object

/**
 * @Author shenhan* @Date: 2019/10/22 23:17
 * @Description:
 */
def person = new Person(name: 'Shenhan', age: 27)
//println "the name is ${person.name} , the age is ${person.age}"

//person.increaseAge(10)

//println person.age
//person.defaultPlay()

//println person.cry()

Person.metaClass.sex = "male"
//def person1 = new Person(name: 'Shenhan',age: 27)
//println person1.sex
Person.metaClass.sexUpperCase = { sex.toUpperCase() }
//println new Person().sexUpperCase()

Person.metaClass.static.createPerson = { name, age -> new Person(name: name, age: age) }
def personMM = Person.createPerson("liuliu", 20)
println personMM.name + " and " + personMM.sex
