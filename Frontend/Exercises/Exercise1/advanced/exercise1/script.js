function getMin() {
  return parseInt(document.getElementById("valorMinimo").value);
}

function getMax() {
  return parseInt(document.getElementById("valorMaximo").value);
}

function isMaxGreaterThanMin() {
  getMin() < getMax() ? (result = true) : (result = false);
  console.log(result);
  return result;
}

function differenceCount() {
  if (getMin() == NaN || getMax() == NaN) {
    document.getElementById("result").style.display = "none";
    return;
  }

  min = Math.min(getMin(), getMax());
  max = Math.max(getMin(), getMax());
  diff = max - min;

  text = document.getElementById("result").innerHTML;
  text = "Resultados: <br>";

  for (let n = min++; n < max; n++) {
    if (n % 2 == 0 && n % 3 == 0) {
      text += n + "<br>";
      document.getElementById("result").innerHTML = text;
    }
  }
}
