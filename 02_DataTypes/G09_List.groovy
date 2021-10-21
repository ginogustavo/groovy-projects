def nums = [1,2,3,4,5,6,4,5,6,7,8,9]
println nums
println nums.class //java.util.ArrayList, so we coudl have declared it as ArrayList or List

List nums2 = [1,2,3,4,5,6,4,5,6,7,8,9] as LinkedList
println nums2.class // LinkedList

// add | remove | get | clear

//Add
nums.push(99)
nums.putAt(3,33)
nums[4] = 44
println nums + [20,30 ]//plus return a new object, operands remain unchanged
nums << 66

//Remove
nums.pop()
nums.removeAt(0)
def newList = nums - 4
println nums
println newList


//Get
println nums[2]
println nums.getAt(0..3) // we can supply a range

//Clearing
nums.clear()
nums = []
println nums


for(x in nums){
    println x
}


//flatten a list
assert [1,2,3,4,5] == [1,[2,3], [[4]], [], 5].flatten()

nums << [10,20,30]
nums << [100,200]

println nums  // [1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 8, 9, [10, 20, 30], [100, 200]]
println nums.flatten() //[1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 8, 9, 10, 20, 30, 100, 200]

//Duplicates
println nums.unique()

//def numbers = [4,5,6,1,2,3,4,5,6,7,8,9] as Set // java.util.LinkedHashSet
def numbers = [4,5,6,1,2,3,4,5,6,7,8,9] as SortedSet // java.util.TreeSet
println numbers
println numbers.class

