function tabuada(n) {
  let multiplications = "";

  for (let i = 1; i < 11; i++) {
    multiplications += `${n} * ${i} = ${n * i} <br>`;
  }
  return multiplications;
}

document.getElementById("btn-calcular").addEventListener("click", () => {
  let n = document.getElementById("input").value;
  document.getElementById("result").innerHTML = tabuada(n);
});
