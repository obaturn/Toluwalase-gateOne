from datetime import datetime 
from datetime import  timedelta

print("WELCOME TO OUR MENSTRAL APP")

period_started = str(input("enter the day your period started in (dd/mm/yyyy) "))

period_ended = str(input(' enter the last time your period ended in (dd/mm/yyyy) '))

cycle_length_in_days = int(input( '  enter the days that your cycle length do lasts in days : '))

format_date = '%d/%m/%Y'

started_period = datetime.strptime (period_started ,format_date)

ended_period = datetime.strptime (period_ended,format_date)

cycle_period_calculation = (ended_period - started_period).days

ovulation_day_calculation = cycle_period_calculation / 2 

safe_period_calculation = ovulation_day_calculation /2

next_menstrual_cycle_start = ended_period + timedelta(days = cycle_length_in_days)

next_menstrual_cycle_end  = next_menstrual_cycle_start + timedelta(days = cycle_period_calculation)

next_cycle_duration_calculation = ("next_menstrual_cycle start - next_menstrual_cycle_end")

next_ovulation_date_start = next_menstrual_cycle_end + timedelta(days = ovulation_day_calculation)

next_ovulation_date_end = next_ovulation_date_start + timedelta(days = safe_period_calculation)

next_safe_period_calculation  = next_ovulation_date_start + timedelta(days =1)

next_safe_period_before_next_menstruation_date = next_menstrual_cycle_start - timedelta(days = safe_period_calculation)

print("Safe period before next Menstruation Date: -",next_safe_period_before_next_menstruation_date, " till next menstruation starts.")

print("start_of_next_cycle : " , next_menstrual_cycle_start)

print("End of next cycle: ", next_menstrual_cycle_end)

print("First Safe Period after your next period: ", next_menstrual_cycle_end, " - ", next_menstrual_cycle_end + timedelta(days=safe_period_calculation))

print("Next Ovulation date: ", next_ovulation_date_end)

print("Last safe Period after your next period: ", next_safe_period_calculation  -  next_ovulation_date_end)


