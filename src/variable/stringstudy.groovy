package variable

/**
 * @author shenhan
 * @create 2019/10/20 14:39
 * @description
 */

//def name = 'shen\'a\'han'
//println name

def name = 'shenhan'
def real_name = "my name is ${name}"
def real_name_1 = 'my name is ${name}'
def real_name_2 = '''my name is ${name}'''
println(real_name.class)
println(real_name_1.class)
println(real_name_2.class)

def sum = "the sum of 2 and 3 equals ${2 + 3}"
println sum

def result = echo(real_name)
println(result)

static String echo(String message) {
    return message
}

def str = "groov"
def str2 = "groo"
//println str.center(8,'a')
println str>str2