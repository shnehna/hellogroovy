package variable

/**
 * @author shenhan* @create 2019/10/22 18:41
 * @description
 */
def colors = [red: "ffff0000", green: "000fff", blue: 1221233]
//println colors["red"].class
//println colors.red

colors.yellow = 'yellow'
colors.complex = [a: 1, b: 2]
//println colors.getClass()

//colors.remove()

def student = [
        1: [number: '0001', name: 'Bob', score: 55, sex: 'male'],
        2: [number: '0002', name: 'Johnny', score: 62, sex: 'female'],
        3: [number: '0003', name: 'Claire', score: 73, sex: 'female'],
        4: [number: '0004', name: 'Amy', score: 66, sex: 'male'],
]
// 遍历
/*student.each {
    i -> println "the key is ${i.key}, the value is ${i.value}"
}*/
/*
student.eachWithIndex { def i, int entry ->
    println "index is ${entry},the key ${i.key}, the value is ${i.value}"
}*/
/*
student.each {key,value->
    println "the key is ${key}, the value is ${value}"
}*/

// 查找
//def entry = student.find {i -> return i.value.score >=60}
def entry = student.findAll { i -> return i.value.score >= 60 }
println entry

def count = student.count { i -> return i.value.score >= 60 && i.value.sex == 'male'}
println(count)

def each = student.findAll { i -> return i.value.score >= 60 }.collect {return it.value.name}
println each