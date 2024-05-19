const prompt = require('prompt-sync')();
const { format, parse, addDays, differenceInDays, add, sub, addYears } = require('date-fns');


const formatDate = (date) => format(date, 'dd/MM/yyyy');


const parseDate = (dateStr) => parse(dateStr, 'dd/MM/yyyy', new Date());

console.log("WELCOME TO OUR MENSTRUAL APP");

const periodStart = prompt("Enter the day your period starts (dd/mm/yyyy): ");
const periodEnd = prompt("Enter the last day your period ends (dd/mm/yyyy): ");
const cycleLength = parseInt(prompt("How many days does your menstrual cycle length take? ");

const start = parseDate(periodStart);
const end = parseDate(periodEnd);

const cyclePeriod = differenceInDays(end, start);
const ovulationDay = cycleLength / 2;
const safeDays = ovulationDay / 2;

const nextMenstrualCycleStart = addDays(end, cycleLength);
const nextMenstrualCycleEnd = addDays(nextMenstrualCycleStart, cyclePeriod);

const nextOvulationDate = addDays(nextMenstrualCycleEnd, ovulationDay);
const nextOvulationEndDate = addDays(nextOvulationDate, safeDays);
const nextSafePeriodStartDate = addDays(nextOvulationDate, 1);


console.log(`Start of next cycle: ${formatDate(nextMenstrualCycleStart)}`);
console.log(`End of next cycle: ${formatDate(nextMenstrualCycleEnd)}`);
console.log(`First Safe Period after your next period: ${formatDate(nextMenstrualCycleEnd)} - ${formatDate(addDays(nextMenstrualCycleEnd, safeDays))}`);
console.log(`Next Ovulation date: ${formatDate(nextOvulationDate)}`);
console.log(`Last safe Period after your next period: ${formatDate(nextSafePeriodStartDate)} - ${formatDate(nextOvulationEndDate)}`);
