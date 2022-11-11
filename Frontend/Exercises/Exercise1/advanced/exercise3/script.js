class Student {
  #number;
  #grade;
  #status;

  constructor(number, grade) {
    this.number = number;
    this.grade = grade;
  }

  get number() {
    return this.#number;
  }

  set number(newNumber) {
    this.#number = newNumber;
  }

  get grade() {
    return this.#grade;
  }

  set grade(newGrade) {
    this.#grade = newGrade;
  }

  get status() {
    this.grade >= 70 ? (this.#status = "APROVADO") : (this.#status = "REPROVADO");
    return this.#status;
  }

  toString() {
    return `Aluno N° ${this.number} - Nota ${this.grade.toString()} [${
      this.status
    }]`;
  }
}

function createStudents(n) {
  let students = [];
  for (let i = 1; i <= n; i++) {
    let newStudent = new Student(i, Math.random() * 100);
    students.push(newStudent);
  }
  return students;
}


let studentsResult = ""
let totalApproved = 0
const students = createStudents(20);
for (let i = 0; i < students.length; i++) {
  const student = students[i];
  if (student.status == "APROVADO") {
    totalApproved += 1
  }
  studentsResult += student.toString() + "<br>";
}
const notApproved = students.length - totalApproved
approvedPercentage = totalApproved / students.length * 100
notApprovedPercentage = 100 - approvedPercentage

dataResult = `APROVADOS: ${totalApproved}(${approvedPercentage}%) | REPROVADOS: ${notApproved} (${notApprovedPercentage}%)`


document.getElementById("students").innerHTML = studentsResult
document.getElementById("data").innerHTML = dataResult