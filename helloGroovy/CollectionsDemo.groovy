// Collections

LinkedList l = [1,2,3]
println l
println l.class

l << 4
println l

l1 = l + [5,6,7]
println l1

l1 = l1 - [3,5,8,2,1]
println l1

l1.each {println it}

l1.reverseEach {println it}

l1.eachPermutation {println it}

// Sets and Maps

s = ['java','js','python','js'] as Set
println s
println s.class

m = [fruit:'apple',color:'red',price:20]
println m
m.each { k,v->
    println k
    println v    
}

println m.fruit
println m['color']
println m.get('price')

m.taste="sweet"
println m