/**
 * Projet : Notifium
 * Students : Raphaël Margueron / Fabien Mottier / Segan Salomon
 * Teacher : Aicha Rizzotti
 * Module : 3255.1-Developpement_mobile
 * Repository Git : https://github.com/HE-Arc/Notifium
 * Date : 25.01.2019
 */
package devmobile.hearc.ch.notifium.logicals.conditions;

import java.time.LocalDate;

import devmobile.hearc.ch.notifium.logicals.enums.ConditionType;

/**
 * Implements Condition_I
 * Used to raise an alert every n year
 */
public class ConditionDateEveryNYear implements Condition_I {

    private int year;
    private int dt;

    /**
     * Set a condition from the given date, every n year it will return true
     * @param date
     * @param dt Every n number of year
     */
    public ConditionDateEveryNYear(LocalDate date, int dt)
    {
        this.year = date.getYear();
        this.dt = dt;
    }

    /**
     * Set a condition from now, every n year it will return true
     * @param dt Every n number of year
     */
    public ConditionDateEveryNYear(int dt)
    {
        this(LocalDate.now(), dt);
    }

    /**
     * Evaluate current date with this condition date
     * @return True if now is after this condition date
     */
    public boolean evaluatePredicate()
    {
        LocalDate now =  LocalDate.now();
        int currentYear = now.getMonthValue();

        if(currentYear == year)
            return true;
        else if(currentYear > year)
        {
            int diff = currentYear - year;
            return diff % dt == 0;
        }
        else
            return false;
    }

    @Override
    public ConditionType getConditionType() {
        return ConditionType.DateEveryNYear;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() << 16) ^ (year ^ dt & 65535);
    }

}
