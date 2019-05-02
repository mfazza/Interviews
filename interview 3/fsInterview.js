//initially, I had both methods inside the same function.  Then Pedro pointed out that I could decouple them (I was under the impression they should go in the same function because of the way the problem was set up)

const sampleTree = {
    a: 1,
    b: 1,
    c: {
        c1: 1,
        c2: 2
    }
}

var leaves = []

function pickLeaves(tree) {
    for (var key in tree) {
        if (tree[key] instanceof Object) {
            pickLeaves(tree[key])
        } else {
            leaves.push(tree[key])
        }
    }
}

function uniqueNodes(tree) {

    pickLeaves(tree)

    for (var i = 0; i < leaves.length - 1; i++) {

        if (leaves[i] !== leaves[i + 1]) {
            leaves = []
            return false
        } else {
            continue
        }
    }
    leaves = []
    return true
}

console.log(uniqueNodes(sampleTree));


//a better way to solve this is including the number comparisson into the pickLeaves function.  That was Garrett's suggestion I didn't see at the time, but makes much more sense and it's more optimal 
function pickLeaves2(tree, toCompare) {


    for (var key in tree) {

        if (tree[key] instanceof Object) {
            pickLeaves2(tree[key], toCompare)
        } else {
            if (tree[key] != toCompare) {
                result = false
                //return false doesn't work here, not sure why.  Therefore, I use the variable result as a workaround
            }
            continue
        }
    }

    return result

}

var result = true
console.log(pickLeaves2(sampleTree, sampleTree[Object.keys(sampleTree)[0]]));

//problem with the workaround using "result": you need to reset the valye of result each time the function is called