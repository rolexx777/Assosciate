let userInputString = prompt("Enter numbers separated by commas:");


let userInputArray = userInputString.split(',').map(Number);


userInputArray.sort((a, b) => b - a);

console.log("Sorted in descending order:", userInputArray);
