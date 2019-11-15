package gradle.variable

def x = 12.5
switch (x) {
    case 'foo':
        result = 'found foo'
        break
    case 'bar':
        result = 'bar'
        break
    case [4, 5, 6, 'inlist']:
        result = 'list'
        break
    case 12..40:
        result = 'range'
        break
    case Integer:
        result = 'integer'
        break
    case BigDecimal:
        result = 'big decimal'
        break
    default:
        result = 'default'
        break
}
println result


//对范围的循环
def sum = 0
for (i in 0..9) {
    sum += i
}

for (i in [1, 2, 4, 6, 2]) {
    sum += i
}
println sum

for (i in ['ben': 1, 'luck': 2, 'nancy': 3]) {
    sum += i.value
}
