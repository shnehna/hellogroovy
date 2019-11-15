package gradle.file

/**
 * @author shenhan* @create 2019/10/24 10:18
 * @description
 */
def file = new File('../../hellogroovy.iml')
/*gradle.file.eachLine {
    line -> println line
}*/

def text = file.getText()
//println text

def result = file.readLines()
//println result

def reader = file.withReader { reader ->
    char[] buffer = new char[100]
    reader.read(buffer)
    return buffer
}
println reader
