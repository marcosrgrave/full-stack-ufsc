function updateText() {
  let txt = document.getElementById("input").value;
  if ("joão".includes(txt)) {
    document.getElementById("joao").classList.toggle("li-strong");
  } else {
    document.getElementById("joao").classList.toggle("li");
  }
}
