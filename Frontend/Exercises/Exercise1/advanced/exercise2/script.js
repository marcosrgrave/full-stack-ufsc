function factorial(n, sum = 0) {
  sum == 0 ? (result = n) : (result = result);
  result *= n - 1;
  n = n - 1;
  if (n > 1) {
    factorial(n, result);
  }
  return result;
}

function getFactorial() {
  const n = parseInt(document.getElementById("number").value);

  const startTime = performance.now();
  const result = factorial(n);
  const endTime = performance.now();

  const totalTime = endTime - startTime;

  const resultMessage = `O fatorial de ${n} é: ${result}`;
  const timeMessage = `Tempo de processamento: ${totalTime} milisegundos`;
  const message = resultMessage + "<br>" + timeMessage;
  document.getElementById("result").innerHTML = message;
}
