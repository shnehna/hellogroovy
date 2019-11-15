package gradle.json

import groovy.json.JsonSlurper

/**
 * @author shenhan* @create 2019/10/23 10:37
 * @description
 */
/*def list = [new Person(name: "Jhon", age: 12), new Person(name: "Lucy", age: 10)]
def gradle.json = JsonOutput.toJson(list)
def print = JsonOutput.prettyPrint(gradle.json)
def sulrper = new JsonSlurper()*/

def response = getNetworkData('http://yuexibo.top/yxbApp/home_data.gradle.json')

println response.data.head.name

def getNetworkData(String url) {
    //发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestProperty("method", "GET")
    connection.connect()
    def response = connection.content.text

    //解析
    def jsonSlurper = new JsonSlurper()
    return jsonSlurper.parseText(response)
}

