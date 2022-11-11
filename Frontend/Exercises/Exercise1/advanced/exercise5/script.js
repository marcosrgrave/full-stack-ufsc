function isTriangle(a, b, c) {
  if (a < b + c && b < a + c && c < a + b) {
    console.log(true);
    return true;
  }
  console.log(false);
  return false;
}

function isEquilatero(a, b, c) {
  if (a == b && a == c) {
    console.log(true);
    return true;
  }
  console.log(false);
  return false;
}

function isIsoceles(a, b, c) {
  if (a == b || a == c || b == c) {
    console.log(true);
    return true;
  }
  console.log(false);
  return false;
}

function calcular() {
  const a = parseInt(document.getElementById("a").value);
  const b = parseInt(document.getElementById("b").value);
  const c = parseInt(document.getElementById("c").value);

  console.log(a, b, c);

  if (isTriangle(a, b, c)) {
    if (isEquilatero(a, b, c)) {
      document.getElementById("result").innerHTML = "EQUILÁTERO";
      return;
    } else if (isIsoceles(a, b, c)) {
      document.getElementById("result").innerHTML = "ISÓCELES";
      return;
    } else {
      document.getElementById("result").innerHTML = "ESCALENO";
      return;
    }
  } else {
    document.getElementById("result").innerHTML = "NÃO FORMA UM TRIÂNGULO";
  }
}
