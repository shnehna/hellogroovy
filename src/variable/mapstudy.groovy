package variable

/**
 * @author shenhan* @create 2019/10/22 18:41
 * @description
 */
def colors = [red: "ffff0000", green: "000fff", blue: 1221233]
//println colors["red"].class
println colors.red

colors.yellow = 'yellow'
colors.complex = [a: 1, b: 2]
println colors.getClass()

colors.remove()