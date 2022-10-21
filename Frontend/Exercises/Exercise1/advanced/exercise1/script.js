// const valorMinimo = document
//   .getElementById("valorMinimo")
//   .addEventListener("input", nMin);
// const valorMaximo = document
//   .getElementById("valorMaximo")
//   .addEventListener("input", nMax);

// function nMin(value) {
//   min = value.target.value;
//   isMaxGreaterThanMin(min, max);
// }

// function nMax(value) {
//   max = value.target.value;
//   isMaxGreaterThanMin(min, max);
// }

function isMaxGreaterThanMin(min, max) {
  min = parseInt(document.getElementById("valorMinimo").value);
  max = parseInt(document.getElementById("valorMaximo").value);

  if (min < max) {
    console.log("True");
    return true;
  }
  console.log("False");
  return false;
}

function differenceCount() {
  console.log("FALTA IMPLEMENTAR");
}
