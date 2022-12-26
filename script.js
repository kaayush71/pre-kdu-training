let count = 0;
const value = document.getElementById('count');
const incrementButton = document.getElementById('increment');
const decrementButton = document.getElementById('decrement');
incrementButton.addEventListener('click', () => {
  count += 1;
  value.innerHTML = count;
});
decrementButton.addEventListener('click', () => {
  count -= 1;
  value.innerHTML = count;
});
