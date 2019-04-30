var assert = require('assert');

/********************************
* Return true if the array contains, somewhere, three increasing
* adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
*
* See the asserts below for examples of input
* and expected output.
*
* If you have node installed, all you need to do to test
* your code is run: `node tripleThreat.js`. If you see errors,
* it is because the tests below did not pass. Once the
* tests do pass, you will see a log of `Success!`
*
* YOUR CODE BELOW HERE
********************************/
function tripleThreat(array) {

    // for (var i = 1; i < array.length - 1; i++) {
    //     if (array[i - 1] == array[i] - 1 && array[i] + 1 == array[i + 1]) {
    //         return true;
    //     } else {
    //         continue;
    //     }
    // }
    // return false;


    for (var j = 0; j < array.length - 1; j++) {

        if (array[j + 1] == array[j] + 1) {
            if (array[j + 2] == array[j] + 2) {
                return true;
            } else {
                //we can skip the next iteration since the 
                j++;
            }
        } else {
            continue;
        }
    }

    return false;

}


/********************************
* YOUR CODE ABOVE HERE
********************************/


assert.equal(
    tripleThreat([1, 4, 5, 6, 2]),
    true
);

assert.equal(
    tripleThreat([1, 2, 3]),
    true
);

assert.equal(
    tripleThreat([1, 2, 4, 5, 7, 6, 5, 6, 7, 6]),
    true
);

assert.equal(
    tripleThreat([1, 2, 4, 5, 7, 6, 5, 7, 7, 6]),
    false
);

assert.equal(
    tripleThreat([1, 2]),
    false
);

assert.equal(
    tripleThreat([10, 9, 8, -100, -99, -98, 100]),
    true
);

assert.equal(
    tripleThreat([10, 9, 8, -100, -99, 99, 100]),
    false
);

assert.equal(
    tripleThreat([3, 2, 6, 8, 9, 10]),
    true
);

assert.equal(
    tripleThreat([1, 5, 7, 2, 9, 5]),
    false
);

console.log('Success!');