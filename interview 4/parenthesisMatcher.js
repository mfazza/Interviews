class Stack {
    constructor() {
        this.items = [];
    }

    sPush(element) {
        this.items.push(element);
    }

    sPop(element) {
        if (!this.isEmpty()) {
            this.items.pop();
        }
        else {
            console.log("The Stack is empty");
        }
    }

    isEmpty() {
        if (this.items.length === 0) {
            return true
        } else {
            return false
        }
    }

    sPeek() {
        return this.items[this.items.length - 1]
    }
}



function isTheExpBalanced(stack, seq) {

    for (var i = 0; i < seq.length; i++) {
        if (seq[i] == "(" || seq[i] == "{" || seq[i] == "[") {
            stack.sPush(seq[i])
        } else {
            if (stack.isEmpty()) {
                return false
            }
            stack.sPop()
        }
    }

    if (stack.isEmpty()) {
        return true
    } else {
        return false
    }
}


var sequence1 = "((){{})"
var sequence2 = "({{()}})"
var sequence3 = "(())"
var s1 = new Stack()

console.log(isTheExpBalanced(s1, sequence2));
