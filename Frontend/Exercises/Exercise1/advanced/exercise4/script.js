function getRandom(min, max) {
  return Math.random() * (max - min) + min;
}

function calcular() {
  const qtd = parseInt(document.getElementById("quantidadeNumeros").value);
  const vMin = parseInt(document.getElementById("valorMinimo").value);
  const vMax = parseInt(document.getElementById("valorMaximo").value);

  if (qtd >= vMin + vMax) {
    document.getElementById("results").innerHTML = "'Quantidade de Números' não permitida.";
    return;
  }

  let results = [];
  while (results.length < qtd) {
    const n = parseInt(getRandom(vMin, vMax + 1));
    if (n >= vMin && n <= vMax) {
      results.push(n);
    }
  }
  resultsString = "Resultados: " + results.sort().join(" - ");
  document.getElementById("results").innerHTML = resultsString;
}
