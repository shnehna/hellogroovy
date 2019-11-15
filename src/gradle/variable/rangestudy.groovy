package gradle.variable

/**
 * @Author shenhan* @Date: 2019/10/22 23:00
 * @Description:
 */

def range = 1..10
println range[0]
println range.contains(3)
println range.fromInt
println range.to
range.each { println it }

for (i in range) {
    println i
}
