let cont = document.getElementById("box");

let text = ["Write a java program to create variable of type char, short, int, float and double. Each should be initialized and their values are displayed.",
    "Write a java program that declares integer variable and float variable.Initialize them, add and multiply both variables and print the output.",
    "Write a java program to swap two integer numbers.",
    "Write a java program to Check Even or Odd Integers.",
    "Write a Java Program to Find Largest Among 3 Numbers.",
    "Write a Java Program to Display All Prime Numbers from 1 to N.",
    "Write a Java Program to Check Leap Year",
    "Write a Java Program to Check Armstrong Number between Two Integers",
    "Write a Java Program to Check whether input character is vowel or consonant.",
    "Write a Java Program to Find Factorial of a number.",
    "Write a Java Program to Find Even Sum of Fibonacci Series Till number N.",
    "Write a Java Program to Calculate Simple Interest.",
    "Write a Java Program to Calculate Compound Interest",
    "Write a Java Program to Find the Perimeter of a Rectangle.",
    "Write a java program that initialize 1-D Array and display length of the array and its elements.",
    "Write a Java Program to Search an Element in an Array",
    "Write a Java Program to Find the Largest Element in an Array.",
    "Write a Java Program to Sort an Array.",
    "Write a Java Program to Sort the Elements of an Array in Descending Order",
    "Write a Java Program to Sort the Elements of an Array in Ascending Order.",
    "Write a Java Program to Remove All Occurrences of an Element in an Array",
    "Write a Java Program to Print a 2D Array",
    "Write a Java Program to Add, Sub, Mul, Div of Two Matrices. [use menu driven concept].",
    "Write a Java Program to Find the Transpose.",
    "Write a Java Program to Get a Character From the Given String.",
    "Write a Java Program to Replace a Character at a Specific Index.",
    "Write a Java Program to Reverse a string.",
    "Write a Java Program to Sort a string.",
    "Write a Java Program to Compare two strings",
    "Write a Java Program to Print even length words"];

function load() {
    let html = "";

    for (let i = 0, len = text.length; i < len; i++) {
        html += '<div class="btnBox"><span>' + (i + 1) + '</span><button onclick="pro(' + (i + 1) + ')">' + text[i] + '</button></div>';
    }

    cont.innerHTML = html;
}
load();

function pro(num) {
    cont.innerHTML = '<button id="back" onClick="load()">Back</button><iframe src="solution/pro' + num + '.java"></iframe>';
    let back = document.getElementById("back");
    back.style.display = "block";
}