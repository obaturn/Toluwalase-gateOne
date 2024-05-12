function calculateYears(daysgone , currentday){
let oldday = new date("January 1 , 2022 23:15:20")
let currentDay = new Date()
let currentDays = Today.getTime();
let daysgone = oldday.getTime();
let year =1000 * 60 * 60*365;
let yearsCalculation = (currentDays - currentday) / year
return years;
}
let result = getYears("January 1 , 2022 23:15:20" , new Date());
console.log(result);