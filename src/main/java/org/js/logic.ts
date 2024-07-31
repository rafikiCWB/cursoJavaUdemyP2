let nome: string = "rafael"
console.log(nome)

type Person = {
    nome: string;
    dataAniversario: string;
    email: string;
    cpf: string;
};

function createPerson(nome: string, dataAniversario: string, email: string, cpf: string): Person {
    return {
        nome,
        dataAniversario,
        email,
        cpf
    };
}

console.log(createPerson("rafael", "1996-06-21", "@domain@email.com", "12345678910"))

console.log("---------------------")

// Create a Map with integer keys and string values
// @ts-ignore
let myMap = new Map<string, number>();

// Add some values to the Map
myMap.set(1, "Value 1");
myMap.set(2, "Value 2");
myMap.set(3, "Value 3");

// Iterate over the Map and log the entries
for (let [key, value] of myMap) {
    console.log(`Key: ${key}, Value: ${value}`);
}

console.log("-------------");
// @ts-ignore
let map = new Map<number, string>();
map.set(1, "rafael");
map.set(2, "rafael");
map.set(3, "rafael");

map.forEach((value: any, key: any) => {
    console.log(`key: ${key}, Value: ${value}`);
})


