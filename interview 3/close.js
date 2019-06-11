function myFunc() {
    return function (e) {
        console.log(e)
    }
}

myFunc()("Hello")


function threeInARow(arr) {

    for (var i = 0; i < arr.length - 2; i++) {
        if (arr[i] + 1 == arr[i + 1]) {
            //if those are equal, check the next
            if (arr[i + 2] == arr[i] + 2) {
                return true
            } else {
                i++
            }
        }
    }

    return false
}
console.log(threeInARow([1, 2, 3, 4, 5, 8, 9, 0]))

function createPackage(small, big, goal) {
    //small = 1kg
    //big = 5kg
    //goal = x * kg

    if ((big * 5) + small < goal) {
        return -1
    } else {
        bigQty = Math.floor(goal / 5)
        return (goal - (bigQty * 5))
    }
}

console.log(createPackage(6, 2, 7))

function isPermute(a, b) {
    if (a.length !== b.length) {
        return false;
    }

    var letters = {},
        length = a.length;

    for (var x = 0; x < length; x++) {
        var l = a.charAt(x);
        letters[l] = (isNaN(letters[l]) ? 1 : letters[l] + 1);
    }

    for (var y = 0; y < length; y++) {
        var m = b.charAt(y);
        letters[m]--;
    }

    for (var z in letters) {
        if (letters[z] !== 0) {
            return false;
        }
    }

    return true;
}

console.log(isPermute("aaraa", "raaaa"))


