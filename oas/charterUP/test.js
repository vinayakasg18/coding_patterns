new Vue({
    el: "#app",
    data: {
    tests: [
    { name: "Test 1", myString: "xxxy", maxRepeat: 2, testCompleted: false, myResult: ""},
    { name: "Test 2", myString: "xxyy", maxRepeat: 1, testCompleted: false, myResult: "" },
    { name: "Test 3", myString: "xxxxyyyyxx", maxRepeat: 1, testCompleted: false, myResult: "" },
    { name: "Test 4", myString: "aaaabbbbccccdddd", maxRepeat: 1, testCompleted: false, myResult: ""},
    { name: "Test 5", myString: "aaaabbbbccccdddd", maxRepeat: 2, testCompleted: false, myResult: "" },
    { name: "Test 6", myString: "aaaabbbbccccdddd", maxRepeat: 3, testCompleted: false, myResult: "" },
    ]
    },
    methods: {
    formatString: function(test){
        //INSERT YOUR CODE HERE
        console.log(test);
        for (let k in Vue.data.tests){
            let out = k["myString"];
            let mr = k["maxRepeat"];
            console.log(out);
            console.log(mr);

            for (let i = 0; i < out.length; i++){
                console.log(out[mr]);
            }
        }
    }
    }
    })