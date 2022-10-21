const txt = document.getElementById("input").addEventListener("input", method);
const namesList = document.querySelectorAll("li");

function method(value) {
  updateText(value.target.value);
}

function updateText(word) {
  namesList.forEach(name => {
    item = name.innerHTML
    if (item.toLowerCase().startsWith(word.toLowerCase()) && word != "") {
      name.classList.add("li-strong");
    } else {
      name.classList.remove("li-strong")
    }
  });
}
