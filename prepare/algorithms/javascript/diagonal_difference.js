// https://www.hackerrank.com/challenges/diagonal-difference
'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function (inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function () {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

function diagonalDifference(arr) {
    // Write your code here
    const d1 = []
    const d2 = []

    for (let i = 0; i < arr.length; i++) {
        d1.push(arr[i][i % arr.length])
        d2.push(arr[i][(arr.length - 1) - i % arr.length])
    }

    const sum1 = d1.reduce((prev, curr) => {
        return prev + curr
    }, 0)
    const sum2 = d2.reduce((prev, curr) => {
        return prev + curr
    }, 0)

    return Math.abs(sum1 - sum2)
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    let arr = Array(n);

    for (let i = 0; i < n; i++) {
        arr[i] = readLine().replace(/\s+$/g, '').split(' ').map(arrTemp => parseInt(arrTemp, 10));
    }

    const result = diagonalDifference(arr);

    ws.write(result + '\n');

    ws.end();
}
