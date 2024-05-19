from datetime import datetime , timedelta

print("WELCOME TO OUR MENSTRAL APP")

period_started = input("enter the day your period started in (dd/mm/yyyy) "),

period_ended = input(' enter the last time your period ended in (dd/mm/yyyy) '),

cycle_length_in_days = input( '  enter the days that your cycle length do lasts in days : '), 

start = datetime.strptime (period_started , "%d%m%y").date()

end = datetime.strptime (period_ended, " %d%m%y").date()

cycle_period_calculation = (end - start).days

ovulation_day_calculation = cycle_period_calculation / 2 

safe_period_calculation = ovulation_day_calculation /2

next_menstrual_cycle_start = end + timedelta(days = cycle_length_in_days)

next_menstrual_cycle_end  = next_menstrual_cycle_start + timedelta(days = cycle_period_calculation)

next_cycle_duration_calculation = ("next_menstrual_cycle start - next_menstrual_cycle_end").days

next-ovulution_date_start == next_mestrual_cycle_end + timedelta(days = ovulation_day_calculation)

next-ovulution_date_end == next-ovulution_date_start + timedelta(days = safe_period_calculation)

next_safe_period_calculation  = next-ovulution_date_start + timedelta(days =1)

next_safe_period_before_next_menstration_date = next_menstrual_cycle_start - timedelta(day = safe_period_calculation)

print("Safe period before next Menstruation Date: -", safe_period_before_next_menstruation_date, " till next menstruation starts.")

print("start_of_next_cycle : " , next_menstrual_cycle_start)

print("End of next cycle: ", next_menstrual_cycle_end)

print("First Safe Period after your next period: ", next_menstrual_cycle_end, " - ", next_menstrual_cycle_end + timedelta(days=safe_days))

print("Next Ovulation date: ", next_ovulation_date)

print("Last safe Period after your next period: ", next_safe_period_start_date, " - ", next_ovulation_end_date)


