package gradle.variable

/**
 * @author shenhan* @create 2019/10/22 18:10
 * @description
 */

//List list = new ArrayList()  //java 定义方式
def list = [-1, 2, -3, 3, 4, 5, 321, -12, 33, 2341]
def array = [1, 2, 3, 4, 5] as int[]

// 排序
//Collections.sort(list)
list.sort { a, b -> a == b ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1 }

def strList = ['asd', 'saw', 'ascqwe', 'bbvnasomfge']
strList.sort { it.size() }
//println strList

//查找
def findList = [-3, -2, 12, 33, 20]
//def find = findList.find { return it < -2 }

def findAll = findList.findAll { return it % 2 != 0 }

def count = findList.count { return it % 2 == 0 }
println count
