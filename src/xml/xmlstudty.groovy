package xml

import groovy.util.slurpersupport.GPathResult


/**
 * @author shenhan* @create 2019/10/23 11:03
 * @description
 */

final String xml = '''\n
<response>
    <value>
<option name = "1">
    <value>hahaha</value>
    <title>name</title>
</option>
<option name = "2">
    <value>hahah123a</value>
</option>
    </value>
</response>
'''

//开始解析xml数据

def xmlSluper = new XmlSlurper()
def text = xmlSluper.parseText(xml)
println text.value.option[0].title
println text.value.option[1].@name
//深度遍历 递归  **
text.depthFirst().findAll {}
text.'**'.findAll {}