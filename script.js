let first = document.getElementById('first');
let second = document.getElementById('second');

const addButton = document.getElementById('add');
const subButton = document.getElementById('sub');
const mulButton = document.getElementById('mul');
const divButton = document.getElementById('div');

addButton.addEventListener('click', () => {
  alert(parseInt(first.value) + parseInt(second.value));
});
subButton.addEventListener('click', () => {
  alert(parseInt(first.value) - parseInt(second.value));
});
mulButton.addEventListener('click', () => {
  alert(parseInt(first.value) * parseInt(second.value));
});
divButton.addEventListener('click', () => {
  alert(parseInt(first.value) / parseInt(second.value));
});
